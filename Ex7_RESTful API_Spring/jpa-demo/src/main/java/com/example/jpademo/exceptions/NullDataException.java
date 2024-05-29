package com.example.jpademo.exceptions;

public class NullDataException extends RuntimeException{
    public NullDataException(String message) {
        super(message);
    }
}
