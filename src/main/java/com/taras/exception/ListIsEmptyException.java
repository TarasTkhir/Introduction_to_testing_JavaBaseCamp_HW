package com.taras.exception;

public class ListIsEmptyException extends RuntimeException {

    private static final String ERROR = "Your List is null ";

    public ListIsEmptyException(String message) {

        super(ERROR + message);
    }

    public ListIsEmptyException() {

    }
}