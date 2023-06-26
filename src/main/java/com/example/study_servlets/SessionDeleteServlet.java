package com.example.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/session/DeleteServlet")
public class SessionDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            // expited session
            HttpSession httpSession = request.getSession();
            httpSession.invalidate();
            
           
            // delete cookies
            Cookie[] cookies = request.getCookies();
            String content = "<div>CookiesGetAndDeleteServlet</div>";
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                if (name.equals("secondName")) { // 쿠키 삭제
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                } else { // 출력
                    content = content + "<div>" + name + ", " + value + "</div>";
                }
            }

            PrintWriter printWriter = response.getWriter();
            String contents = "<div>Logout !</div>";
            printWriter.println(contents);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

            {

            }
        }
    }
}