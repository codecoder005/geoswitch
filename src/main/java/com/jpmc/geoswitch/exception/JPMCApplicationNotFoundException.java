package com.jpmc.geoswitch.exception;

public class JPMCApplicationNotFoundException extends AppException{
    private String message;
    public JPMCApplicationNotFoundException(String message) {
        super(message);
    }
}
