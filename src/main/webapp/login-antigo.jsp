<%-- 
    Document   : login
    Created on : 05/07/2015, 11:13:09
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap-theme.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>

        <div id="cl-wrapper" class="login-container">

            <div style =" color: red ">
                <s:property value="message"/>
            </div>

            <div class="middle-login">
                <div class="block-flat">
                    <div class="header">							
                        <h3 class="text-center">GLPI</h3>
                    </div>
                    <div>
                        <form style="margin-bottom: 0px !important;" class="form-horizontal" action="index" method="POST">
                            <div class="content">
                                <h4 class="text-center">Login Access</h4>
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                            <input type="text" placeholder="Username" id="username" class="form-control" required name="username">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                            <input type="password" placeholder="Password" id="password" class="form-control" required name="password">
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="foot">
                                <button class="btn btn-default" data-dismiss="modal" type="submit">Log me in</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div> 
        </div>
    </body>
</html>
