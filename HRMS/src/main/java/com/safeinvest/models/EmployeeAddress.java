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
public class EmployeeAddress {
	
	private Integer id;
    private String empCode;
    private String addressType;
    private String address;
    private String state;
    private String city;
    private String pincode;
    private String postby;
    private String addressproof;
    private Boolean setCurrent;        
    private Date postdate;
    private String modifyby;
    private Date modifydate;
    private String approveby;
    private Date approvedate;
    private String status;
    private String country;
	
}
