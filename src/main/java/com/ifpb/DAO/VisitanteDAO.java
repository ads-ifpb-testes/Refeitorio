package com.ifpb.DAO;

import com.ifpb.exceptions.CampoInvalidoException;
import com.ifpb.exceptions.CampoVazioException;
import com.ifpb.exceptions.CodigoInexistenteException;
import com.ifpb.exceptions.CodigoInvalidoException;
import com.ifpb.model.Visitante;

public interface VisitanteDAO {
    String create(String nome, int quantDias) throws CampoVazioException, CampoInvalidoException;
    boolean delete(String codigo);
    Visitante read(String codigo) throws CodigoInexistenteException, CodigoInvalidoException;
}
