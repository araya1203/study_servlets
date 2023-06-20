package com.example.study_servlets.controls;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/CheckoutServlet")
public class CheckoutServlet extends HttpServlet{
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
                    "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.css\">\r\n" + //
                    "    <link rel=\"stylesheet\" href=\"../css/commons.css\">\r\n" + //
                    "    <title>Document</title>\r\n" + //
                    "</head>\r\n" + //
                    "\r\n" + //
                    "<body>\r\n" + //
                    "\r\n" + //
                    "    <div class=\"container-fluid d-flex justify-content-center p-5\">\r\n" + //
                    "\r\n" + //
                    "        <form action=\"\">\r\n" + //
                    "            <div class=\"text-center mt-5 mb-5 \">\r\n" + //
                    "                Billing address\r\n" + //
                    "            </div>\r\n" + //
                    "            <div class=\"row col-12 m-2 \">\r\n" + //
                    "                <div class=\"col-6 sm-6\">\r\n" + //
                    "                    <label for=\"first_name\" class=\"form-label\">First Name: </label>\r\n" + //
                    "                    <input type=\"text\" name=\"first_name\" id=\"firstname\">\r\n" + //
                    "                </div>\r\n" + //
                    "                <div class=\"col-6 sm-6\">\r\n" + //
                    "                    <label for=\"last_name\" class=\"form-label\">Last Name: </label>\r\n" + //
                    "                    <input type=\"text\" name=\"last_name\" id=\"lastname\">\r\n" + //
                    "                </div>\r\n" + //
                    "            </div>\r\n" + //
                    "\r\n" + //
                    "            <div class=\"row m-1 mb-4\">\r\n" + //
                    "                Username\r\n" + //
                    "                <input type=\"text\" name=\"Username\" id=\"username\">\r\n" + //
                    "            </div>\r\n" + //
                    "            <div class=\"row m-1 mb-4\">\r\n" + //
                    "                Email(Optional)\r\n" + //
                    "                <input type=\"email\" name=\"Email\" id=\"email\">\r\n" + //
                    "            </div>\r\n" + //
                    "            <div class=\"row m-1 mb-4\">\r\n" + //
                    "                Address\r\n" + //
                    "                <input type=\"text\" name=\"Address\" id=\"address\">\r\n" + //
                    "            </div>\r\n" + //
                    "            <div class=\"row m-1 mb-4\">\r\n" + //
                    "                Address 2(Optional)\r\n" + //
                    "                <input type=\"text\" name=\"Address_Opt\" id=\"address_opt\">\r\n" + //
                    "            </div>\r\n" + //
                    "            <div>\r\n" + //
                    "                <div class=\"row col-12\">\r\n" + //
                    "                    <div class=\"container-fluid col-5\"> Country\r\n" + //
                    "                        <select class=\"form-select\" name=\"Country\" id=\"country\">\r\n" + //
                    "                            <option value=\"korea\">South Korea</option>\r\n" + //
                    "                            <option value=\"china\">China</option>\r\n" + //
                    "                            <option value=\"japan\">Japan</option>\r\n" + //
                    "                            <option value=\"mongolia\">Mongolia</option>\r\n" + //
                    "                            <option value=\"vietnam\">Vietnam</option>\r\n" + //
                    "                        </select>\r\n" + //
                    "                    </div>\r\n" + //
                    "                    <div class=\"container-fluid col-4\"> State\r\n" + //
                    "                        <select class=\"form-select\" name=\"State\" id=\"state\">\r\n" + //
                    "                            <option value=\"a\">A</option>\r\n" + //
                    "                            <option value=\"b\">B</option>\r\n" + //
                    "                            <option value=\"c\">C</option>\r\n" + //
                    "                            <option value=\"d\">D</option>\r\n" + //
                    "                            <option value=\"e\">E</option>\r\n" + //
                    "                        </select>\r\n" + //
                    "                    </div>\r\n" + //
                    "                    <div class=\"row col-3\"> Zip\r\n" + //
                    "                        <input type=\"text\" name=\"zip\" id=\"zip\">\r\n" + //
                    "                    </div>\r\n" + //
                    "                </div>\r\n" + //
                    "                <div class=>\r\n" + //
                    "                    <button class=\"text-center mt-3\" type=\"submit\"> Submit</button>\r\n" + //
                    "                </div>\r\n" + //
                    "            </div>\r\n" + //
                    "\r\n" + //
                    "\r\n" + //
                    "    </div>\r\n" + //
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
