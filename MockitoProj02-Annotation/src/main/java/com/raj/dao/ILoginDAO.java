package com.raj.dao;

public interface ILoginDAO {
    public boolean authenticate(String user,String pwd);
    public int addUser(String user,String pwd);
}
