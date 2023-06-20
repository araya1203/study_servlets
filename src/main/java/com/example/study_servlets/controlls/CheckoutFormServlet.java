package com.example.study_servlets.controlls;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/CheckoutFormServlet")
public class CheckoutFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PrintWriter printWriter = response.getWriter();
            String contents = "<!DOCTYPE html>\r\n" + //
                    "<html lang=\"en\">\r\n" + //
                    "<head>\r\n" + //
                    "    <meta charset=\"UTF-8\">\r\n" + //
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                    "    <title>Document</title>\r\n" + //
                    "</head>\r\n" + //
                    "<body>\r\n" + //
                    "    <h3>Checkout form</h3>\r\n" + //
                    "    <form action=\"/CheckoutFormServlet\" method=\"get\">\r\n" + //       
                    "    <div>Billing address</div>\r\n" + //
                    "    <div>\r\n" + //
                    "        First name <input type=\"text\" name=\"first_name\">\r\n" + //
                    "    </div>\r\n" + //
                    "    <div>\r\n" + //
                    "        Last name <input type=\"text\" name=\"last_name\">\r\n" + //
                    "    </div>\r\n" + //
                    "    <div>\r\n" + //
                    "        Billing address <input type=\"text\" name=\"billing_address\">\r\n" + //
                    "    </div>\r\n" + //
                    "    <div>\r\n" + //
                    "        Email (Optional) <input type=\"text\" name=\"email\">\r\n" + //
                    "    </div>\r\n" + //
                    "    <div>\r\n" + //
                    "        Address <input type=\"text\" name=\"address\">\r\n" + //
                    "    </div>\r\n" + //
                    "    <div>\r\n" + //
                    "        Address 2 (Optional) <input type=\"text\" name=\"address2\">\r\n" + //
                    "    </div>\r\n" + //
                    "    <div>\r\n" + //
                    "        <label for=\"country\">Country</label>\r\n" + //
                    "        <select name=\"country\" id=\"country\">\r\n" + //
                    "            <option value=\"choose...\" selected=\"\">Choose...</option>\r\n" + //
                    "            <option value=\"unitedstates\">United States</option>\r\n" + //
                    "            <option value=\"southkorea\">South Korea</option>\r\n" + //
                    "            <option value=\"japan\">Japan</option>\r\n" + //
                    "            <option value=\"china\">China</option>\r\n" + //
                    "            <option value=\"germany\">Germany</option>\r\n" + //
                    "        </select>\r\n" + //
                    "    </div>\r\n" + //
                    "    <div>\r\n" + //
                    "        <label for=\"state\">State</label>\r\n" + //
                    "        <select name=\"state\" id=\"state\">\r\n" + //
                    "            <option value=\"choose...\" selected=\"\">Choose...</option>\r\n" + //
                    "            <option value=\"unitedstates\">United States</option>\r\n" + //
                    "            <option value=\"southkorea\">South Korea</option>\r\n" + //
                    "            <option value=\"japan\">Japan</option>\r\n" + //
                    "            <option value=\"china\">China</option>\r\n" + //
                    "            <option value=\"germany\">Germany</option>\r\n" + //
                    "        </select>\r\n" + //
                    "    </div>\r\n" + //
                    "    <div>\r\n" + //
                    "        ZIP <input type=\"text\" name=\"zip\" placeholder=\"12345\">\r\n" + //
                    "    </div>\r\n" + //
                    "    <div class=\"form-check\">\r\n" + //
                    "        <input type=\"checkbox\" class=\"form-check-input\" id=\"same-address\">\r\n" + //
                    "        <label class=\"form-check-label\" for=\"same-address\">Shipping address is the same as my billing address</label>\r\n" + //
                    "    </div>\r\n" + //
                    "    <div class=\"form-check\">\r\n" + //
                    "        <input type=\"checkbox\" class=\"form-check-input\" id=\"save-info\">\r\n" + //
                    "        <label class=\"form-check-label\" for=\"save-info\">Save this information for next time</label>\r\n" + //
                    "    </div>\r\n" + //
                    "     <div>\r\n" + //
                    "            <button type=\"submit\"> Submit </button>\r\n" + //
                    "        </div>\r\n" + //
                    "</body>\r\n" + //
                    "</html>";

            printWriter.println(contents);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}



