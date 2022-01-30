<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    if (request.getSession().getAttribute("username") != null){
       RequestDispatcher dispatcher = request.getRequestDispatcher("dashboard.jsp");
        dispatcher.forward(request,response);
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Simplilearn Phase 2 - Validate User Login</title>
</head>
<body style="text-align: center">
<h1>Hello, Please login to continue.</h1>
<br/>
<form action="login" method="post">
    UserName<br/><input type="text" name="username"><br/>
    Password<br/><input type="password" name="password"><br/><br/>
    <input type="submit" value="Login">
</form>
<h2 style="text-align: center;color: red"> ${message} </h2>
</body>
</html>