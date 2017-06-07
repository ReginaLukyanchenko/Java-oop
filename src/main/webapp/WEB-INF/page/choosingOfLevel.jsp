<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Choosing of level</title>
    <link href="resource/css/choosingOfLevel.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="wrap">
    <div class="button">
        <header>
            <table>
                <tr>
                    <td align="left"><a href="menu.jsp">Back to menu</a></td>
                    <td align="center"><label for="slide-1">1-st level</label></td>
                    <td align="center"><label for="slide-2">2-nd level</label></td>
                    <td align="center"><label for="slide-3">3-rd level</label></td>
                </tr>
            </table>
        </header>
        <input id="slide-1" type="radio" name="slides" checked>
        <section class="slide slide-one">
            <h1> Kitchen</h1>
        </section>
        <input id="slide-2" type="radio" name="slides"/>
        <section class="slide slide-two">
            <h1> Bedroom</h1>
        </section>
        <input id="slide-3" type="radio" name="slides"/>
        <section class="slide slide-three">
            <h1> Bathroom</h1>
        </section>
    </div>
</div>
</body>
</html>