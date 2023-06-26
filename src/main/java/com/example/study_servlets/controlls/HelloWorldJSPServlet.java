package com.example.study_servlets.controlls;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloWorldJSPServlet")
public class HelloWorldJSPServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        
        try {
<<<<<<< HEAD
            //String contents = "Yoju Lab !";
            String contents = request.getParameter("company"); 
            // 다음 파일 호출
        
          
            request.setAttribute("contents", "contents");
=======
            
           
            // String contents = "Yoju Lab !";
            String contents =  request.getParameter("company");
            request.setAttribute("contents", contents);
>>>>>>> b59bb2972c802a3bd896bd159649865a898a3602
            // path변경해야 함
            // setParam과 getParam 활용?
            RequestDispatcher  requestDispatcher = request.getRequestDispatcher("/helloworldJSP.jsp");
            requestDispatcher.forward(request, response);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       

    }
}