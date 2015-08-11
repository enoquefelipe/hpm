<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>HPM</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap-theme.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/jquery-ui.css">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <div>
            <!-- Fixed navbar -->
            <nav class="navbar navbar-inverse navbar">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar"  aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">HPM</a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="index.action">Home</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >Chamados<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="cadastra-solicitacao.jsp">Novo Chamado</a></li>
                                    <li class="divider"></li>
                                    <li><a href="listaChamados.action">Consultar Chamado</a></li>
                                </ul>
                            </li>

                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >Cadastros<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="cadastra-usuario.jsp">Usuário</a></li>
                                    <li><a href="cadastra-empresa.jsp">Empresa</a></li>
                                    <li><a href="cadastra-oficina.jsp">Oficina</a></li>
                                </ul>
                            </li>

                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >Consultas<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="listaChamados.action">Consultar Chamado</a></li>
                                    <li><a href="listaOficinas.action">Oficinas</a></li>
                                    <li><a href="listaOficinasAjax.action">Oficinas Ajax</a></li>
                                </ul>
                            </li>

                        </ul>
                        <ul class="nav navbar-nav navbar-right collapse navbar-collapse">
                            <li><s:url action="Logout" var="url"/>
                                <s:a href="%{url}">Sair</s:a>
                            </li>
                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </nav>
        </div>

        <div class="container">