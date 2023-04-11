package com.safeinvest.models;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeMaster {
	
	private Integer id;
    private String empCode;
    private String njId;
    private String prefix;
    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private Date birthdate;
    private String email;
    private String phoneno;
    private String alternateno;
    private String marriageStatus;
    private Date anniversaryDate;
    private String noofchild;
    private String qualification;
    private String experienced;
    private String grade;
    private String cadre;
    private String jobtype;
    private String branch;
    private String department;
    private String designation;
    private String superiorname;
    private String ctcamount;
    private String employeeStatus;
    private String postby;
    private Date postdate;
    private String modifyby;
    private Date modifieddate;
    private String employee_image;
    private String bloodGroup;
    private Boolean disability;
    private String disabilityPer;
    private String disabilityDescription; 
    private Date effectiveDate;
    private String approveby;
    private Date approvedate;
    private String status;
    private String spousename;
    private Date dateofjoin;
    
}
