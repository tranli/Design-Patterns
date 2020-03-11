package com.example.tranli.dependency_injection;

public class Client {
    AbstractDAO dao;
    public Client(){
        dao = FactoryDAO.getDAO();
    }
}
