<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<% System.out.println("HelloWorldJSP - doGet()"); %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <% String usernameSession = (String) session.getAttribute("username"); %>
    <div>
        User Name: <%= usernameSession %>
    </div>
    <div>
        Login Status:
        <form action = ""> 
        <% if (usernameSession == null) { %>
        <button type="submit" formaction="/session/CreateServlet?username=yojulab&password=1234" method="get">Login</button>
        <% } else { %>
        <button type="submit" formaction="/session/DeleteServlet"> Logout </button>
        <% } %>
        </form>
    </div>
    <% String contents = (String) request.getAttribute("contents"); %>
    <div>
        HTML Value: Yoju lab!
    </div>
    <div>
        Code Value: <%= contents %>
    </div>
</body>

</html>
<% System.out.println("HelloWorldJSP - doGet() done."); %>
