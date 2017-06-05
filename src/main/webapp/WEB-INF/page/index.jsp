
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Quest room : Authorization</title>
  <link href="resource/css/index.css" rel="stylesheet" >
</head>
<body>
<div class="container-login">
  <form method="post" action="loginServlet" class="form">
    <h2 class="formHeading">Login</h2>
    <input type="text" class="inputInfo" name="login" placeholder="Login"/>
    <input type="password" class="inputInfo" name="password" placeholder="Password"/>
    <input type="submit" class="submitation" name="command" value="Login"/>
  </form>
</div>
<div class="container-registration">
  <form method="post" action="registrationServlet" class="form">
    <h2 class="formHeading">Registration</h2>
    <input type="text" class="inputInfo" name="name" placeholder="Name"/>
    <input type="text" class="inputInfo" name="login" placeholder="Login"/>
    <input type="password" class="inputInfo" name="password" placeholder="Password"/>
    <input type="submit" class="submitation" name="command" value="Register"/>
  </form>
</div>
</body>
</html>