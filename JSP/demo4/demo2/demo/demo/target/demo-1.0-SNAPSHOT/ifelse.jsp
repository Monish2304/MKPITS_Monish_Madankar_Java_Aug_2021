
<%@ taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: madan
  Date: 04-02-2022
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ifelse</title>
</head>
<body>

<m:set var="num1" value="25"> </m:set>

<m:set var="num2" value="30"> </m:set>

<m:choose>

    <m:when test="${num1>num2}">

        <h3> num1 is greater </h3>

    </m:when>

    <m:otherwise>

        <h3> num2 is greater </h3>

    </m:otherwise>

</m:choose>

</body>
</html>
