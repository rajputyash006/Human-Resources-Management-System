package com.safeinvest.dtos;

import org.springframework.stereotype.Component;

import com.safeinvest.models.EmployeeBank;
import com.safeinvest.models.EmployeeEmergency;
import com.safeinvest.models.EmployeeKYC;
import com.safeinvest.models.EmployeeMaster;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class ObjectCreation {
	
	public EmployeeMaster getEmployeeMaster(Employee employee){
		
		EmployeeMaster empMaster=new EmployeeMaster();
		
		empMaster.setEmpCode(employee.getEmpCode());
		empMaster.setNjId(employee.getNjId());
		empMaster.setPrefix(employee.getPrefix());
		empMaster.setFirstname(employee.getFirstname());
		empMaster.setMiddlename(employee.getFirstname());
		empMaster.setLastname(employee.getLastname());
		empMaster.setGender(employee.getGender());
		empMaster.setBirthdate(employee.getBirthdate());
		empMaster.setEmail(employee.getEmail());
		empMaster.setPhoneno(employee.getPhoneno());
		empMaster.setAlternateno(employee.getAlternateno());
		empMaster.setMarriageStatus(employee.getMarriageStatus());
		empMaster.setAnniversaryDate(employee.getAnniversaryDate());
		empMaster.setNoofchild(employee.getNoofchild());
		empMaster.setQualification(employee.getQualification());
		empMaster.setExperienced(employee.getExperienced());
		empMaster.setGrade(employee.getGrade());
		empMaster.setCadre(employee.getCrade());
		empMaster.setJobtype(employee.getJobtype());
		empMaster.setBranch(employee.getBranch());
		empMaster.setDepartment(employee.getDepartment());
		empMaster.setDesignation(employee.getDesignation());
		empMaster.setSuperiorname(employee.getSuperiorname());
		empMaster.setCtcamount(employee.getCtcamount());
		empMaster.setEmployeeStatus(employee.getEmployeeStatus());
		empMaster.setEmployee_image(employee.getEmployeeImage());
		empMaster.setBloodGroup(employee.getBloodgroup());
		empMaster.setDisability(employee.getDisability());
		empMaster.setDisabilityPer(employee.getDisabilityPer());
		empMaster.setDisabilityDescription(employee.getDisability_desc());
		empMaster.setEffectiveDate(employee.getEffectiveDate());
		empMaster.setStatus(employee.getEmployeeStatus());
		empMaster.setDateofjoin(employee.getDateofjoin());
		
		return empMaster;
	}
	
	public EmployeeBank getEmployeeBank(Employee employee) {
		
		EmployeeBank empBank=new EmployeeBank();
		
		empBank.setEmpCode(employee.getEmpCode());
		empBank.setBankname(employee.getBankname());
		empBank.setAccountno(employee.getAccountno());
		empBank.setIFSCcode(employee.getIfsccode());
		empBank.setChequeimage(employee.getChequeImage());
	
		return empBank;
	}
	
	public EmployeeKYC getEmployeeKYC(Employee employee) {
		
		EmployeeKYC empKYC=new EmployeeKYC();
		
		empKYC.setEmpCode(employee.getEmpCode());
		empKYC.setAadharno(employee.getAadharno());
		empKYC.setPanno(employee.getPanno());
		empKYC.setPfno(employee.getPfNo());
		empKYC.setAadharimage(employee.getAadharImage());
		empKYC.setPanimage(employee.getPanImage());
		
		return empKYC;
	}
	
	public EmployeeEmergency getEmployeeEmergency(Employee employee) {
		
		EmployeeEmergency empEmergency=new EmployeeEmergency();
		
		empEmergency.setEmpCode(employee.getEmpCode());
		empEmergency.setName(employee.getEmergencyname());
		empEmergency.setContactno(employee.getEmergencyContactNo());
		
		return empEmergency;	
	}
	
}
