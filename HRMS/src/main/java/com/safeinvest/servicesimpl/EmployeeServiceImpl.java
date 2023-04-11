package com.safeinvest.servicesimpl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.safeinvest.dtos.Employee;
import com.safeinvest.dtos.ObjectCreation;
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
import com.safeinvest.services.EmployeeService;

@Repository
public class EmployeeServiceImpl implements EmployeeService{

	private static String insert_MasterEmployee_Sql="insert into tbl_employee_master "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeBankDetails_Sql="insert into tbl_employee_bank "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeKYCDetails_Sql="insert into tbl_employee_kyc "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	private static String insert_EmployeeEmergencyDetails_Sql="insert into tbl_employee_emergency "
			+ "values(?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeAddressDetails_Sql="insert into tbl_employee_address "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeLanguageDetails_Sql="insert into tbl_employee_language "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeQualificationDetails_Sql="insert into tbl_employee_qualification "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeCertificationDetails_Sql="insert into tbl_employee_extra_certificate "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeExperienceDetails_Sql="insert into tbl_employee_exprience "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeRelationDetails_Sql="insert into tbl_employee_relation "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeKRADetails_Sql="insert into tbl_employee_kra "
			+ "values(?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String insert_EmployeeNomineeDetails_Sql="insert into tbl_employee_nominee "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Autowired
	private ObjectCreation o;
	
	@Override
	public String saveEmployee(Employee employee) {
		
		System.out.println("Inside save method of employee");
		
		String message="Something happen wrong try again.....";
		
		int total_Share=0;
		
		if(employee.getNomineeList().size()>0) {
			for(EmployeeNominee nominee:employee.getNomineeList()) {
				total_Share+=Integer.valueOf(nominee.getShare());
			}
		}
		
		if(total_Share==100) {
			
			String empMaster = saveEmployeeMasterDetails(employee.getUserName(), o.getEmployeeMaster(employee));
			
			System.out.println(empMaster);
			
			String empBank = saveEmployeeBankDetails(employee.getUserName(), o.getEmployeeBank(employee));
			
			System.out.println(empBank);
			
			String empKYC = saveEmployeeKYCDetails(employee.getUserName(), o.getEmployeeKYC(employee));
			
			System.out.println(empKYC);
			
			String empEme = saveEmployeeEmergencyDetails(employee.getUserName(), o.getEmployeeEmergency(employee));
			
			System.out.println(empEme);
			
			List<EmployeeAddress> empAddress=employee.getAddressList();
			
			for(int i=0;i<empAddress.size();i++) {
				String empAdd = saveEmployeeAddressDetails(employee.getUserName(), empAddress.get(i));
				System.out.println(empAdd);
			}
			
			
			List<EmployeeLanguage> empLanguages=employee.getLanguageList();
			
			for(int i=0;i<empLanguages.size();i++) {
				String empLang = saveEmployeeLanguageDetails(employee.getUserName(), empLanguages.get(i));
				System.out.println(empLang);
			}
			
			List<EmployeeQualification> empQualifications=employee.getQualificationList();
			
			for(int i=0;i<empQualifications.size();i++) {
				String empQue = saveEmployeeQualificationDetails(employee.getUserName(), empQualifications.get(i));
				System.out.println(empQue);
			}
			
			List<EmployeeExtraCertificate> empExtraCertificates=employee.getCertificateList();
			
			for(int i=0;i<empExtraCertificates.size();i++) {
				String empCerti = saveEmployeeCertificationDetails(employee.getUserName(), empExtraCertificates.get(i));
				System.out.println(empCerti);
			}
			
			List<EmployeeExprience> empExpriences=employee.getExprienceList();
			
			for(int i=0;i<empExpriences.size();i++) {
				String empExp = saveEmployeeExperienceDetails(employee.getUserName(), empExpriences.get(i));
				System.out.println(empExp);
			}
			
			List<EmployeeRelation> empRelations=employee.getRelationList();
			
			for(int i=0;i<empRelations.size();i++) {
				String empRel = saveEmployeeRelationDetails(employee.getUserName(), empRelations.get(i));
				System.out.println(empRel);
			}
			
			List<EmployeeNominee> empNominees=employee.getNomineeList();
			
			for(int i=0;i<empNominees.size();i++) {
				String empNomi = saveEmployeeNomineeDetails(employee.getUserName(), empNominees.get(i));
				System.out.println(empNomi);
			}
			
			List<EmployeeKRA> empKras=employee.getKraList();
			
			for(int i=0;i<empKras.size();i++) {
				String empKRA = saveEmployeeKRADetails(employee.getUserName(), empKras.get(i));
				System.out.println(empKRA);
			}
			
			message="Employee details store successfully";
		}
		else {
			message="Nominee Share must be 100 % ";
		}
		
		return message;
	}

