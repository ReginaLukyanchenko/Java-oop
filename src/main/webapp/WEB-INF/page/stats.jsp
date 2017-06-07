<%@ page import="javafx.print.PageLayout" %>
<%@ page import="com.classes.user.Player" %>
<%@ page import="com.classes.user.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Regina
  Date: 07.06.2017
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
 <td>Name</td> <td>Login</td> <td>Score</td>
 <c:forEach var = "user" items="${list}">

         <tr>
            <td> ${user.name}</td>
            <td> ${user.login}</td>
            <td> ${user.player.score}</td>
         </tr>
 </c:forEach>
</table>

</body>
</html>
