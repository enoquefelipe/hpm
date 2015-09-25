//if ($('#message-sucesso').is(':empty')) {
//    $('#message-sucesso').hide();
//}

$(function() {
    $("#accordion").accordion();

    $("#datepicker").datepicker({
        language: "pt-BR",
        dateFormat: 'dd-mm-yy'
    });



    var id = $("#os").val();


    $("#dialog").dialog({
        autoOpen: false,
        resizable: false,
        modal: true,
        buttons: {
            "Sim": function() {
                $(this).dialog("close");
                window.location = "exccha?id=" + id;
            },
            "Não": function() {
                $(this).dialog("close");
            }
        }
    });

    $("#opener").click(function() {
        $("#dialog").dialog('open');
    });
});

