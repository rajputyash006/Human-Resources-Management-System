package com.safeinvest.services;

import java.util.List;

import com.safeinvest.exceptions.NoEmployeeAddressDataFound;
import com.safeinvest.exceptions.NoEmployeeBankDataFound;
import com.safeinvest.exceptions.NoEmployeeCertificateDataFound;
import com.safeinvest.exceptions.NoEmployeeEmergencyDataFound;
import com.safeinvest.exceptions.NoEmployeeExperienceDataFound;
import com.safeinvest.exceptions.NoEmployeeKRADataFound;
import com.safeinvest.exceptions.NoEmployeeKYCDataFound;
import com.safeinvest.exceptions.NoEmployeeLanguageDataFound;
import com.safeinvest.exceptions.NoEmployeeMasterDataFound;
import com.safeinvest.exceptions.NoEmployeeNomineeDataFound;
import com.safeinvest.exceptions.NoEmployeeQualificationDataFound;
import com.safeinvest.exceptions.NoEmployeeRelationDataFound;
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
	
	public EmployeeMaster getEmployeeMaster(String employeeCode) throws NoEmployeeMasterDataFound;

	public EmployeeBank getEmployeeBankDetails(String employeeCode) throws NoEmployeeBankDataFound;
	
	public EmployeeKYC getEmployeeKYCDetails(String employeeCode) throws NoEmployeeKYCDataFound;
	
	public EmployeeEmergency getEmployeeEmergencyDetails(String employeeCode) throws NoEmployeeEmergencyDataFound;
	
	public List<EmployeeAddress> getEmployeeAddressDetails(String employeeCode) throws NoEmployeeAddressDataFound;
	
	public List<EmployeeLanguage> getEmployeeLanguageDetails(String employeeCode) throws NoEmployeeLanguageDataFound;
	
	public List<EmployeeQualification> getEmployeeQualificationDetails(String employeeCode) throws NoEmployeeQualificationDataFound;
	
	public List<EmployeeExtraCertificate> getEmployeeCertificationDetails(String employeeCode) throws NoEmployeeCertificateDataFound;
	
	public List<EmployeeExprience> getEmployeeExperienceDetails(String employeeCode) throws NoEmployeeExperienceDataFound;
	
	public List<EmployeeRelation> getEmployeeRelationDetails(String employeeCode) throws NoEmployeeRelationDataFound;
	
	public List<EmployeeKRA> getEmployeeKRADetails(String employeeCode) throws NoEmployeeKRADataFound;
	
	public List<EmployeeNominee> getEmployeeNomineeDetails(String employeeCode) throws NoEmployeeNomineeDataFound;
	
	
}
