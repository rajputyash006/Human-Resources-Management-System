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
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrClass> otherException(MethodArgumentNotValidException mnav){
		MyErrClass err=new MyErrClass();
		err.setTime(LocalDateTime.now());
		err.setMessage("Validation failed...");
		err.setDescription(mnav.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<MyErrClass>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoEmployeeDataFound.class)
	public ResponseEntity<MyErrClass> noEmployeeAddressFoundHandller(NoEmployeeDataFound e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrClass> NoEmpFoundHandller(Exception e,WebRequest web){
		MyErrClass err=new MyErrClass(LocalDateTime.now(),e.getMessage(),web.getDescription(false));
		return new ResponseEntity<MyErrClass>(err, HttpStatus.NOT_FOUND);
	}
	

}
