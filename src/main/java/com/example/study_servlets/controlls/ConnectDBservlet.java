

package com.example.study_servlets.controlls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.study_servlets.controlls.commons.Commons;
import com.example.study_servlets.daos.CarInforDao;
import com.example.study_servlets.daos.FactorysDao;

@WebServlet(urlPatterns = "/ConnectDBservlet")
public class ConnectDBservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // MySQL workbench 실행: JDBC
            // User/password와 접속 IP:port 접속
            // String url = "jdbc:mysql://192.168.0.94:3306/db_cars";
            // String user = "yojulab";
            // String password = "!yojulab*";

            // Connection connection = DriverManager.getConnection(url, user, password);
            // System.out.println("DB연결 성공\n");

            // 클라이언트 html 화면 제공
            
                 String contents = "<!DOCTYPE html>\r\n" + //
                    "<html lang=\"en\">\r\n" + //
                    "\r\n" + //
                    "<head>\r\n" + //
                    "    <meta charset=\"UTF-8\">\r\n" + //
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + //
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                    "    <title>Bootstrap Template</title>\r\n" + //
                    "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.css\">\r\n"
                    + //
                    "    <link rel=\"stylesheet\" href=\"../css/commons.css\">\r\n" + //
                    "</head>\r\n" + //
                    "\r\n" + //
                    "<body>\r\n" + //
                    "    <table class=\"table table-bordered table-hover\">\r\n" + //
                    "        <thead>\r\n" + //
                    "            <tr>\r\n" + //
                    "                <th>CAR_NAME</th>\r\n" + //
                    "                 <th>YEAR</th>\r\n" + //  
                    "                <th>CAR_INFOR_ID</th>\r\n" + //
                    "                <th>COMPANY_ID</th>\r\n" + //
                    "            </tr>\r\n" + //
                    "        </thead>\r\n" + //
                    "        <tbody>\r\n";



            // FactorysDao factorysDao = new FactorysDao();
            // ArrayList factoryList = new ArrayList();
            // factoryList = factorysDao.selectAll();
            // for(int i = 0; i < factoryList.size(); i++) {
            // HashMap hashMap = new HashMap();
            // hashMap = (HashMap) factoryList.get(i);
            // contents = contents + " <tr>\r\n" + //
            // " <td>" + hashMap.get("COMPANY_ID") + "</td>\r\n" + //
            // " <td>" + hashMap.get("COMPANY") + "</td>\r\n" + //
            // " </tr>\\r\\n";
            // }

            CarInforDao carInforDao = new CarInforDao();
            ArrayList carInforList = new ArrayList();
            carInforList = carInforDao.selectAll();
            for (int i = 0; i < carInforList.size(); i++) 
            {
                HashMap hashMap = new HashMap();
                hashMap = (HashMap) carInforList.get(i);
                contents = contents + " <tr>\r\n" + //
                        "<td>" + hashMap.get("CAR_NAME") + "</td>\r\n" + //
                        "<td>" + hashMap.get("YEAR") + "</td>\r\n" + //
                        "<td>" + hashMap.get("CAR_INFOR_ID") + "</td>\r\n" + //
                        "<td>" + hashMap.get("COMPANY_ID") + "</td>\r\n" + //
                        "</tr>\\r\\n";
            }

            contents = contents + "<tbody>\r\n" +
                    "</tbody>\r\n" + //
                    "</table>\r\n" + //
                    " </div>\r\n" + //
                    "</body>\r\n" + //
                    "</html>";

            // 클라이언트에 HTML 화면 제공
            response.setContentType("text/html;charset=UTF-8"); // UTF-8: 통상적으로 character를 쓸 때 사용, 글자 깨짐 방지
            PrintWriter printwriter = response.getWriter();
            printwriter.println(contents);
            printwriter.close();

            // // SELECT COUNT(*) AS CNT FROM factorys;
            // query = "SELECT COUNT(*) AS CNT FROM factorys";
            // resultSet = statement.executeQuery(query);
            // int totalCount = 0;
            // while (resultSet.next()) {
            // System.out.println(resultSet.getInt("CNT"));
            // totalCount = resultSet.getInt("CNT");
            // }

            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}