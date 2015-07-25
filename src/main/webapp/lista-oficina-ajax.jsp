<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<html>
    <head>
        <title>Ajax</title>

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap-theme.css">
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript">
            $('document').ready(function() {
                $('#buscar').click(function() {
                    $.post("listaOficinas", {
                        'oficina.descricao': $("#des").val()
                    },
                    function(result) {
                        $('#div1').append(result);
                    });
                });
            });
        </script>

    <body>
        <br>
        <div class="container">

            <form class="form-inline" >
                <div style="text-align: right">
                    <div class="input-group">
                        <input type="text" name="oficina.descricao" id="des" class="form-control" placeholder="Pesquisar...">
                        <span class="input-group-btn">
                            <button id="buscar" class="btn btn-default" type="button">
                                <span class="glyphicon glyphicon-search"></span>
                            </button>
                        </span>
                    </div>
                </div>
            </form

            <hr>

            <div id="div1">

            </div>

        </div>
    </body>
</html>