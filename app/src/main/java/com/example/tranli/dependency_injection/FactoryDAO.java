package com.example.tranli.dependency_injection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FactoryDAO  {
    public static AbstractDAO getDAO(){
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("src/main/assets/config.properties");
             //load a properties file
            prop.load(input);

            //get database value
            String database = prop.getProperty("database");
            if (database.equals("1")){
                return new MSSQLDAO();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
