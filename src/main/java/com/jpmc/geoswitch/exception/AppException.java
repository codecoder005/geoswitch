package com.jpmc.geoswitch.exception;

import lombok.Getter;

@Getter
public class AppException extends RuntimeException{
    private String message;
    public AppException(String message) {
        super(message);
    }
}
