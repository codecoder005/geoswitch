package com.jpmc.geoswitch.exception;

public class StateNotFoundException extends AppException{
    private String message;
    public StateNotFoundException(String message) {
        super(message);
    }
}
