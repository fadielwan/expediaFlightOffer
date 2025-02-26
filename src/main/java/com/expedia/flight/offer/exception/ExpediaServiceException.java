package com.expedia.flight.offer.exception;

public class ExpediaServiceException extends RuntimeException {
    public ExpediaServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
