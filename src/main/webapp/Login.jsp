<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HPM</title>
        <link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
        <meta name="viewport" content="width=device-width">
        <style>
            .titulo-principal{
                margin-top: 100px;
            }

            @media screen and (max-width: 600px) { 
                body{
                    padding-left: 10px;
                    padding-right: 10px;
                    margin-left: 10px;
                    margin-right: 10px;
                } 
                .titulo-principal{
                    margin-top: 20px;
                }
            } 

            @media screen and (max-width: 768px) { 
                body{
                    padding-left: 10px;
                    padding-right: 10px;
                    margin-left: 10px;
                    margin-right: 10px;
                } 
                .titulo-principal{
                    margin-top: 20px;
                }
            } 

            @media screen and (max-width: 992px) { 
                body{
                    padding-left: 10px;
                    padding-right: 10px;
                    margin-left: 10px;
                    margin-right: 10px;
                } 
                .titulo-principal{
                    margin-top: 20px;
                }
            }
        </style>
    </head>
    <body>

        <div id="cl-wrapper" class="login-container">

            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-4">
                    <div>
                        <h4 class="titulo-principal">Bem-Vindo ao sistema HPM</h4>
                        <hr>
                    </div>

                    <div>
                        <form action="Login" method="POST" style="margin-bottom: 0px !important;" class="form-horizontal" >
                            <div class="content">
                                <h4 class="text-center">Login Access</h4>
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                            <input type="text" name="usuario" placeholder="Username" id="username" class="form-control" required >
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                            <input type="password" name="senha" placeholder="Password" id="password" class="form-control" required >
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="foot">
                                <button class="btn btn-default" data-dismiss="modal" type="submit">Entrar</button>
                            </div>
                            <br>
                            <div style =" color: red ">
                                <s:property value="mensagem"/>
                            </div>
                        </form>
                    </div>
                </div>

                <div class="col-md-4 titulo-principal">
                    <img src="http://eleal.hol.es/img/help.png" alt="acesso_restrito" class="img-responsive" />
                </div>
                <div class="col-md-2"></div>
            </div>

    </body>
</html>
