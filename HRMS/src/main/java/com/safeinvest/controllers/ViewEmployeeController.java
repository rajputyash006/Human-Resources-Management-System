package com.safeinvest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
import com.safeinvest.services.ViewEmployeeService;

@RestController
@RequestMapping("/safeinvest")
public class ViewEmployeeController {
	
	@Autowired
	private ViewEmployeeService vemps;
	
	@GetMapping("/employeeMaster/{employeeCode}")
	public ResponseEntity<EmployeeMaster> getEmployeeMaster(@PathVariable String employeeCode) throws NoEmployeeMasterDataFound{
		EmployeeMaster empMaster = vemps.getEmployeeMaster(employeeCode);
		return new ResponseEntity<EmployeeMaster>(empMaster, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employeeBank/{employeeCode}")
    public ResponseEntity<EmployeeBank> getEmployeeBankDetails(@PathVariable String employeeCode) throws NoEmployeeBankDataFound{
    	EmployeeBank empBank = vemps.getEmployeeBankDetails(employeeCode);
		return new ResponseEntity<EmployeeBank>(empBank, HttpStatus.ACCEPTED);
    }
	
	@GetMapping("/employeeKYC/{employeeCode}")
	public ResponseEntity<EmployeeKYC> getEmployeeKYCDetails(@PathVariable String employeeCode) throws NoEmployeeKYCDataFound{
		EmployeeKYC empKyc = vemps.getEmployeeKYCDetails(employeeCode);
		return new ResponseEntity<EmployeeKYC>(empKyc, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employeeEmergency/{employeeCode}")
	public ResponseEntity<EmployeeEmergency> getEmployeeEmergencyDetails(@PathVariable String employeeCode) throws NoEmployeeEmergencyDataFound{
		EmployeeEmergency empEmg = vemps.getEmployeeEmergencyDetails(employeeCode);
		return new ResponseEntity<EmployeeEmergency>(empEmg , HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/employeeAddress/{employeeCode}")
	public ResponseEntity<List<EmployeeAddress>> getEmployeeAddress(@PathVariable String employeeCode) throws NoEmployeeAddressDataFound{
		List<EmployeeAddress> empAddress = vemps.getEmployeeAddressDetails(employeeCode);
		return new ResponseEntity<List<EmployeeAddress>>(empAddress, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employeeLanguage/{employeeCode}")
	public ResponseEntity<List<EmployeeLanguage>> getEmployeeLanguageDetails(@PathVariable String employeeCode) throws NoEmployeeLanguageDataFound{
		List<EmployeeLanguage> empLang = vemps.getEmployeeLanguageDetails(employeeCode);
		return new ResponseEntity<List<EmployeeLanguage>>(empLang, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employeeQualification/{employeeCode}")
	public ResponseEntity<List<EmployeeQualification>> getEmployeeQualificationDetails(@PathVariable String employeeCode) throws NoEmployeeQualificationDataFound{
		List<EmployeeQualification> empQua = vemps.getEmployeeQualificationDetails(employeeCode);
		return new ResponseEntity<List<EmployeeQualification>>(empQua, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employeeCertificate/{employeeCode}")
	public ResponseEntity<List<EmployeeExtraCertificate>> getEmployeeCertificationDetails(@PathVariable String employeeCode) throws NoEmployeeCertificateDataFound{
		List<EmployeeExtraCertificate> empCer = vemps.getEmployeeCertificationDetails(employeeCode);
		return new ResponseEntity<List<EmployeeExtraCertificate>>(empCer, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employeeExprience/{employeeCode}")
	public ResponseEntity<List<EmployeeExprience>> getEmployeeExperienceDetails(@PathVariable String employeeCode) throws NoEmployeeExperienceDataFound{
		List<EmployeeExprience> empExp = vemps.getEmployeeExperienceDetails(employeeCode);
		return new ResponseEntity<List<EmployeeExprience>>(empExp, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employeeRelation/{employeeCode}")
	public ResponseEntity<List<EmployeeRelation>> getEmployeeRelationDetails(@PathVariable String employeeCode) throws NoEmployeeRelationDataFound{
		List<EmployeeRelation> empRel = vemps.getEmployeeRelationDetails(employeeCode);
		return new ResponseEntity<List<EmployeeRelation>>(empRel, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employeeKRA/{employeeCode}")
	public ResponseEntity<List<EmployeeKRA>> getEmployeeKRADetails(@PathVariable String employeeCode) throws NoEmployeeKRADataFound{
		List<EmployeeKRA> empKRA = vemps.getEmployeeKRADetails(employeeCode);
		return new ResponseEntity<List<EmployeeKRA>>(empKRA, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employeeNominee/{employeeCode}")
	public ResponseEntity<List<EmployeeNominee>> getEmployeeNomineeDetails(@PathVariable String employeeCode) throws NoEmployeeNomineeDataFound{
		List<EmployeeNominee> empNomi = vemps.getEmployeeNomineeDetails(employeeCode);
		return new ResponseEntity<List<EmployeeNominee>>(empNomi, HttpStatus.ACCEPTED);
	}
	
	

}
