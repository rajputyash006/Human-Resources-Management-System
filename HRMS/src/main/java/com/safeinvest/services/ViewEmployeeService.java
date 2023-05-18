package com.safeinvest.services;

import java.util.List;


import com.safeinvest.exceptions.NoEmployeeDataFound;
import com.safeinvest.models.EmployeeAddress;
import com.safeinvest.models.EmployeeBank;
import com.safeinvest.models.EmployeeEmergency;
import com.safeinvest.models.EmployeeExprience;
import com.safeinvest.models.EmployeeExtraCertificate;
import com.safeinvest.models.EmployeeKRA;
import com.safeinvest.models.EmployeeKYC;
import com.safeinvest.models.EmployeeLanguage;
import com.safeinvest.models.EmployeeMaster;
import com.safeinvest.models.EmployeeNominee;
import com.safeinvest.models.EmployeeQualification;
import com.safeinvest.models.EmployeeRelation;

public interface ViewEmployeeService {
	
	public EmployeeMaster getEmployeeMaster(String employeeCode) throws NoEmployeeDataFound;

	public EmployeeBank getEmployeeBankDetails(String employeeCode) throws NoEmployeeDataFound;
	
	public EmployeeKYC getEmployeeKYCDetails(String employeeCode) throws NoEmployeeDataFound;
	
	public EmployeeEmergency getEmployeeEmergencyDetails(String employeeCode) throws NoEmployeeDataFound;
	
	public List<EmployeeAddress> getEmployeeAddressDetails(String employeeCode) throws NoEmployeeDataFound;
	
	public List<EmployeeLanguage> getEmployeeLanguageDetails(String employeeCode) throws NoEmployeeDataFound;
	
	public List<EmployeeQualification> getEmployeeQualificationDetails(String employeeCode) throws NoEmployeeDataFound;
	
	public List<EmployeeExtraCertificate> getEmployeeCertificationDetails(String employeeCode) throws NoEmployeeDataFound;
	
	public List<EmployeeExprience> getEmployeeExperienceDetails(String employeeCode) throws NoEmployeeDataFound;
	
	public List<EmployeeRelation> getEmployeeRelationDetails(String employeeCode) throws NoEmployeeDataFound;
	
	public List<EmployeeKRA> getEmployeeKRADetails(String employeeCode) throws NoEmployeeDataFound;
	
	public List<EmployeeNominee> getEmployeeNomineeDetails(String employeeCode) throws NoEmployeeDataFound;
	
	
}
