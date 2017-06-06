
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quest room : Main menu</title>
    <link href="resource/css/menu.css" rel="stylesheet" >
</head>
<body>
    <div class="container">
        <img src="resource/image/newGameButton.jpg"  width="100%"
         alt="newGame" usemap="#newGame"><br><br><br><br><br>
        <img src="resource/image/continueButton.jpg" width="100%"
             alt="continue" usemap="#continue"><br><br><br><br><br>
        <img src="resource/image/statsButton.jpg"    width="100%"
             alt="stats" usemap="#stats"><br><br><br><br><br>
        <img src="resource/image/exitButton.jpg"     width="100%"
             alt="exit" usemap="#exit">
    </div>
    <p><map name="newGame">
           <area shape="rect" coords="0,0,1000,400" href="new.html" alt="New game">
       </map>
       <map name="continue">
           <area shape="rect" coords="0,0,1000,400" href="cont.html" alt="Continue">
       </map>
       <map name="stats">
           <area shape="rect" coords="0,0,1000,400" href="stats.html" alt="Stats">
       </map>
       <map name="exit">
           <area shape="rect" coords="0,0,1000,400" href="exit.html" alt="Exit">
       </map>
    </p>
</body>
</html>