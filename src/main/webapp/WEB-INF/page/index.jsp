<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quest room : Authorization</title>
    <link href="resource/css/index.css" rel="stylesheet" >
</head>
<body>
<section  class="sc" align="middle">
    <div class="container" align="center">
        <form id="formLogin" method="post" action="/loginServlet" class="form">
            <h2 class="formHeading">Login</h2></br>
            <label> Input login :        </label>
            <input type="text" class="inputInfo" name="login" placeholder="Login"/></br>
            <label> Input password : </label>
            <input type="password" class="inputInfo" name="password" placeholder="Password"/></br>
            <input type="submit" class="submitation" name="command" value="Login"/></br>
            <br>
        </form>
            <div class="spoil">
                <div class="smallfont"><input type="button" value="Registration";
                                              class="input-button" onclick="if
                                        (this.parentNode.parentNode.getElementsByTagName('div')[1].getElementsByTagName('div')[0].style.display != '')
                                    { this.parentNode.parentNode.getElementsByTagName('div')[1].getElementsByTagName('div')[0].style.display = '';
                                        this.innerText = ''; this.value = 'not show'; }
                                        else
                                            { this.parentNode.parentNode.getElementsByTagName('div')[1].getElementsByTagName('div')[0].style.display = 'none';
                                        this.innerText = ''; this.value = 'Registration'; }"/>
                </div><div class="alt2"><div style="display: none; text-align:center;">
                <div class="container">
                    <form id="formRegistration" method="post" action="/registrationServlet" class="form">
                    <h2 class="formHeading" >Registration</h2></br>
                    <label> Input name :       </label>
                    <input type="text" class="inputInfo" name="name" placeholder="Name"/></br>
                    <label> Input login :        </label>
                    <input type="text" class="inputInfo" name="login" placeholder="Login"/></br>
                    <label> Input password : </label>
                    <input type="password" class="inputInfo" name="password" placeholder="Password"/></br>
                    <input type="submit" class="submitation" name="command" value="Registration"/></br>
        </form>
    </div>
            </div>
    <script src="/resource/js/index.js"></script>
    <script src="/resource/js/jquery-1.11.3.js"></script>
            </div>
</section>
</body>
</html>