package com.safeinvest.exceptions;

public class NoEmployeeMasterDataFound extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoEmployeeMasterDataFound(){
		
	}
	
	public NoEmployeeMasterDataFound(String message){
		super(message);
	}
}
