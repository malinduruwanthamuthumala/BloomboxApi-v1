package com.plantit.bloombox.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PlantNotFoundException extends RuntimeException {
	
	private String message;

	public PlantNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	

}
