package com.jpmc.geoswitch.exception;

public class ContinentNotFoundException extends AppException{
    private String message;
    public ContinentNotFoundException(String message) {
        super(message);
    }
}
