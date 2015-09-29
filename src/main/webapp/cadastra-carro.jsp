<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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
                    <label>Marca:</label>
                    <select class="form-control" name="carro.marca">
                        <option>Selecione...</option>
                    </select>
                </div>

                <div class="form-group">
                    <label>Marca:</label>
                    <input type="text" name="marca.nome" class="form-control"/>
                </div>

                <div class="form-group">
                    <label>Modelo:</label>
                    <input type="text" name="carro.modelo" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Preço:</label>
                    <input type="number" name="carro.preco" class="form-control"/>
                </div>
                <input type="submit" value="Enviar" class="btn btn-default" />
            </form>

            <br>

            <form method="POST" action="exccar">
                <div class="form-group">
                    <label>ID:</label>
                    <input type="text" name="carro.id" class="form-control"/>
                </div>
                <input type="submit" value="Excluir" class="btn btn-default" />
            </form>

            <div style=" color: green; text-align: center; margin-top: 50px;">
                <s:property value="message"/>
            </div>
        </div>
    </body>
</html>
