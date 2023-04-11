package com.safeinvest.dtos;

import java.sql.Date;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.safeinvest.models.EmployeeAddress;
import com.safeinvest.models.EmployeeExprience;
import com.safeinvest.models.EmployeeExtraCertificate;
import com.safeinvest.models.EmployeeKRA;
import com.safeinvest.models.EmployeeLanguage;
import com.safeinvest.models.EmployeeNominee;
import com.safeinvest.models.EmployeeQualification;
import com.safeinvest.models.EmployeeRelation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
	
	private Integer id;
	private String empCode;
	private String njId;
	private String prefix; 
	private String firstname; 
	private String middlename; 
	private String lastname;
	private String gender;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date birthdate;
	private String email;
	private String phoneno;
	private String alternateno;
	private String marriageStatus;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date anniversaryDate;
	private String noofchild;
	private String qualification; 
	private String experienced; 
	private String grade;
	private String crade;
	private String jobtype;
	private String branch;
	private String department;
	private String designation;
	private String superiorname;
	private String ctcamount;
	private String employeeStatus;
	private String employeeImage;
	private String bloodgroup;
	private Boolean disability;
	private String disabilityPer;
	private String disability_desc;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date effectiveDate;
	private String spousename;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateofjoin;
	
	
	//Bank
	private String bankname;
	private String accountno; 
	private String ifsccode; 
	private String chequeImage;
	
	//KYC
	private String panno;
	private String aadharno;
	private String pfNo;
	private String aadharImage;
	private String panImage;
    
    
    //Emergency
    private String emergencyname;
	private String emergencyContactNo;
	
	
	//UserName 
	private String userName;

    
    //Address,Languages,Qualification,Certificates,Experience lists
    ArrayList<EmployeeAddress> addressList = new ArrayList<EmployeeAddress>();
    ArrayList<EmployeeLanguage> languageList = new ArrayList<EmployeeLanguage>();
    ArrayList<EmployeeQualification> qualificationList = new ArrayList<EmployeeQualification>();
    ArrayList<EmployeeExtraCertificate> certificateList = new ArrayList<EmployeeExtraCertificate>();
    ArrayList<EmployeeExprience> exprienceList = new ArrayList<EmployeeExprience>();
    ArrayList<EmployeeRelation> relationList = new ArrayList<EmployeeRelation>();
    ArrayList<EmployeeNominee> nomineeList = new ArrayList<EmployeeNominee>();
    ArrayList<EmployeeKRA> kraList = new ArrayList<EmployeeKRA>();
	
}

