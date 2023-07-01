package com.vasanth.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resource;
	private String fieldName;
	private Integer fieldValue;

	public ResourceNotFoundException(String resource, String fieldName, Integer fieldValue) {
		super(String.format("%s not found with %s : %s", resource, fieldName, fieldValue));
		System.out.println("Hi");
		this.resource = resource;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResource() {
		return resource;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Integer getFieldValue() {
		return fieldValue;
	}

}
