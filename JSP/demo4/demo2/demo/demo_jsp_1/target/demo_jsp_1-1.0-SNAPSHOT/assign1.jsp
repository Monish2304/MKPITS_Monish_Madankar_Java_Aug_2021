<%@ page import="java.sql.Array" %><%--
  Created by IntelliJ IDEA.
  User: madan
  Date: 01-02-2022
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String col[] = {"violet","indigo","blue","green","yellow","orange","red","purple","brown","pink"};

       for (int i=0;i<=9;i++)
       {
    %>
    <font size="12" color="<%=""+col[i]%>">  <% out.println(i); %> </font> <br>
    <%
        }
    %>




</body>
</html>
