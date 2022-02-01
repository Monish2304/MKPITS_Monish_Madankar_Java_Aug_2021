package com.example.demo22;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String Name = request.getParameter("Uname");

        // Hello
        PrintWriter out = response.getWriter();

        out.println(Name);

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo11", "root", "root");
            Statement stmt = con.createStatement();
            out.println("Database Connected");

            String qr=("insert into loginformt values ('"+Name+"')");
            stmt.executeUpdate(qr);
            out.println("Data Inserted");

        } catch (Exception e) {
            out.println(e);
        }
    }
    public void destroy() {
    }
}