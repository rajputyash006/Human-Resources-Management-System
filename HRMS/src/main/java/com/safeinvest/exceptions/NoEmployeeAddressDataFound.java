package com.safeinvest.exceptions;

public class NoEmployeeAddressDataFound extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoEmployeeAddressDataFound() {
		
	}
	
	public NoEmployeeAddressDataFound(String message) {
		super(message);
	}
	
}
