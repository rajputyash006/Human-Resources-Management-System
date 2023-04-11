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
public class EmployeeExtraCertificate {
	
	private Integer id;
    private String empCode;
    private String certificateName;
    private String passingYear;
    private String instituteName;
    private String percentage;
    private String postby;
    private Date postdate;
    private String modifyby;
    private Date modifydate;
    private String certificateImage;
    private String approveby;
    private Date approvedate;
    private String status;
	
}
