<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %><%--
  Created by IntelliJ IDEA.
  User: madan
  Date: 03-02-2022
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<%
    String FName=request.getParameter("FirstName");
    String LName=request.getParameter("LastName");
    String UName=request.getParameter("UserName");
    String Pass=request.getParameter("Password");
    String Email=request.getParameter("Email");
    String MobNo=request.getParameter("MobileNo");
    String DOB=request.getParameter("Date Of Birth");
    String Addr=request.getParameter("Address");
    String Gender=request.getParameter("Gender");
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/loginform","root","root");
//            out.println("Database Connected");
        Statement stmt=con.createStatement();

        String qr=("insert into loginformt(FirstName,LastName,UserName,Password,Email,MobileNo,DAteOfBirth,Address,Gender) values('"+FName+"','"+LName+"','"+UName+"','"+Pass+"','"+Email+"','"+MobNo+"','"+DOB+"','"+Addr+"','"+Gender+"')");
        stmt.executeUpdate(qr);
        out.println("Data inserted successfully");
    }catch (Exception e){
        out.println(e);
    }
%>

<h1> Welcome to dashboard </h1>

</body>
</html>
