package com.example.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

@WebServlet(name = "Demo1Servlet", value = "/Demo1Servlet")
public class Demo1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("hello");

        try {
            Class.forName("com.mysql.jbc.Driver");
            Connection con= DriverManager.getConnection("jdbc://locslhost:3306/demo1","root","root");
            out.println("DataBase Connected");

        }catch (Exception e){
            out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
