package com.safeinvest.controllers;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safeinvest.dtos.Employee;
import com.safeinvest.services.EmployeeService;

@RestController
@RequestMapping("/safeinvest")
public class EmployeeController {
	
	@Autowired
	private EmployeeService eser;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome_Message(){
		return new ResponseEntity<String>("Wlcome to HRMS Application",HttpStatus.FOUND);
	}
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) throws ParseException{
		String message=eser.saveEmployee(employee);
		return new ResponseEntity<String>(message,HttpStatus.CREATED);
	}
	
}
