/**
 * 
 */
package com.masglobal.payroll;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import com.masglobal.payroll.dao.EmployeeDao;
import com.masglobal.payroll.model.Employee;
import com.masglobal.payroll.service.EmployeeService;
import com.masglobal.payroll.service.impl.EmployeeServiceImpl;

/**
 * @author camilo.hurtado
 *
 */
@SpringBootTest
public class PayrollServiceTest {

	private List<Employee> employees = new ArrayList<>();

	@Mock
	private EmployeeDao employeeDao;

	@InjectMocks
	private EmployeeServiceImpl employeeService;

	@BeforeTestMethod
	public void initData() {
		// Prepare data
		Employee emp1 = new Employee();
		emp1.setContractTypeName("MonthlySalaryEmployee");
		emp1.setName("Emp1");
		emp1.setRoleId(1L);
		emp1.setRoleName("Administrator");
		emp1.setId(1L);
		emp1.setHourlySalary(60000.0);
		emp1.setMonthlySalary(80000.0);

		employees.add(emp1);

	}

	@Test
	public void getAllEmployees_noIdProvided_shouldReturnAllData() {
		Mockito.when(employeeDao.getEmployees()).thenReturn(employees);

		employeeService.getAllEmployees();
		Mockito.verify(employeeDao, Mockito.atLeastOnce()).getEmployees();
	}
}
