/**
 * 
 */
package com.masglobal.payroll.service.strategy.salary;

import org.springframework.stereotype.Component;

/**
 * @author camilo.hurtado
 *
 */
@Component
public class HourlySalary implements EmployeeSalaryStrategy {

	@Override
	public Double calculateAnnualSalary(Double salary) {
		return 120 * salary * 12;
	}
}
