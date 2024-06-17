package com.projects.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND) // Maps this exception to an HTTP 404 (Not Found) status
public class ResourceNotFoundException extends RuntimeException {

    // Constructor
    public ResourceNotFoundException(String message) { // This accepts a message & describes reason for exception
        super(message); // Passes message to parent class (RuntimeException) constructor
    }
}
