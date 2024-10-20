package com.maticuad.volleyballApp.model.Api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestResponse<T> {
    private String status;
    private String message;
    private T data;
    private List<ErrorDetail> errors;
}
