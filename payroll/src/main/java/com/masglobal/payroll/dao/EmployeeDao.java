package com.masglobal.payroll.dao;

import java.util.List;

import com.masglobal.payroll.model.Employee;

public interface EmployeeDao {
	
	List<Employee> getEmployees();

}
