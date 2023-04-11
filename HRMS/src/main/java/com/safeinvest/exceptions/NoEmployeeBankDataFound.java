package com.safeinvest.exceptions;

public class NoEmployeeBankDataFound extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoEmployeeBankDataFound() {
		
	}
	
	public NoEmployeeBankDataFound(String message) {
		super(message);
	}
}
