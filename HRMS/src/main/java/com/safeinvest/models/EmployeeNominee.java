package com.safeinvest.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeNominee {
	
	private Integer id;
    private String empCode;
    private String nomineename;
    private String relation;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date birthdate;
    private String aadharno;
    private String accountno;
    private String bankname;
    private String IFSCcode;
    private String share;
    private String contactno;
    private String postby;
    private Date postdate;
    private String modifyby;
    private Date modifydate;
    private String approveby;
    private Date approvedate;
    private String status;
	
}
