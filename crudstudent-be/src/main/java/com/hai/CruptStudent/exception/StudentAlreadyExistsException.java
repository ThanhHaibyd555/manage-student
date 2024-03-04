package com.hai.CruptStudent.exception;

public class StudentAlreadyExistsException extends RuntimeException {
    public StudentAlreadyExistsException(String massage) {
        super(massage);
    }
}
