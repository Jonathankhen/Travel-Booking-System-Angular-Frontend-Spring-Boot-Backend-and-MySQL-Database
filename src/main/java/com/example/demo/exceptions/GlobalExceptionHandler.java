package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Global exception handler to catch and handle validation errors across the application.
 * This class captures MethodArgumentNotValidException and returns a structured error response.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    // This method handles exceptions of type MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)
    // Sets the HTTP status code to 400 Bad Request for the response
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        // Initialize a map to store field errors and their corresponding messages
        Map<String, String> errors = new HashMap<>();

        // Iterate through field errors and put them in the errors map
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage()));

        // Return the map containing field errors and their messages
        return errors;
    }
}
