package com.ifpb.DAO;

import com.ifpb.model.Aluno;
import com.ifpb.model.DiasSemana;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoDaoImpl implements AlunoDAO{
    private Map<String, Aluno> alunos;

    public AlunoDaoImpl(){
        this.alunos=new HashMap<>();
    }

    @Override
    public boolean create(String matricula, String nome, String periodo, String curso, List<DiasSemana> diasJantar, List<DiasSemana>diasAlmoco){
        if(alunos.put(matricula, new Aluno(matricula, nome, periodo, curso, diasJantar, diasAlmoco))==null){
            return true;
        }
        else return false;
    }

    @Override
    public boolean delete(String matricula){
        if(alunos.remove(matricula)==null){
            return true;
        }
        else return false;
    }

    @Override
    public Aluno read(String matricula){
        Aluno aluno = alunos.get(matricula);
        return aluno;
    }

    @Override
    public boolean update(String matricula, Aluno aluno) {
        if(alunos.put(matricula,aluno)==null){
            return true;
        }
        else return false;
    }
}
