/**
 * 
 */
package com.masglobal.payroll.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masglobal.payroll.constants.Constants;
import com.masglobal.payroll.dao.EmployeeDao;
import com.masglobal.payroll.dto.factory.creator.BaseContractTypeFactory;
import com.masglobal.payroll.dto.factory.objects.EmployeeDto;
import com.masglobal.payroll.model.Employee;
import com.masglobal.payroll.service.EmployeeService;
import com.masglobal.payroll.service.strategy.salary.AnnualSalaryCalculator;
import com.masglobal.payroll.service.strategy.salary.HourlySalary;
import com.masglobal.payroll.service.strategy.salary.MonthlySalary;

/**
 * @author camilo.hurtado
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	BaseContractTypeFactory contractTypeService;

	@Autowired
	AnnualSalaryCalculator annualSalaryCalculator;

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<EmployeeDto> employeesDto = new ArrayList<>();
		employeeDao.getEmployees().stream().forEach(employeeModel -> {
			employeesDto.add(infoMapping(employeeModel));
		});
		return employeesDto;
	}
	
	@Override
	public EmployeeDto getEmployeeById(long id) {
		Employee employee = employeeDao.getEmployees().stream()
				.filter(employeeModel -> employeeModel.getRoleId().equals(id)).findFirst().orElse(null);
		return infoMapping(employee);

	}

	public EmployeeDto infoMapping(Employee employee) {
		if (employee != null) {
			annualSalaryCalculator.setSalaryStrategy(
					employee.getContractTypeName().equals(Constants.HOURLY_CONTRACT_TYPE) ? new HourlySalary()
							: new MonthlySalary());
			EmployeeDto employeeDto = contractTypeService.getContractTypeEmployee(employee.getContractTypeName());
			BeanUtils.copyProperties(employee, employeeDto);
			employeeDto.setCalculatedAnnualSalary(annualSalaryCalculator.calculateAnnualSalary(
					employee.getContractTypeName().equals(Constants.HOURLY_CONTRACT_TYPE) ? employee.getHourlySalary()
							: employee.getMonthlySalary()));
			return employeeDto;
		}
		return null;
	}
}
