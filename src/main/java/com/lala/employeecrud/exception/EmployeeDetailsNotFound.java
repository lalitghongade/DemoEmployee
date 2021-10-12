package com.lala.employeecrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeDetailsNotFound extends RuntimeException{
    public EmployeeDetailsNotFound(String message){
        super(message);
    }
}
