package com.example.tranli.dependency_injection;

public class MSSQLDAO implements AbstractDAO {
    public void insert(){
        System.out.println("MSSQL Insert");
    }

    @Override
    public void delete() {
        System.out.println("MSSQL delete");
    }

    @Override
    public void update() {

        System.out.println("MSSQL update");
    }
}
