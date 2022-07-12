package com.chainsys.miniproject.commonutil;
public class InValidInputDataException extends Exception{
	public InValidInputDataException() {
		super("The Input Data is not valid");
	}	
	public InValidInputDataException(String message) {
		super(message);
	}
}
