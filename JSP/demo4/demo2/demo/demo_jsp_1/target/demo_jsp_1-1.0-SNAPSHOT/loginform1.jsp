<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %><%--
  Created by IntelliJ IDEA.
  User: madan
  Date: 01-02-2022
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Registration Form </title>
</head>
<body>

<%
    String Name=request.getParameter("uname");
    String Password=request.getParameter("upass");
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginform","root","root");
        out.println("Database Connected");
        Statement stmt=con.createStatement();

        String qr=("insert into loginformt(uname,upass) values('"+Name+"','"+Password+"')");
        stmt.executeUpdate(qr);
        out.println("Data inserted successfully");
    }catch (Exception e){
        out.println(e);
    }
%>

    <form>

    Name <input type="text" name="uname"> <br> <br>

    Password <input type="password" name="upass"> <br> <br>

        <input type="button" value="login"> <br> <br>

    <label> Don't have an account? </label>

        <a href="newaccount.jsp"> Create account </a>

    </form>

</body>
</html>
