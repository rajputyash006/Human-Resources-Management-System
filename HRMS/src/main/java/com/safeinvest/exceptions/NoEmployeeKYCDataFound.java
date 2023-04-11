package com.safeinvest.exceptions;

public class NoEmployeeKYCDataFound extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoEmployeeKYCDataFound() {
		
	}
	
    public NoEmployeeKYCDataFound(String message) {
		super(message);
	}
}
