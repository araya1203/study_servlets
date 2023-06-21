package com.example.study_servlets.controls;

import com.example.study_servlets.controls.commons.Commons;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/connectDBServlet")
public class ConnectDBServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            // 상대 DB와 연결, mySQL 연결 후에 진행할 것!
            String url = "jdbc:mysql://192.168.0.94:3306/db_cars";
            String user = "yojulab";
            String password = "!yojulab*";
            System.out.println("DB연결 성공\n");
            Connection connection = DriverManager.getConnection(url, user, password);

            String query = "SELECT CAR_NAME, YEAR, CAR_INFOR_ID, COMPANY_ID\n" + //
                    "FROM car_infors";

            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(query);
            System.out.println(resultset);
            
            Commons commons = new Commons();
            String query1 = "INSERT INTO car_infors(CAR_NAME, YEAR, CAR_INFOR_ID, COMPANY_ID)\n" + //
                    "VALUES ('name', '2000', '"+commons.generateUUID()+"', 'C001');";

            Statement statement1 = connection.createStatement();
            int resultset1 = statement1.executeUpdate(query1);
            System.out.println();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
