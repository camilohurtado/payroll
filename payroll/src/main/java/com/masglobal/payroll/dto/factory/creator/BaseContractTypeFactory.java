package com.masglobal.payroll.dto.factory.creator;

import com.masglobal.payroll.dto.factory.objects.EmployeeDto;

public interface BaseContractTypeFactory {

	EmployeeDto getContractTypeEmployee(String contractType);

}