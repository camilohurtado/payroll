/**
 * 
 */
package com.masglobal.payroll.service.strategy.salary;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author camilo.hurtado
 *
 */
@Component
@Scope("prototype")
public class AnnualSalaryCalculator {
	
	private EmployeeSalaryStrategy salaryStrategy;
	
	public void setSalaryStrategy(EmployeeSalaryStrategy strategy) {
		this.salaryStrategy = strategy;
	}
	
	public Double calculateAnnualSalary(Double salary) {
		return salaryStrategy.calculateAnnualSalary(salary);
	}
}
