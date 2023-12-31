package com.example.study_servlets.controlls;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/CheckoutResponseServlet")
public class CheckoutResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PrintWriter printWriter = response.getWriter();
            String firstName = request.getParameter("first_name");
            String LastName = request.getParameter("second_name");
            String Billingaddress = request.getParameter("billing_address");
            String Email = request.getParameter("email");
            String Address= request.getParameter("address");
            String Address2= request.getParameter("address2");
            String Zip= request.getParameter("zip");
            


            String contents = "<!DOCTYPE html>\r\n" + //
                    "<html lang=\"en\">\r\n" + //
                    "<head>\r\n" + //
                    "    <meta charset=\"UTF-8\">\r\n" + //
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                    "    <title>Document</title>\r\n" + //
                    "</head>\r\n" + //
                    "<body>\r\n" + //
                    "    <h3>Checkout form</h3>\r\n" + //
                    "    <form action=\"/CheckoutResponseServlet\" method=\"get\">\r\n" + //       
                    "    <div>Billing address</div>\r\n" + //
                    "    <div>\r\n" + //
                    "        First name "+firstName+" </div>\r\n" + //
                    "    <div>\r\n" + //
                    "        Last name "+LastName+"</div>\r\n" + //
                    "    <div>\r\n" + //
                    "        Billing address "+Billingaddress+"</div> \r\n" + //
                    "    <div>\r\n" + //
                    "        Email (Optional) "+Email+"</div>\r\n" + //
                    "    <div>\r\n" + //
                    "        Address "+Address+"</div> \r\n" + //
                    "    <div>\r\n" + //
                    "        Address 2 "+Address2+"(Optional)</div>\r\n"  + //
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
                    "        ZIP "+Zip+"</div>\r\n"+ //
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


    

