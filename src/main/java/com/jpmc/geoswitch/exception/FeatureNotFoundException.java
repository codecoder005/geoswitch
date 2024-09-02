package com.jpmc.geoswitch.exception;

public class FeatureNotFoundException extends AppException{
    private String message;

    public FeatureNotFoundException(String message) {
        super(message);
    }
}
