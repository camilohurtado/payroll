/**
 * 
 */
package com.masglobal.payroll.model;

/**
 * @author camilo.hurtado
 *
 */
public class Employee {
	
	private Long id;
	private String name;
	private String contractTypeName;
	private Long roleId;
	private String roleName;
	private String roleDescription;
	private Double hourlySalary;
	private Double monthlySalary;
	
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
