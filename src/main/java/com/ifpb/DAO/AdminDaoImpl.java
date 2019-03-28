package com.ifpb.DAO;

import com.ifpb.model.Admin;
import com.ifpb.model.Aluno;
import com.ifpb.model.DiasSemana;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminDaoImpl implements AdminDAO{
    private Map<String, Admin> admins;

    public AdminDaoImpl(){
        this.admins=new HashMap<>();
    }

    @Override
    public boolean create(String login, String senha){
        if(admins.put(login, new Admin(login, senha))==null){
            return true;
        }
        else return false;
    }

    @Override
    public boolean delete(String login){
        if(admins.remove(login)==null){
            return true;
        }
        else return false;
    }

    @Override
    public Admin read(String login){
        Admin admin = admins.get(login);
        return admin;
    }

    @Override
    public boolean update(String login, Admin admin) {
        if(admins.put(login,admin)==null){
            return true;
        }
        else return false;
    }
}
