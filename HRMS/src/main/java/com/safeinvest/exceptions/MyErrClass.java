package com.safeinvest.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrClass {
	
	private LocalDateTime time;
	
	private String message;
	
	private String description;

}
