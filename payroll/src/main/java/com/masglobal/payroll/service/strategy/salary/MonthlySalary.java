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
public class MonthlySalary implements EmployeeSalaryStrategy {

	@Override
	public Double calculateAnnualSalary(Double salary) {
		return salary * 12;
	}

}
