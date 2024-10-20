package com.maticuad.volleyballApp.utils;

import com.maticuad.volleyballApp.model.Api.ErrorDetail;
import com.maticuad.volleyballApp.model.Api.RestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;


public class RestResponseBuilder {

    private RestResponseBuilder() {
    }

    public static <T> ResponseEntity<RestResponse<T>> success(T data, String message) {
        RestResponse<T> response = new RestResponse<>("success", message, data, null);
        return ResponseEntity.ok(response);
    }

    public static <T> ResponseEntity<RestResponse<T>> error(String message, List<ErrorDetail> errors) {
        RestResponse<T> response = new RestResponse<>("error", message, null, errors);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    public static <T> ResponseEntity<RestResponse<T>> notFound(String message) {
        RestResponse<T> response = new RestResponse<>("error", message, null, null);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

}