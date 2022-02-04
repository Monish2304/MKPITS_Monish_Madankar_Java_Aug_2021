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
<body   bgcolor="#d2ecff">



<form action="dashboard.jsp">

    <table cellspacing="10px" cellpadding="10px" style="margin-left: 2in">

        <tr>

            <td> <h3> FirstName : </h3> </td>

            <td> <input size="50%" type="text"  name="fname"> </td>

        </tr>

        <tr>

            <td> <h3> LastName : </h3> </td>

            <td> <input size="50%" type="text" name="lname"> </td>

        </tr>

        <tr>

            <td> <h3> UserName : </h3> </td>

            <td> <input size="50%" type="text"> </td>

        </tr>

        <tr>

            <td> <h3> Password : </h3> </td>


            <td> <input size="50%" type="password"> </td>

        </tr>

        <tr>

            <td> <h3> Email : </h3> </td>

            <td> <input size="50%" type="email"> </td>

        </tr>

        <tr>

            <td> <h3> MobileNo. : </h3> </td>


            <td> <input size="50%" type="text"> </td>

        </tr>

        <tr>

            <td> <h3> Date Of Birth : </h3> </td>

            <td> <input size="50%" type="date"> </td>

        </tr>

        <tr>

            <td> <h3> Address : </h3> </td>

            <td> <input size="50%" type="text   "> </td>

        </tr>

        <tr>

            <td> <h3> Gender : </h3> </td>

            <td> <input size="50%" type="radio" name="Gender"> Male  <input size="100%" type="radio" name="Gender"> Female </td>

        </tr>

        <tr>

            <td align="right">  <input type="submit"> </td>

        </tr>

    </table>

</form>

</body>
</html>
