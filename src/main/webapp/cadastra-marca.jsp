<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css">
        <title>Cadastra Carro</title>
        <style>
            #titulo-principal{
                text-align: center;
            }
        </style>
    </head>
    <body>

        <div class="container">
            <h1 id="titulo-principal">Cadastra Carro</h1>
            <form method="POST" action="cadcar">
                <div class="form-group">
                    <label>Nome:</label>
                    <input type="text" name="marca.nome" class="form-control"/>
                </div>

                <input type="submit" value="Enviar" class="btn btn-default" />
            </form>
            <div style=" color: green; text-align: center; margin-top: 200px; ">
                <s:property value="message"/>
            </div>
        </div>
    </body>
</html>
