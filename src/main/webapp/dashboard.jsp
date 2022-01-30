<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    if (request.getSession().getAttribute("username") == null){
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request,response);
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Simplilearn Phase 2 - Validate User Login - Dashboard</title>
</head>
<body>
<h1 style="text-align: center">Welcome, ${pageContext.session.getAttribute("username")} , Click <a href="logout">Here</a> to Logout </h1>
</body>
</html>