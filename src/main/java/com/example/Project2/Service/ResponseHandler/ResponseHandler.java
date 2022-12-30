package com.example.Project2.Service.ResponseHandler;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.lang.constant.Constable;
import java.util.Date;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class ResponseHandler {
    private String cod;
    private String mensage;
    private HttpStatus httpStatus;
    private Date Date;


}
