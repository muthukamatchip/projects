package com.phone.exception;



import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<Object>ResourceNotFoundException(ResourceNotFoundException exception,WebRequest webRequest)
  {
	  ApiException a= new ApiException(new Date(),exception.getMessage(),webRequest.getDescription(false) );
	  return new ResponseEntity<Object>(a,HttpStatus.NOT_FOUND);
  }
}
