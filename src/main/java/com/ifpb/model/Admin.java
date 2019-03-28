package com.ifpb.model;

import java.util.Objects;

public class Admin {
    private String login;
    private String senha;

    public Admin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(login, admin.login) &&
                Objects.equals(senha, admin.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, senha);
    }

    @Override
    public String
    toString() {
        return "Admin{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
