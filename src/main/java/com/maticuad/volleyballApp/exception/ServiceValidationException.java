package com.maticuad.volleyballApp.exception;

import com.maticuad.volleyballApp.model.Api.ErrorDetail;
import jakarta.validation.ValidationException;
import lombok.Getter;

import java.util.List;

@Getter
public class ServiceValidationException extends ValidationException {
    private final List<ErrorDetail> validationErrors;

    public ServiceValidationException(List<ErrorDetail> validationErrors) {
        super("Service validation failed");
        this.validationErrors = validationErrors;
    }
}
