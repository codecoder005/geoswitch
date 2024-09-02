package com.jpmc.geoswitch.exception;

public class CountryNotFoundException extends AppException{
    private String message;
    public CountryNotFoundException(String message) {
        super(message);
    }
}
