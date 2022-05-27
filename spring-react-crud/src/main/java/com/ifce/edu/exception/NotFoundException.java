package com.ifce.edu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
	public String ResourceNotFoundMessage(String message) {
		return"tyeytwey"; 
	}

	private static final long serialVersionUID = 1L;
	
}
