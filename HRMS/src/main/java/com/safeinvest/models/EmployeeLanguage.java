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
public class EmployeeLanguage {
	
	private Integer id;
    private String empCode;
    private String languagename;
    private Boolean canRead;
    private Boolean canWrite;
    private Boolean canSpeak;
    private String postby;
    private Date postdate;
    private String modifyby;
    private Date modifydate;
    private String approveby;
    private Date approvedate;
    private String status;
	
}
