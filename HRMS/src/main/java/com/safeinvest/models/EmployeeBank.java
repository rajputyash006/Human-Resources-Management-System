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
public class EmployeeBank {
	
	private Integer id;
    private String empCode;
    private String bankname;
    private String accountno;
    private String IFSCcode;
    private String chequeimage;
    private String postby;
    private Date postdate;
    private String modifyby;
    private Date modifydate;
    private String approveby;
    private Date approvedate;
    private String status;
	

}
