package com.eidiko.niranjana.exception;


public class ResourceNotFoundException extends RuntimeException
{
	public ResourceNotFoundException() 
	{
		super("Resource Not Found");
	}

	public ResourceNotFoundException(String message) 
	{
		super(message);
	}
}
