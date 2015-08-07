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
        <link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
        <meta name="viewport" content="width=device-width">
        <style>
            #cl-wrapper.login-container, #cl-wrapper.error-container{
                margin:0;
            }

            .login-container .middle-login{
                width:430px;
                left: 50%;
                top: 50%;
                position:absolute;
                margin-top: -170px;
                margin-left: -215px;
            }

            .login-container .block-flat{
                padding:0;
                border:0;
                overflow:hidden;
                border-radius:2px;
                -webkit-border-radius:2px;
                box-shadow: 0 1px 5px rgba(0, 0, 0, 0.6);
                margin-bottom:20px;
            }

            .login-container .block-flat .header{
                padding: 9px 20px;
                /*background:#2494F2;*/
                background: #000;
                border-bottom: 1px solid /* #2082D5 */;
            }

            .login-container .block-flat .header h3{
                line-height:35px;
                margin:0;
                /*color:#FFF;*/
                color: #FAFAFA;
                text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.3);
            }

            .login-container .header .logo-img{
                margin-right:3px;
            }

            .login-container .block-flat .content{
                padding:30px;
                padding-bottom:5px;
            }

            .login-container .block-flat .content .form-control{
                padding:10px 8px;
                height:auto;}

            .login-container .block-flat .content .form-group {
                margin-bottom:10px;
            }

            .login-container .block-flat .content .title{
                margin-top:0;
                margin-bottom:20px;
            }

            .login-container .block-flat .foot{
                text-align:right;
                padding:0 30px 15px;
            }

            .login-container .block-flat .foot .btn{
                min-width:70px;

            }
            .login-container .block-flat  .input-group-addon{
                background:#FAFAFA;
            }

            .login-container  .out-links{
                padding-right: 3px;
            }

            .login-container  .out-links a{  
                color: #C9D4F6; 
                text-shadow: 1px 1px 0 rgba(0, 0, 0, 0.2);
            }
            @media screen and (max-width: 600px) { 
                .middle-login{


                    padding-left: 20px;
                    padding-right: 20px;

                } 
            } 
        </style>
    </head>
    <body>

        <div id="cl-wrapper" class="login-container">

            <div style =" color: red ">
                <s:property value="message"/>
            </div>

            <div class="middle-login">
                <div class="block-flat">
                    <div class="header">							
                        <h3 class="text-center">HPM</h3>
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
                                <button class="btn btn-default" data-dismiss="modal" type="submit">Log me in</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div> 
        </div>
    </body>
</html>
