<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>LOGIN</title>
        <link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.min.css">
        <style>
            #titulo-login{
                text-align: center;  
            }

            .form-login{
                background-color: #eee;
                margin: auto;
                padding: 30px;
                width: 500px;
                margin-top: 13%;
            }

            .alert-login{
                text-decoration:blink;
                color: red;
                margin-top: 10px;
                text-align: center;
            }

            @media screen and (max-width: 600px) { 
                .form-login{
                    width: 100%;
                    margin: 0;
                    margin-top: 30%;
                    background-color: #eee;
                } 
            } 
        </style>
    </head>
    <body>      

        <form action="Login" method="POST" class="form-login">
            <h2 id="titulo-login"> HPM </h2>
            <div class="form-group">
                <div class="input-group">

                    <label class="input-group-addon">
                        <span class="glyphicon glyphicon-user"></span>
                    </label>
                    <input type="text" name="usuario" class="form-control" placeholder="Username" title="Digite aqui o seu usuário!!">
                </div>
            </div>

            <div class="form-group">
                <div class="input-group">

                    <label class="input-group-addon">
                        <span class="glyphicon glyphicon-lock"></span>
                    </label>
                    <input type="password" name="senha" class="form-control" placeholder="Password" title="Digite aqui a sua senha!!">
                </div>
            </div>

            <div class="alert-login">
                <strong> <s:property value="mensagem" /> </strong>
            </div>

            <div>
                <input type="submit" value="Entrar" class="btn btn-default" />
            </div>

        </form>

    </body>
</html>
