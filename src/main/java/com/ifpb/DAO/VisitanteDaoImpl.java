package com.ifpb.DAO;

import com.ifpb.model.Visitante;
import org.apache.commons.lang.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;

public class VisitanteDaoImpl implements VisitanteDAO{
    private Map<String, Visitante> visitantes;
    private String codigo;

    public VisitanteDaoImpl(){
        this.visitantes=new HashMap<>();
    }

    @Override
    public String create(String nome, int quantDias){
        codigo = gerarCodigo();
        if(visitantes.put(codigo, new Visitante(nome, quantDias, codigo))==null){
            return codigo;
        }
        else return null;
    }

    private String gerarCodigo(){
        return RandomStringUtils.randomAlphanumeric(8).toUpperCase();
    }

    @Override
    public boolean delete(String codigo){
        if(visitantes.remove(codigo)==null){
            return true;
        }
        else return false;
    }

    @Override
    public Visitante read(String codigo){
        Visitante visitante = visitantes.get(codigo);
        return visitante;
    }
}
