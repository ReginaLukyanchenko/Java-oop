<%@ page import="javafx.print.PageLayout" %>
<%@ page import="com.classes.user.Player" %>
<%@ page import="com.classes.user.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
