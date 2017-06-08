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
    <title>Stats</title>
    <link rel="stylesheet" href="resource/css/stats.css" type="text/css">
</head>

<body>

<div>

    <header>
        <table>
    <tr>
        <td align="left"><a href="menu.jsp">Back to menu</a></td>
    </tr>
</table>
</header>
<table class="table"  align="center" valign="center" cellspacing="15px" >
 <td ><b> Name</b></td> <td><b>Login </b></td> <td><b> Score</b></td>
 <c:forEach var = "user" items="${list}">

         <tr>
            <td > ${user.name}</td>
            <td > ${user.login}</td>
            <td > ${user.player.score}</td>
         </tr>
 </c:forEach>
</table>
</div>
</body>
</html>
