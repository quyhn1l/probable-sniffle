package com.example.jpademo.exceptions;

public class ActionFailedException extends RuntimeException{
    public ActionFailedException(String message) {
        super(message);
    }
}
