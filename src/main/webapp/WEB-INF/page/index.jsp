
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Quest room : Authorization</title>
  <link href="resource/css/index.css" rel="stylesheet" >
</head>
<body>
<section  class="sc" align="middle">
<div class="container" align="center">
  <form method="post" action="loginServlet" class="form">
    <h2 class="formHeading">Login</h2></br>
    <label> Input login :        </label>
    <input type="text" class="inputInfo" name="login" placeholder="Login"/></br>
    <label> Input password : </label>
    <input type="password" class="inputInfo" name="password" placeholder="Password"/></br>
    <input type="submit" class="submitation" name="command" value="Login"/></br>
  </form>
</div>
<div class="container"hidden>
  <br method="post" action="registrationServlet" class="form">
    <br>
    <button id="showCom">Показати коментарі</button>
    </br>
    <h2 class="formHeading" >Registration</h2></br>
    <label> Input name :       </label>
    <input type="text" class="inputInfo" name="name" placeholder="Name"/></br>
    <label> Input login :        </label>
    <input type="text" class="inputInfo" name="login" placeholder="Login"/></br>
    <label> Input password : </label>
    <input type="password" class="inputInfo" name="password" placeholder="Password"/></br>
    <input type="submit" class="submitation" name="command" value="Register"/></br>
  </form>
</div>
  <script>
      $(document).ready(function() {
          $('#showCom').click( function(){
              $(".comments").show();
              $('#hideCom').show();
              $('#showCom').hide();
          });
  </script>
</section>
</body>
</html>