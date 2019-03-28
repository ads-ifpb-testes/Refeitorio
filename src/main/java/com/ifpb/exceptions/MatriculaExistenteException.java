package com.ifpb.exceptions;

public class MatriculaExistenteException extends Exception {
    public MatriculaExistenteException(){
        super("Matricula já cadastrada!");
    }
}
