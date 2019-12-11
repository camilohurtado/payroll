/**
 * 
 */
package com.masglobal.payroll.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.masglobal.payroll.dao.EmployeeDao;
import com.masglobal.payroll.model.Employee;
import com.masglobal.payroll.model.EmployeeList;

/**
 * @author camilo.hurtado
 *
 */
@Component
public class EmployeDaoImplEndpoint implements EmployeeDao{
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Employee> getEmployees() {
		ResponseEntity<Employee[]> resp = restTemplate.getForEntity("http://masglobaltestapi.azurewebsites.net/api/employees", Employee[].class);
		System.out.println(Arrays.deepToString(resp.getBody()));
		return (List<Employee>) Arrays.asList(resp.getBody());
	}
}
