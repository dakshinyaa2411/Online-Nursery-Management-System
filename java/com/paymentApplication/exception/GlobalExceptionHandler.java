package com.paymentApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;



public class GlobalExceptionHandler {
	@ExceptionHandler(value = PaymentNotFoundException.class)
	public ResponseEntity<String> PaymentNotFound(PaymentNotFoundException e) {
		return new ResponseEntity<>("Customer Not Found", HttpStatus.NOT_FOUND);
	}
}