	@Override
	public String saveEmployeeMasterDetails(String userName, EmployeeMaster employeeMaster) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_MasterEmployee_Sql,employeeMaster.getEmpCode(),
				employeeMaster.getNjId(),employeeMaster.getPrefix(),employeeMaster.getFirstname(),
				employeeMaster.getMiddlename(),employeeMaster.getLastname(),employeeMaster.getGender(),
				employeeMaster.getBirthdate(),employeeMaster.getEmail(),employeeMaster.getPhoneno(),
				employeeMaster.getAlternateno(),employeeMaster.getMarriageStatus(),employeeMaster.getAnniversaryDate(),
				employeeMaster.getNoofchild(),employeeMaster.getQualification(),employeeMaster.getExperienced(),
				employeeMaster.getGrade(),employeeMaster.getJobtype(),employeeMaster.getBranch(),
				employeeMaster.getDepartment(),employeeMaster.getDesignation(),employeeMaster.getSuperiorname(),
				employeeMaster.getCtcamount(),employeeMaster.getEmployeeStatus(),userName,
				Date.valueOf(LocalDate.now()),employeeMaster.getId(),employeeMaster.getModifyby(),
				employeeMaster.getModifieddate(),employeeMaster.getEmployee_image(),employeeMaster.getBloodGroup(),
				employeeMaster.getDisability(),employeeMaster.getDisabilityDescription(),employeeMaster.getEffectiveDate(),
				employeeMaster.getCadre(),employeeMaster.getDisabilityPer(),userName,
				Date.valueOf(LocalDate.now()),employeeMaster.getStatus(),employeeMaster.getSpousename(),
				employeeMaster.getDateofjoin());
		if(effected_Row>0) {
			message="Employee master details store successfully";
		}
		return message;
	}

	@Override
	public String saveEmployeeBankDetails(String userName, EmployeeBank employeeBank) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeBankDetails_Sql,employeeBank.getId(),
				employeeBank.getEmpCode(),employeeBank.getBankname(),employeeBank.getAccountno(),
				employeeBank.getIFSCcode(),employeeBank.getChequeimage(),userName,
				Date.valueOf(LocalDate.now()),employeeBank.getModifyby(),employeeBank.getModifydate(),
				userName,Date.valueOf(LocalDate.now()),employeeBank.getStatus());
		if(effected_Row>0) {
			message="Employee bank details store successfully";
		}
		return message;
	}

	@Override
	public String saveEmployeeKYCDetails(String userName, EmployeeKYC employeeKYC) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeKYCDetails_Sql,employeeKYC.getId(),
				employeeKYC.getEmpCode(),employeeKYC.getAadharno(),employeeKYC.getPanno(),
				employeeKYC.getAadharimage(),employeeKYC.getPanimage(),employeeKYC.getPfno(),
				userName,LocalDate.now(),employeeKYC.getModifyby(),
				employeeKYC.getModifydate(),userName,LocalDate.now(),
				employeeKYC.getStatus());
		if(effected_Row>0) {
			message="Employee KYC details store successfully";
		}
		return message;
	}

	@Override
	public String saveEmployeeEmergencyDetails(String userName, EmployeeEmergency employeeEmergency) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeEmergencyDetails_Sql,
				employeeEmergency.getId(),employeeEmergency.getName(),
				employeeEmergency.getContactno(),employeeEmergency.getEmpCode(),
				userName,Date.valueOf(LocalDate.now()),
				employeeEmergency.getModifyby(),employeeEmergency.getModifydate(),
				userName,Date.valueOf(LocalDate.now()),
				employeeEmergency.getStatus());
		if(effected_Row>0) {
			message="Employee emergency details store successfully";
		}
		return message;
	}
	
	@Override
	public String saveEmployeeAddressDetails(String userName, EmployeeAddress employeeAddress) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeAddressDetails_Sql,
				employeeAddress.getEmpCode(),employeeAddress.getAddressType(),
				employeeAddress.getAddress(),employeeAddress.getState(),
				employeeAddress.getCity(),employeeAddress.getPincode(),
				userName,Date.valueOf(LocalDate.now()),
				employeeAddress.getModifyby(),employeeAddress.getModifydate(),
				employeeAddress.getId(),userName,
				Date.valueOf(LocalDate.now()),employeeAddress.getSetCurrent(),
				employeeAddress.getAddressproof(),employeeAddress.getStatus(),
				employeeAddress.getCountry());
		if(effected_Row>0) {
			message="Employee address details store successfully";
		}
		return message;
	}
	
	@Override
	public String saveEmployeeLanguageDetails(String userName, EmployeeLanguage employeeLanguage) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeLanguageDetails_Sql,
				employeeLanguage.getEmpCode(),employeeLanguage.getLanguagename(),
				employeeLanguage.getCanRead(),employeeLanguage.getCanWrite(),
				employeeLanguage.getCanSpeak(),userName,
				Date.valueOf(LocalDate.now()),employeeLanguage.getModifyby(),
				employeeLanguage.getModifydate(),employeeLanguage.getId(),
				userName,Date.valueOf(LocalDate.now()),
				employeeLanguage.getStatus());
		if(effected_Row>0) {
			message="Employee language details store successfully";
		}
		return message;
	}

	@Override
	public String saveEmployeeQualificationDetails(String userName, EmployeeQualification employeeQualification) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeQualificationDetails_Sql,
				employeeQualification.getEmpCode(),employeeQualification.getCourse(),
				employeeQualification.getPassingYear(),employeeQualification.getUniversity(),
				employeeQualification.getPercentage(),userName,
				Date.valueOf(LocalDate.now()),employeeQualification.getModifyby(),
				employeeQualification.getModifydate(),employeeQualification.getId(),
				employeeQualification.getQualificationImage(),userName,
				Date.valueOf(LocalDate.now()),employeeQualification.getStatus());
		if(effected_Row>0) {
			message="Employee qualification details store successfully";
		}
		return message;
	}

	@Override
	public String saveEmployeeCertificationDetails(String userName, EmployeeExtraCertificate employeeExtraCertificate) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeCertificationDetails_Sql,
				employeeExtraCertificate.getEmpCode(),employeeExtraCertificate.getCertificateName(),
				employeeExtraCertificate.getPassingYear(),employeeExtraCertificate.getInstituteName(),
				employeeExtraCertificate.getPercentage(),userName,
				Date.valueOf(LocalDate.now()),employeeExtraCertificate.getModifyby(),
				employeeExtraCertificate.getModifydate(),employeeExtraCertificate.getId(),
				employeeExtraCertificate.getCertificateImage(),userName,
				Date.valueOf(LocalDate.now()),employeeExtraCertificate.getStatus());
		if(effected_Row>0) {
			message="Employee certification details store successfully";
		}
		return message;
	}

	@Override
	public String saveEmployeeExperienceDetails(String userName, EmployeeExprience employeeExprience) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeExperienceDetails_Sql,
				employeeExprience.getEmpCode(),employeeExprience.getCompanyName(),
				employeeExprience.getDesignation(),employeeExprience.getJoinDate(),
				employeeExprience.getLeaveDate(),employeeExprience.getLeaveReason(),
				employeeExprience.getCtcAmount(),userName,
				Date.valueOf(LocalDate.now()),employeeExprience.getModifyby(),
				employeeExprience.getModifydate(),employeeExprience.getId(),
				userName,Date.valueOf(LocalDate.now()),
				employeeExprience.getStatus());
		if(effected_Row>0) {
			message="Employee experience details store successfully";
		}
		return message;
	}

	@Override
	public String saveEmployeeRelationDetails(String userName, EmployeeRelation employeeRelation) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeRelationDetails_Sql,
				employeeRelation.getEmpCode(),employeeRelation.getRelativename(),
				employeeRelation.getEmpRelation(),employeeRelation.getBirthdate(),
				employeeRelation.getOccupation(),employeeRelation.getContactNo(),
				userName,Date.valueOf(LocalDate.now()),
				employeeRelation.getModifyby(),employeeRelation.getModifydate(),
				employeeRelation.getId(),userName,
				Date.valueOf(LocalDate.now()),employeeRelation.getSkill(),
				employeeRelation.getStatus());
		if(effected_Row>0) {
			message="Employee relation details store successfully";
		}
		return message;
	}

	@Override
	public String saveEmployeeKRADetails(String userName, EmployeeKRA employeeKRA) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeKRADetails_Sql,
				employeeKRA.getId(),employeeKRA.getEmpCode(),employeeKRA.getKra(),
				userName,Date.valueOf(LocalDate.now()),
				employeeKRA.getModifyby(),employeeKRA.getModifydate(),employeeKRA.getKratype(),
				userName,Date.valueOf(LocalDate.now()),employeeKRA.getStatus());
		if(effected_Row>0) {
			message="Employee KRA details store successfully";
		}
		return message;
	}

	@Override
	public String saveEmployeeNomineeDetails(String userName, EmployeeNominee employeeNominee) {
		String message="Something happen wrong try again.....";
		int effected_Row=jdbctemplate.update(insert_EmployeeNomineeDetails_Sql,
				employeeNominee.getId(),employeeNominee.getEmpCode(),
				employeeNominee.getNomineename(),employeeNominee.getRelation(),
				employeeNominee.getAadharno(),employeeNominee.getBirthdate(),
				employeeNominee.getAccountno(),employeeNominee.getBankname(),
				employeeNominee.getIFSCcode(),employeeNominee.getShare(),
				userName,Date.valueOf(LocalDate.now()),
				employeeNominee.getModifyby(),employeeNominee.getModifydate(),
				userName,Date.valueOf(LocalDate.now()),
				employeeNominee.getContactno(),employeeNominee.getStatus());
		if(effected_Row>0) {
			message="Employee nominee details store successfully";
		}
		return message;
	}
	
}
