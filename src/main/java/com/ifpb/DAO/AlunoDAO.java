package com.ifpb.DAO;

import com.ifpb.model.Aluno;
import com.ifpb.model.DiasSemana;

import java.util.List;

public interface AlunoDAO {
    boolean create(String matricula, String nome, String periodo, String curso, List<DiasSemana> diasJantar, List<DiasSemana>diasAlmoco);
    boolean delete(String matricula);
    Aluno read(String matricula);
    boolean update(String matricula, Aluno aluno);
}
