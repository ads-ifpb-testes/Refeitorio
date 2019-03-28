package com.ifpb.model;

import java.util.Objects;

public class Visitante {
    private String nome;
    private int quantDias;
    private String codigo;

    public Visitante(String nome, int quantDias, String codigo) {
        this.nome = nome;
        this.quantDias = quantDias;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantDias() {
        return quantDias;
    }

    public void setQuantDias(int quantDias) {
        this.quantDias = quantDias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visitante visitante = (Visitante) o;
        return quantDias == visitante.quantDias &&
                Objects.equals(nome, visitante.nome) &&
                Objects.equals(codigo, visitante.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantDias, codigo);
    }

    @Override
    public String
    toString() {
        return "Visitante{" +
                "nome='" + nome + '\'' +
                ", quantDias=" + quantDias +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
