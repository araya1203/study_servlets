package com.example.study_servlets.controls.commons;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.Statement;
import java.sql.Connection;

//import java.util.UUID;

public class Commons {
    // public String generateUUID() {
    //     return UUID.randomUUID().toString();
    // }   


public Statement getStatement(){
        String url = "jdbc:mysql://192.168.0.94:3306/db_cars";
        String user = "yojulab";
        String password = "!yojulab*";

        Statement statement = null;
        try {
            Connection connection = (Connection) DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return statement;
    }

    public String getGeneratorID(){
        Date date = new Date(0);  
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyyhh:mm:ss");  
        String strDate = formatter.format(date);
        return strDate;
    }




}
