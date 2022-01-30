package com.simplilearn.phase2.validateuserlogin.validateuserlogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().invalidate();
        RequestDispatcher dispatcher =  request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request,response);
    }

}
