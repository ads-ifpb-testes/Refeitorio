package com.ifpb.DAO;

import com.ifpb.exceptions.*;
import com.ifpb.model.Aluno;
import com.ifpb.model.DiasSemana;

import java.util.List;

public interface AlunoDAO {
    boolean create(String matricula, String nome, String periodo, String curso, List<DiasSemana> diasJantar, List<DiasSemana>diasAlmoco) throws CampoInvalidoException, MatriculaExistenteException;
    boolean delete(String matricula) throws AlunoInexistenteException, MatriculaInvalidaException;
    Aluno read(String matricula) throws CampoInvalidoException, CampoVazioException;
    boolean update(String matricula, Aluno aluno);
}
