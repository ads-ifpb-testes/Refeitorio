package com.ifpb.DAO;

import com.ifpb.model.Admin;

public interface AdminDAO {
    boolean create(String login, String senha);
    boolean delete(String login);
    Admin read(String login);
    boolean update(String login, Admin admin);
}
