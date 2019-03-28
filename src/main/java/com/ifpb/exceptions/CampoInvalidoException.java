package com.ifpb.exceptions;

public class CampoInvalidoException extends Exception {
    public CampoInvalidoException(){
        super("Preencha o(s) campo(s) corretamente!");
    }
}
