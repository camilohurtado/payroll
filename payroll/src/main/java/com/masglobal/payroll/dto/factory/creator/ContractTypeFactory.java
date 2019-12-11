/**
 * 
 */
package com.masglobal.payroll.dto.factory.creator;

import org.springframework.stereotype.Component;

import com.masglobal.payroll.constants.Constants;
import com.masglobal.payroll.dto.factory.objects.EmployeeDto;
import com.masglobal.payroll.dto.factory.objects.HourlyEmployeeDto;
import com.masglobal.payroll.dto.factory.objects.MonthlyEmployeeDto;

/**
 * @author camilo.hurtado
 *
 */
@Component
public class ContractTypeFactory implements BaseContractTypeFactory {

	@Override
	public EmployeeDto getContractTypeEmployee(String contractType) {
		switch(contractType) {
		case Constants.HOURLY_CONTRACT_TYPE : 
			return new HourlyEmployeeDto();
		case Constants.MONTHLY_CONTRACT_TYPE :
			return new MonthlyEmployeeDto();
		}
		return null;
	}

}
