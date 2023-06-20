package com.example.study_servlets.controls;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.study_servlets.response;

@WebServlet(urlPatterns = "/mynameRequestServlet")
public class MynameRequestServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            
            PrintWriter printwriter = response.getWriter();
            String contents = "<!DOCTYPE html>\r\n" + //
                    "<html lang=\"en\">\r\n" + //
                    "\r\n" + //
                    "<head>\r\n" + //
                    "    <meta charset=\"UTF-8\">\r\n" + //
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                    "    <title>Document</title>\r\n" + //
                    "</head>\r\n" + //
                    "\r\n" + //
                    "<body>\r\n" + //
                    "    <div>Please write in your name</div>\r\n" + //
                    "    <form action=\"/getRequestParamsServlet\" method=\"get\">\r\n" + //
                    "        <div>\r\n" + //
                    "            First name : <input type=\"text\" name=\"first_name\" id=\"\">\r\n" + //
                    "        </div>\r\n" + //
                    "        <div>\r\n" + //
                    "            Last name : <input type=\"text\" name=\"last_name\" id=\"\">\r\n" + //
                    "        </div>\r\n" + //
                    "        <button type=\"submit\"> Submit </button>\r\n" + //
                    "    </form>\r\n" + //
                    "</body>\r\n" + //
                    "\r\n" + //
                    "</html>";
            printwriter.println(contents);
            printwriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }

}
