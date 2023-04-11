package com.safeinvest.services;


import com.safeinvest.dtos.Employee;
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

public interface EmployeeService {
	
	public String saveEmployee(Employee employee);
	
	public String saveEmployeeMasterDetails(String userName, EmployeeMaster employeeMaster);
	
	public String saveEmployeeBankDetails(String userName, EmployeeBank employeeBank);
	
	public String saveEmployeeKYCDetails(String userName, EmployeeKYC employeeKYC);
	
	public String saveEmployeeEmergencyDetails(String userName, EmployeeEmergency employeeEmergency);
	
	public String saveEmployeeAddressDetails(String userName, EmployeeAddress employeeAddress);
	
	public String saveEmployeeLanguageDetails(String userName, EmployeeLanguage employeeLanguage);
	
	public String saveEmployeeQualificationDetails(String userName, EmployeeQualification employeeQualification);
	
	public String saveEmployeeCertificationDetails(String userName, EmployeeExtraCertificate employeeExtraCertificate);
	
	public String saveEmployeeExperienceDetails(String userName, EmployeeExprience employeeExprience);
	
	public String saveEmployeeRelationDetails(String userName, EmployeeRelation employeeRelation);
	
	public String saveEmployeeKRADetails(String userName, EmployeeKRA employeeKRA);
	
	public String saveEmployeeNomineeDetails(String userName, EmployeeNominee employeeNominee);
	
	
}
