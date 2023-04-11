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
public class EmployeeKYC {
	
	private Integer id;
    private String empCode;
    private String aadharno;
    private String panno;
    private String pfno;
    private String aadharimage;
    private String panimage;
    private String postby;
    private Date postdate;
    private String modifyby;
    private Date modifydate;
    private String approveby;
    private Date approvedate;
    private String status;
	
}
