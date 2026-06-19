package com.example.employee_management_api.exception;


public class ResourceNotFoundException extends RuntimeException {


    public ResourceNotFoundException(String message){

        super(message);

    }

}