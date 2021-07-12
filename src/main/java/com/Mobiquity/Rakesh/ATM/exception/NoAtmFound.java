package com.Mobiquity.Rakesh.ATM.exception;

public class NoAtmFound extends RuntimeException {


    public NoAtmFound() {
        super();
    }

    public NoAtmFound(String message) {
        super(message);
    }
}
