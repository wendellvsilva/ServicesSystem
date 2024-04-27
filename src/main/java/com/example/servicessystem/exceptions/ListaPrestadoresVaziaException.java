package com.example.servicessystem.exceptions;

public class ListaPrestadoresVaziaException extends RuntimeException {
    public ListaPrestadoresVaziaException(String message) {
        super(message);
    }
}