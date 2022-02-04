<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: madan
  Date: 04-02-2022
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Result</title>
</head>
<body>

<%
    String[] value1=request.getParameterValues("num1");
    String value2=request.getParameter("num2");

    PrintWriter pw = response.getWriter();
%>

<m:set var="num1" value="value1"> </m:set>
<m:set var="num2" value="value2"> </m:set>

<h2> Result =  </h2>  <m:out value="${num1+num2}"> </m:out>

</body>
</html>
