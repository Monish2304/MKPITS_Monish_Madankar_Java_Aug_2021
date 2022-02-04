<%@ taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: madan
  Date: 04-02-2022
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Addition</title>
</head>
<body>
    <table cellspacing="40px" align="center" bgcolor="#ffe7ce" style="margin-top: 1.5in";  >

        <form>

            <tr>
                <td> <label> Enter Num-1 value : </label> </td>

                <td> <input type="text"> </td>
            </tr>

            <tr>
                <td> <label> Enter Num-2 value : </label> </td>

                <td> <input type="text"> </td>

            </tr>

            <tr>

               <td align="right"> <a href="addresult.jsp" > <input type="button" value="Add"> </a> </td>

            </tr>

        </form>
    </table>

</body>
</html>
