package com.example.study_servlets.controlls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.study_servlets.daos.OptionInforsDao;

@WebServlet(urlPatterns = "/optionInforsJPSServlet")
public class OptionInforsJPSServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String search = request.getParameter("search");

            OptionInforsDao optionInforsDao = new OptionInforsDao();
            ArrayList optionInforList = new ArrayList<>();
            optionInforList = optionInforsDao.SelectWithSearch(search);

            request.setAttribute("search", search);
            request.setAttribute("optionInforList", optionInforList);

            // 다음 호출 파일 
            RequestDispatcher  requestDispatcher = request.getRequestDispatcher("/cars/option_infors.jsp");
            requestDispatcher.forward(request, response);

        
            // getWriter 전에 charset 하기
            response.setContentType("text/html;charset=UTF-8");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}