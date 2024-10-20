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
public class RestResponse<DATA_TYPE> {
    private String status;
    private String message;
    private DATA_TYPE data;
    private List<ErrorDetail> errors;
}
