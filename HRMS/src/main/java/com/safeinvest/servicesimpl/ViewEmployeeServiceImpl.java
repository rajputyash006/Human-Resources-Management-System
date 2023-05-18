package com.safeinvest.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
import com.safeinvest.services.ViewEmployeeService;

@Repository
public class ViewEmployeeServiceImpl implements ViewEmployeeService{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public EmployeeMaster getEmployeeMaster(String employeeCode) throws NoEmployeeDataFound {
		String get_MasterEmployee_Sql="select * from tbl_employee_master where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.queryForObject(get_MasterEmployee_Sql,(rs, rowNum)->{
				return new EmployeeMaster(
						rs.getInt("id"),rs.getString("emp_code"),rs.getString("nj_id"),
						rs.getString("prefix"),rs.getString("firstname"),rs.getString("middlename"),
						rs.getString("lastname"),rs.getString("gender"),rs.getDate("birthdate"),
						rs.getString("email"),rs.getString("phoneno"),rs.getString("alternateno"),
						rs.getString("marriage_status"),rs.getDate("anniversary_date"),
						rs.getString("noofchild"),rs.getString("qualification"),
						rs.getString("experienced"),rs.getString("grade"),rs.getString("cadre"),
						rs.getString("jobtype"),rs.getString("branch"),rs.getString("department"),
						rs.getString("designation"),rs.getString("superiorname"),
						rs.getString("CTCamount"),rs.getString("employee_status"),
						rs.getString("postby"),rs.getDate("postdate"),rs.getString("modifyby"),
						rs.getDate("modifieddate"),rs.getString("employee_image"),
						rs.getString("bloodgroup"),rs.getBoolean("disability"),
						rs.getString("disability_per"),rs.getString("disability_desc"),
						rs.getDate("effectivedate"),rs.getString("approveby"),
						rs.getDate("approvedate"),rs.getString("entrystatus"),
						rs.getString("spousename"),rs.getDate("dateofjoin")
						);
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No employee data found with employeeId "+employeeCode);
		}
		
		
	}

	@Override
	public EmployeeBank getEmployeeBankDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeBankDetails_Sql="select * from tbl_employee_bank where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.queryForObject(get_EmployeeBankDetails_Sql,(rs, rowNum) ->{
				return new EmployeeBank(
						rs.getInt("id"),rs.getString("empcode"),
						rs.getString("bankname"),rs.getString("accountno"),
						rs.getString("IFSCcode"),rs.getString("cheque_image"),
						rs.getString("postby"),rs.getDate("postdate"),
						rs.getString("modifyby"),rs.getDate("modifydate"),
						rs.getString("approveby"),rs.getDate("approvedate"),
						rs.getString("entrystatus"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No Bank Details Found with employee code "+employeeCode);
		}
		
			
	}

	@Override
	public EmployeeKYC getEmployeeKYCDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeKYCDetails_Sql="select * from tbl_employee_kyc where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.queryForObject(get_EmployeeKYCDetails_Sql,(rs, rowNum) ->{
				return new EmployeeKYC(
						rs.getInt("id"),rs.getString("empcode"),
						rs.getString("aadharno"),rs.getString("panno"),
						rs.getString("aadhar_image"),rs.getString("pan_image"),
						rs.getString("pf_no"),rs.getString("postby"),
						rs.getDate("postdate"),rs.getString("modifyby"),
						rs.getDate("modifydate"),rs.getString("approveby"),
						rs.getDate("approvedate"),rs.getString("entrystatus"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No kyc Details Found with employee code "+employeeCode);
		}
			
	}

	@Override
	public EmployeeEmergency getEmployeeEmergencyDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeEmergencyDetails_Sql="select * from tbl_employee_emergency where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.queryForObject(get_EmployeeEmergencyDetails_Sql,(rs, rowNum) ->{
				return new EmployeeEmergency(
						rs.getInt("id"),rs.getString("empcode"),
						rs.getString("emername"),rs.getString("emercontactno"),
						rs.getString("entrystatus"),rs.getString("postby"),
						rs.getDate("postdate"),rs.getString("modifyby"),
						rs.getDate("modifydate"),rs.getString("approveby"),
						rs.getDate("approvedate")
						);
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No emergency Details Found with employee code "+employeeCode);
		}
			
	}

	@Override
	public List<EmployeeAddress> getEmployeeAddressDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeAddressDetails_Sql="select * from tbl_employee_address where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.query(get_EmployeeAddressDetails_Sql,(rs, rowNum) ->{
				return new EmployeeAddress(
						rs.getInt("id"),rs.getString("emp_code"),
						rs.getString("address_type"),rs.getString("address"),
						rs.getString("state"),rs.getString("city"),
						rs.getString("pincode"),rs.getString("postby"),
						rs.getString("addressProff"),rs.getBoolean("setCurrent"),
						rs.getDate("postdate"),rs.getString("modifyby"),
						rs.getDate("modifydate"),rs.getString("approveby"),
						rs.getDate("approvedate"),rs.getString("entrystatus"),
						rs.getString("country"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No address Details Found with employee code "+employeeCode);
		}
			
	}

	@Override
	public List<EmployeeLanguage> getEmployeeLanguageDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeLanguageDetails_Sql="select * from tbl_employee_language where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.query(get_EmployeeLanguageDetails_Sql,(rs, rowNum) ->{
				return new EmployeeLanguage(
						rs.getInt("id"),rs.getString("emp_code"),
						rs.getString("languagename"),rs.getBoolean("can_read"),
						rs.getBoolean("can_write"),rs.getBoolean("can_speak"),
						rs.getString("postby"),rs.getDate("postdate"),
						rs.getString("modifyby"),rs.getDate("modifydate"),
						rs.getString("approveby"),rs.getDate("approvedate"),
						rs.getString("entrystatus"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No language Details Found with employee code "+employeeCode);
		}
		
	}

	@Override
	public List<EmployeeQualification> getEmployeeQualificationDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeQualificationDetails_Sql="select * from tbl_employee_qualification where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.query(get_EmployeeQualificationDetails_Sql,(rs, rowNum) ->{
				return new EmployeeQualification(
						rs.getInt("id"),rs.getString("emp_code"),
						rs.getString("course"),rs.getString("passing_year"),
						rs.getString("university"),rs.getString("percentage"),
						rs.getString("postby"),rs.getDate("postdate"),
						rs.getString("modifyby"),rs.getDate("modifydate"),
						rs.getString("qualification_img"),rs.getString("approveby"),
						rs.getDate("approvedate"),rs.getString("entrystatus"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No qualification Details Found with employee code "+employeeCode);
		}	
	}

	@Override
	public List<EmployeeExtraCertificate> getEmployeeCertificationDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeCertificationDetails_Sql="select * from tbl_employee_extra_certificate where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.query(get_EmployeeCertificationDetails_Sql,(rs, rowNum) ->{
				return new EmployeeExtraCertificate(
						rs.getInt("id"),rs.getString("emp_code"),
						rs.getString("certificate_name"),rs.getString("passing_year"),
						rs.getString("institute_name"),rs.getString("percentage"),
						rs.getString("postby"),rs.getDate("postdate"),
						rs.getString("modifyby"),rs.getDate("modifydate"),
						rs.getString("certificate_img"),rs.getString("approveby"),
						rs.getDate("approvedate"),rs.getString("entrystatus"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No certificate Details Found with employee code "+employeeCode);
		}
		
	}

	@Override
	public List<EmployeeExprience> getEmployeeExperienceDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeExperienceDetails_Sql="select * from tbl_employee_exprience where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.query(get_EmployeeExperienceDetails_Sql,(rs, rowNum) ->{
				return new EmployeeExprience(
						rs.getInt("id"),rs.getString("emp_code"),
						rs.getString("company_name"),rs.getString("designation"),
						rs.getDate("join_date"),rs.getDate("leave_date"),
						rs.getString("leave_reason"),rs.getString("ctc_amount"),
						rs.getString("postby"),rs.getDate("postdate"),
						rs.getString("modifyby"),rs.getDate("modifydate"),
						rs.getString("approveby"),rs.getDate("approvedate"),
						rs.getString("entrystatus"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No experience Details Found with employee code "+employeeCode);
		}
			
	}

	@Override
	public List<EmployeeRelation> getEmployeeRelationDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeRelationDetails_Sql="select * from tbl_employee_relation where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.query(get_EmployeeRelationDetails_Sql,(rs, rowNum) ->{
				return new EmployeeRelation(
						rs.getInt("id"),rs.getString("emp_code"),
						rs.getString("relativename"),rs.getString("emp_relation"),
						rs.getDate("birthdate"),rs.getString("occupation"),
						rs.getString("skill"),rs.getString("contact_no"),
						rs.getString("postby"),rs.getDate("postdate"),
						rs.getString("modifyby"),rs.getDate("modifydate"),
						rs.getString("approveby"),rs.getDate("approvedate"),
						rs.getString("entrystatus"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No relation Details Found with employee code "+employeeCode);
		}
		
	}

	@Override
	public List<EmployeeKRA> getEmployeeKRADetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeKRADetails_Sql="select * from tbl_employee_kra where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.query(get_EmployeeKRADetails_Sql,(rs, rowNum) ->{
				return new EmployeeKRA(
						rs.getInt("id"),rs.getString("emp_code"),
						rs.getString("kra"),rs.getString("kratype"),
						rs.getString("postby"),rs.getDate("postdate"),
						rs.getString("modifyby"),rs.getDate("modifydate"),
						rs.getString("approveby"),rs.getDate("approvedate"),
						rs.getString("entrystatus"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No KRA Details Found with employee code "+employeeCode);
		}
		
	}

	@Override
	public List<EmployeeNominee> getEmployeeNomineeDetails(String employeeCode) throws NoEmployeeDataFound {
		String get_EmployeeNomineeDetails_Sql="select * from tbl_employee_nominee where emp_code="+"'"+employeeCode+"'";
		
		try {
			return jdbcTemplate.query(get_EmployeeNomineeDetails_Sql,(rs, rowNum) ->{
				return new EmployeeNominee(
						rs.getInt("id"),rs.getString("emp_code"),
						rs.getString("nominee_name"),rs.getString("nominee_relation"),
						rs.getDate("nominee_birthdate"),rs.getString("nominee_aadharno"),
						rs.getString("nominee_acno"),rs.getString("nominee_bankname"),
						rs.getString("nominee_IFSCcode"),rs.getString("nominee_share"),
						rs.getString("contactno"),rs.getString("postby"),
						rs.getDate("postdate"),rs.getString("modifyby"),
						rs.getDate("modifydate"),rs.getString("approveby"),
						rs.getDate("approvedate"),rs.getString("entrystatus"));
			});
		} catch (Exception e) {
			throw new NoEmployeeDataFound("No nominee Details Found with employee code "+employeeCode);
		}
		
	}

}
