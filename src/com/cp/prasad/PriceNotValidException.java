package com.cp.prasad;

public class PriceNotValidException extends Exception {

	String message;

	public PriceNotValidException(String message) {
		super(message);
		this.message = message;
	}
}
