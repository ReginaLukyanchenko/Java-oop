/**
 * Created by Regina on 07.06.2017.
 */
$("#exitButton").click(function (e) {
    $.post("/exitSession", function (data) {
        window.location.href = "/registration.html";
    });
});

$("#Login").click(function (e) {
    $.post("/loginServlet", $("#formLogin").serialize(), function () {

            window.location.href = "../../menu.jsp";

    });
});
$(document).ready(function() {
    $('#showCom').click( function(){
        $(".comments").show();
        $('#hideCom').show();
        $('#showCom').hide();
    });
    $('#hideCom').click( function(){
        $(".comments").hide();
        $('#hideCom').hide();
        $('#showCom').show();
    });
});

