package com.simplilearn.phase2.validateuserlogin.validateuserlogin;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        if (userName.equals("admin") & password.equals("admin")){
            HttpSession session = request.getSession();
            session.setAttribute("username",userName);
            RequestDispatcher dispatcher =  request.getRequestDispatcher("dashboard.jsp");
            dispatcher.forward(request,response);
        }else{
            request.setAttribute("message","Invalid username / password.");
            RequestDispatcher dispatcher =  request.getRequestDispatcher("index.jsp");
            dispatcher.include(request,response);
        }

    }

}