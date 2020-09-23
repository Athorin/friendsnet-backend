package com.everis.alicante.courses.beca.java.friendsnet.exceptions;

public class BaseException extends Exception {
	
	private static final long serialVersionUID = 4789704895970515335L;

	private String exceptionMessage;

	private String errorCode;
	
	public BaseException(String exceptionMessage) {
		super(exceptionMessage);
		this.exceptionMessage = exceptionMessage;
	}
	public BaseException(String exceptionMessage, String errorCode) {
		super(exceptionMessage);
		this.exceptionMessage = exceptionMessage;
		this.errorCode = errorCode;	
	}
	public BaseException(String exceptionMessage, Throwable throwable) {
		super(exceptionMessage, throwable);
		this.exceptionMessage = exceptionMessage;
	}
	public BaseException(String exceptionMessage, String errorCode, Throwable throwable) {
		super(exceptionMessage, throwable);
		this.exceptionMessage = exceptionMessage;
		this.errorCode = errorCode;	
	}
	
	public String getExceptionMessage() {
		return exceptionMessage;
	}
	
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
