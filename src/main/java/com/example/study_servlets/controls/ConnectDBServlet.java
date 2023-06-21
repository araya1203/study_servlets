package com.example.study_servlets.controls;

import com.example.study_servlets.controls.commons.Commons;

import java.io.IOException;
import java.io.PrintWriter;
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("HelloWorldServlet -doGet()");
        try {

            // 상대 DB와 연결, mySQL 연결 후에 진행할 것!

            // 클라이언트에 HTML 화면 제공
            // 화면 나오지 않음. 다음에 재시도
            String contents = "<!DOCTYPE html>\r\n" + //
                    "<html lang=\"en\">\r\n" + //
                    "\r\n" + //
                    "<head>\r\n" + //
                    "    <meta charset=\"UTF-8\">\r\n" + //
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + //
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                    "    <title>bootstrap_tables</title>\r\n" + //
                    "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\">\r\n"
                    + //
                    "</head>\r\n" + //
                    "\r\n" + //
                    "<body>\r\n" + //
                    "    <div class=\"container\">\r\n" + //
                    "        <table class=\"table table-bordered table-hover\">\r\n" + //
                    "            <thead>\r\n" + //
                    "                <tr>\r\n" + //
                    "                    <th>COMPANY_ID</th>\r\n" + //
                    "                    <th>COMPANY</th>\r\n" + //
                    "                </tr>\r\n" + //
                    "            </thead>\r\n" + //
                    "            <tbody>\r\n";

            String query = "SELECT COMPANY, COMPANY_ID\n" + //
                    "FROM factorys";

            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            ResultSet resultset = statement.executeQuery(query);

            while (resultset.next()) {
                contents = contents + "<tr>\r\n" + //
                        "                    <td>" + resultset.getString("COMPANY_ID") + "</td>\r\n" + //
                        "                    <td>" + resultset.getString("COMPANY") + "</td>\r\n" + //
                        "                </tr>\r\n";
                contents = contents + "</tbody>\r\n" + //
                        "        </table>\r\n" + //
                        "    </div>\r\n" + //
                        "\r\n" + //
                        "</body>\r\n" + //
                        "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
                        + //
                        "\r\n" + //
                        "</html>";
            }

            // 데이터가 날아가는 부분. 사실상 최종 작업.

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.println(contents);
            printWriter.close();

            // 상대방 DB로 보낼 부분

            // query = "SELECT CAR_NAME, YEAR, CAR_INFOR_ID, COMPANY_ID\n" + //
            // "FROM car_infors";

            // while (resultset.next()) {
            // System.out.println(resultset.getString("CAR_NAME") +
            // resultset.getString("YEAR")
            // + resultset.getString("CAR_INFOR_ID") + resultset.getString("COMPANY_ID"));
            // }

            // Commons commons = new Commons();
            // String query1 = "INSET INTO car_infors(CAR_NAME, YEAR, CAR_INFOR_ID,
            // COMPANY_ID)\n" + //
            // "VALUES ('VOLVRO', '2000', '" + commons.generateUUID() + "', 'C002');";

            // Statement statement1 = connection.createStatement();
            // int resultset1 = statement1.executeUpdate(query1);
            // System.out.println();

            statement.close();
            printWriter.close();
            // statement1.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        System.out.println("HellowWorldServlet -doGet() done.");
    }

}
