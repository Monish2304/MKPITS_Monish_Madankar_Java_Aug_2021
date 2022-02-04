<%--
  Created by IntelliJ IDEA.
  User: madan
  Date: 04-02-2022
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>beandisp</title>
</head>
<body>
<jsp:useBean id="user" class="com.example.demo.JavaBean"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<jsp:setProperty name="user" property="*"></jsp:setProperty>

<h1> Welcome <jsp:getProperty name="user" property="uname"/> </h1>
<h1> Welcome <jsp:getProperty name="user" property="pass"/> </h1>
<h1> Welcome <jsp:getProperty name="user" property="city"/> </h1>
<h1> Welcome <jsp:getProperty name="user" property="mobno"/> </h1>

</body>
</html>
