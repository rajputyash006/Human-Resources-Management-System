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
public class EmployeeExprience {
	
	private Integer id;
    private String empCode;
    private String companyName;
    private String designation;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date joinDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date leaveDate;
    private String leaveReason;
    private String ctcAmount;
    private String postby;
    private Date postdate;
    private String modifyby;
    private Date modifydate;
    private String approveby;
    private Date approvedate;
    private String status;
    
}
