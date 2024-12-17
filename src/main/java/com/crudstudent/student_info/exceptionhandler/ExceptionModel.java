package com.crudstudent.student_info.exceptionhandler;

import org.springframework.http.HttpStatus;

public class ExceptionModel 
{
	private String msg;
	private HttpStatus httpStatus;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public ExceptionModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionModel(String msg, HttpStatus httpStatus) {
		super();
		this.msg = msg;
		this.httpStatus = httpStatus;
	}
	@Override
	public String toString() {
		return "ExceptionModel [msg=" + msg + ", httpStatus=" + httpStatus + "]";
	}
	

}
