/**
 * 
 */
package com.masglobal.payroll.dto.factory.objects;

/**
 * @author camilo.hurtado
 *
 */
public class MonthlyEmployeeDto extends EmployeeDto{
	
	private Double monthlySalary;

	/**
	 * @return the monthlySalary
	 */
	public Double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @param monthlySalary the monthlySalary to set
	 */
	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	
}
