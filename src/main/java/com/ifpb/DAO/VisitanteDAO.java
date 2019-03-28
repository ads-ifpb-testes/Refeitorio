package com.ifpb.DAO;

import com.ifpb.model.Visitante;

public interface VisitanteDAO {
    String create(String nome, int quantDias);
    boolean delete(String codigo);
    Visitante read(String codigo);
}
