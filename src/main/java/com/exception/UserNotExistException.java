package com.exception;

/**
 * Created by Regina on 06.06.2017.
 */
public class UserNotExistException extends Exception {
    public UserNotExistException(String login) {
        super(String.format("User '%s' does not exist in system.", login));
    }
}
