package com.example.study_servlets.controlls.commons;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.study_servlets.daos.OptionInforsDao;

@WebServlet(urlPatterns = "/optionInforsInsertServlet")
public class OptionInforsInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            
            // Generate UUID
            String unique_id = java.util.UUID.randomUUID().toString();
            
            OptionInforsDao optionInforsDao = new OptionInforsDao();
            optionInforsDao.InsertWithUniqueId(name, unique_id);

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            String contents = "Insert successful";
            printWriter.println(contents);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
    

