/**
 * 
 */
package com.masglobal.payroll.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masglobal.payroll.dto.factory.objects.EmployeeDto;
import com.masglobal.payroll.service.EmployeeService;

/**
 * @author camilo.hurtado
 *
 */
@RestController
@RequestMapping("/api")
public class EmployeeREST {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public ResponseEntity<?> getEmployees(){
		List<EmployeeDto> employees = employeeService.getAllEmployees();
		return new ResponseEntity<List<EmployeeDto>>(employees, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") long employeeId){
		EmployeeDto employees = employeeService.getEmployeeById(employeeId);
		return new ResponseEntity<EmployeeDto>(employees, HttpStatus.ACCEPTED);
	}
}
