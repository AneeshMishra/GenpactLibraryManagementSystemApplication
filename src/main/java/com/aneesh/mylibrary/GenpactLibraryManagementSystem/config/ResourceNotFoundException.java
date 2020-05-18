package com.aneesh.mylibrary.GenpactLibraryManagementSystem.config;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus()
public class ResourceNotFoundException extends RuntimeException
{
	public ResourceNotFoundException( String exception )
	{
		super( exception );
	}
}
