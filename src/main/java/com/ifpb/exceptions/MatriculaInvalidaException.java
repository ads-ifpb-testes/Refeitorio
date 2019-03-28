package com.ifpb.exceptions;

public class MatriculaInvalidaException extends Exception{
    public MatriculaInvalidaException(){
        super("Informe uma matrícula válida!");
    }
}
