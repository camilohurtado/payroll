/**
 * 
 */
package com.masglobal.payroll.dto.factory.objects;

/**
 * @author camilo.hurtado
 *
 */
public abstract class EmployeeDto {
	
	private Long id;
	private String name;
	private String contractTypeName;
	private Long roleId;
	private String roleName;
	private String roleDescription;
	private Double calculatedAnnualSalary;

	/**
	 * @return the calculatedAnnualSalary
	 */
	public Double getCalculatedAnnualSalary() {
		return calculatedAnnualSalary;
	}

	/**
	 * @param calculatedAnnualSalary the calculatedAnnualSalary to set
	 */
	public void setCalculatedAnnualSalary(Double calculatedAnnualSalary) {
		this.calculatedAnnualSalary = calculatedAnnualSalary;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the contractType
	 */
	public String getContractTypeName() {
		return contractTypeName;
	}

	/**
	 * @param contractType the contractType to set
	 */
	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	/**
	 * @return the roleId
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the roleDescription
	 */
	public String getRoleDescription() {
		return roleDescription;
	}

	/**
	 * @param roleDescription the roleDescription to set
	 */
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	
}
