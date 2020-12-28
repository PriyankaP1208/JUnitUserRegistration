package com.UserRegistrationProblem;

public class InvalidUserException extends Exception {
    public InvalidUserException(NullPointerException message){
        super(message);
    }
}
