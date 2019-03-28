package com.ifpb.model;

import java.util.List;
import java.util.Objects;

public class Aluno {
    private String matricula;
    private String nome;
    private String periodo;
    private String curso;
    private List<DiasSemana> diasJantar;
    private List<DiasSemana> diasAlmoco;

    public Aluno(String matricula, String nome, String periodo, String curso, List<DiasSemana> diasJantar, List<DiasSemana> diasAlmoco) {
        this.matricula = matricula;
        this.nome = nome;
        this.periodo = periodo;
        this.curso = curso;
        this.diasJantar = diasJantar;
        this.diasAlmoco = diasAlmoco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<DiasSemana> getDiasJantar() {
        return diasJantar;
    }

    public void setDiasJantar(List<DiasSemana> diasJantar) {
        this.diasJantar = diasJantar;
    }

    public List<DiasSemana> getDiasAlmoco() {
        return diasAlmoco;
    }

    public void setDiasAlmoco(List<DiasSemana> diasAlmoco) {
        this.diasAlmoco = diasAlmoco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula) &&
                Objects.equals(nome, aluno.nome) &&
                Objects.equals(periodo, aluno.periodo) &&
                Objects.equals(curso, aluno.curso) &&
                Objects.equals(diasJantar, aluno.diasJantar) &&
                Objects.equals(diasAlmoco, aluno.diasAlmoco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome, periodo, curso, diasJantar, diasAlmoco);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", periodo='" + periodo + '\'' +
                ", curso='" + curso + '\'' +
                ", diasJantar=" + diasJantar +
                ", diasAlmoco=" + diasAlmoco +
                '}';
    }
}
