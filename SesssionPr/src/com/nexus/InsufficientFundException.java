package com.nexus;

public class InsufficientFundException extends RuntimeException {
	
	private String message;
	
	private InsufficientFundException(String message) {
		// this.message = message;
		   super(message);
	}
}
