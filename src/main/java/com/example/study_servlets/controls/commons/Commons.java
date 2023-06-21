package com.example.study_servlets.controls.commons;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

import com.mysql.cj.xdevapi.Statement;

//import java.util.UUID;

public class Commons {
    // public String generateUUID() {
    //     return UUID.randomUUID().toString();
    // }   


public java.sql.Statement getStatement(){
        String url = "jdbc:mysql://192.168.0.94:3306/db_cars";
        String user = "yojulab";
        String password = "!yojulab*";

        Statement statement = null;
        try {
            Connection connection = (Connection) DriverManager.getConnection(url, user, password);
            statement =  (Statement) ((java.sql.Connection) connection).createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (java.sql.Statement) statement;
    }

    public String getGeneratorID(){
        Date date = new Date(0);  
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyyhh:mm:ss");  
        String strDate = formatter.format(date);
        return strDate;
    }




}
