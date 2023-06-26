package com.example.study_servlets.controls;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.HttpRequestHandlerServlet;

import com.example.study_servlets.daos.OptionInforsDao;

@WebServlet(urlPatterns = {"/OptionInforsDeleteServlet"})
public class OptionInforsDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            // parameter 받는 부분
            String unique_id = request.getParameter("unique_id");

            // 받은 parameter을 method로 실행
            OptionInforsDao optionInforsDao = new OptionInforsDao();
            int count = optionInforsDao.DeleteWithUniqueID(unique_id);

            // 결과값 산출
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();

            String contents = "Delete count : " + count;
            printWriter.println(contents);
            printWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
