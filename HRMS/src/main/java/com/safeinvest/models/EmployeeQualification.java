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
public class EmployeeQualification {
	
	private Integer id;
    private String empCode;
    private String course;
    private String passingYear;
    private String university;
    private String percentage;
    private String postby;
    private Date postdate;
    private String modifyby;
    private Date modifydate;
    private String qualificationImage;
    private String approveby;
    private Date approvedate;
    private String status;
	
}
