package com.masglobal.payroll.service;

import java.util.List;

import com.masglobal.payroll.dto.factory.objects.EmployeeDto;

public interface EmployeeService {

	List<EmployeeDto> getAllEmployees();
	EmployeeDto getEmployeeById(long id);

}
