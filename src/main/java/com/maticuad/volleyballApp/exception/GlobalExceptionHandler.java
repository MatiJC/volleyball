package com.maticuad.volleyballApp.exception;

import com.maticuad.volleyballApp.model.Api.ErrorDetail;
import com.maticuad.volleyballApp.model.Api.RestResponse;

import jakarta.validation.ValidationException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<RestResponse<Void>> handleValidationException(ValidationException e) {

        List<ErrorDetail> errors = new ArrayList<>();
        errors.add(new ErrorDetail("validation", e.getMessage()));

        RestResponse<Void> response = new RestResponse<>("error", "Validation failed.", null, errors);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<RestResponse<Void>> handleResourceNotFoundException(ResourceNotFoundException e) {
        RestResponse<Void> response = new RestResponse<>("error", e.getMessage(), null, null);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<RestResponse<Void>> handleGlobalException(Exception e) {
        RestResponse<Void> response = new RestResponse<>("error", "An unexpected error occurred.", null, null);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}
