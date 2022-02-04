<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>


<m:set var="num1" value="25"> </m:set>

<m:out value="${num1}"> </m:out>

<m:if test="${num1>20}">
    <p> num1 is greater </p>
</m:if>

<m:forEach var="i" begin="1" end="10">
    <h1> This is a java server pages standard tag library </h1>
    <m:out value="${i}"> </m:out>
</m:forEach>

</body>
</html>