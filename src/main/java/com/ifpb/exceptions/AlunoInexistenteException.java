package com.ifpb.exceptions;

public class AlunoInexistenteException extends Exception{
    public AlunoInexistenteException(){
        super("Aluno não cadastrado!");
    }
}
