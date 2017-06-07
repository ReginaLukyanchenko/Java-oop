<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Level1</title>
    <meta http-equiv="CONTENT-TYPE" content="text/html; charset=windows-1251">
    <link href="resource/css/Level1.css" rel="stylesheet" type="text/css">
</head>
<body>
<div style="width:100px; height: 100px; background: #ff57d7" onmousedown="move(this)">

</div>
<script language="JavaScript">
    function move(div) {
        document.onmousedown=function () {return false}
        div.style.cursor='move';
        document.onmousedown=function (e) {
            x=e.pageX;
            y=e.pageY;
            left=div.offsetLeft;
            top=div.offsetTop;
            left=x-left;
            top=y-top;
            document.onmousemove=function (e) {
                x=e.pageX;
                y=e.pageY;
                div.style.top=y-top+'px';
                div.style.left=x-left+'px';
            }
        }
        document.onmouseup=function () {
            div.style.cursor='auto';
            document.onmousedown=function () {}
            document.onmousemove=function () {}
        }
    }
</script>
</body>
</html>