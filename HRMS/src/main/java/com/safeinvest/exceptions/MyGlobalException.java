package com.safeinvest.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class MyGlobalException {
	
	
	public ResponseEntity<MyErrClass> otherException(MethodArgumentNotValidException mnav){
		MyErrClass err=new MyErrClass();
		err.setTime(LocalDateTime.now());
		err.setMessage("Validation failed...");
		err.setDescription(mnav.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<MyErrClass>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoEmployeeAddressDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeAddressFoundHandller(NoEmployeeAddressDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeBankDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeBankAddressFoundHandller(NoEmployeeBankDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeCertificateDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeCertificateFoundHandller(NoEmployeeCertificateDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeEmergencyDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeEmergencyFoundHandller(NoEmployeeEmergencyDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeExperienceDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeExperienceFoundHandller(NoEmployeeExperienceDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeKRADataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeKRAFoundHandller(NoEmployeeKRADataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeKYCDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeKYCFoundHandller(NoEmployeeKYCDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeLanguageDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeLanguageFoundHandller(NoEmployeeLanguageDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeMasterDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeMasterFoundHandller(NoEmployeeMasterDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeNomineeDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeNomineeFoundHandller(NoEmployeeNomineeDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeQualificationDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeQualificationFoundHandller(NoEmployeeQualificationDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoEmployeeRelationDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeRelationFoundHandller(NoEmployeeRelationDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrClass> NoEmpFoundHandller(Exception e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	

}
