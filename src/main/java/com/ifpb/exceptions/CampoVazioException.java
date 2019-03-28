package com.ifpb.exceptions;

public class CampoVazioException extends Exception{
    public CampoVazioException(){
        super("Todos os campos são obrigatórios!");
    }
}
