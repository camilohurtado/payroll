/**
 * 
 */
package com.masglobal.payroll.dto.factory.objects;

/**
 * @author camilo.hurtado
 *
 */
public class HourlyEmployeeDto extends EmployeeDto {
	
	private Double hourlySalary;

	/**
	 * @return the hourlySalary
	 */
	public Double getHourlySalary() {
		return hourlySalary;
	}

	/**
	 * @param hourlySalary the hourlySalary to set
	 */
	public void setHourlySalary(Double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
}
