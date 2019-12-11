/**
 * 
 */
package com.masglobal.payroll.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masglobal.payroll.dto.factory.objects.EmployeeDto;
import com.masglobal.payroll.service.EmployeeService;

/**
 * @author camilo.hurtado
 *
 */
@Controller
@RequestMapping("/api")
public class EmployeeREST {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("")
	public String getPage(Model model){
		return "index";
	}
	
	@GetMapping("/employees")
	@ResponseBody
	public List<EmployeeDto> getEmployees(Model model){
		List<EmployeeDto> employees = employeeService.getAllEmployees();
		return employees;
	}
	
	@GetMapping("/employees/{id}")
	@ResponseBody
	public EmployeeDto getEmployeeById(@PathVariable("id") long employeeId, Model model){
		EmployeeDto employee = employeeService.getEmployeeById(employeeId);
		return employee;
	}
}
