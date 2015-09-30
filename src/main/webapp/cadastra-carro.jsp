<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
        <title>Cadastra Carro</title>
        <style>
            #titulo-principal{
                text-align: center;
            }

            .botao-enviar{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div id="accordion">
                <h3> Cadastra Carro </h3>
                <div>
                    <form method="POST" action="cadcar">

                        <div class="form-group">
                            <label>Marca:</label>
                            <div id="pesquisaAjax">
                            </div>
                        </div>

                        <div class="form-group">
                            <label>Modelo:</label>
                            <input type="text" name="carro.modelo" class="form-control" required=""/>
                        </div>
                        <div class="form-group">
                            <label>Preço:</label>
                            <input type="number" name="carro.preco" class="form-control" required=""/>
                        </div>
                        <div class="botao-enviar">
                            <input type="submit" value="Enviar" class="btn btn-default" />
                        </div>
                    </form>
                </div>

                <h3> Cadastra Marca </h3>
                <div>
                    <form method="POST" action="cadmar">
                        <div class="form-group">
                            <label>Nome:</label>
                            <input type="text" name="marca.nome" class="form-control" required=""/>
                        </div>
                        <div class="botao-enviar">
                            <input type="submit" value="Enviar" class="btn btn-default" />
                        </div>
                    </form>
                </div>

                <h3> Excluir Carro </h3>
                <div>
                    <form method="POST" action="exccar">
                        <div class="form-group">
                            <label>ID:</label>
                            <input type="text" name="carro.id" class="form-control" required=""/>
                        </div>
                        <div class="botao-enviar">
                            <input type="submit" value="Excluir" class="btn btn-default" />
                        </div>
                    </form>
                </div>

                <h3> Lista de Marcas </h3>

            </div>
            <div style=" color: green; text-align: center; margin-top: 50px;">
                <s:property value="message"/>
            </div>
        </div>
        <div id="j"></div>
    </body>
    <script>
        $(window).load(function() {
            //    $('#j').text('document esta carregado');
            $.get("lismar",
                    function(result) {
                        $('#pesquisaAjax').html(result);
                    });
        });

        $(function() {
            $("#accordion").accordion();
        });
    </script>
</html>
