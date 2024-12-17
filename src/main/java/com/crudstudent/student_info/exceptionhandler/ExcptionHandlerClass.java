package com.crudstudent.student_info.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcptionHandlerClass 
{	
	@ExceptionHandler(value = {ExceptionHelper.class})
	public ResponseEntity<ExceptionModel> isExceptionHandle(ExceptionHelper exceptionHelper)
	{
		ExceptionModel exceptionModel2 = new ExceptionModel(exceptionHelper.getMessage(),HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(exceptionModel2,HttpStatus.NOT_FOUND);
	}
}
