<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<<<<<<< HEAD
<% System.out.println("HelloWorldJSP - doGet()"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <% String contents = (String)request.getAttribute("contents"); %>
    <div>
    HTML : Yoju lab!
    </div>
    <div>
    Code Value : <%= contents %> 
    </div>
</body>
</html>
<% System.out.println("HelloWorldJSP - doGet() done."); %>
=======
    <% System.out.println("HelloWorldServlet - doGet()"); %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <% String contents = (String)request.getAttribute("contents"); %>
                <div>
                    HTML: Yoju lab!
                </div>
                <div>
                    Code Value : <%= contents %>
                </div>

        </body>

        </html>
        <% System.out.println("HelloWorldServlet - doGet() done."); %>
>>>>>>> 78985e92dbfa2aca2368c566912e273cf43d6426
