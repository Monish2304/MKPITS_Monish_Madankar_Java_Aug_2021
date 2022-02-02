<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %><%--
  Created by IntelliJ IDEA.
  User: madan
  Date: 02-02-2022
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form>

    First-Name : <input type="text" name="fname"> <br> <br>

    Last-Name : <input type="text" name="lname"> <br> <br>

    UserName : <input type="text"> <br> <br>

    Password : <input type="password"> <br> <br>

    Email Id : <input type="email"> <br> <br>

    Mobile No. : <input type="text"> <br> <br>

    Date of Birth : <input type="date"> <br> <br>

    <label> Select Gender : </label>

    <input type="radio" name="Gender"> Male

    <input type="radio" name="Gender"> Female <br> <br>

    <input type="submit" <a href="newpage.jsp"> get back to login </a>> <br> <br>
    

</form>

</body>
</html>
