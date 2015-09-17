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
        <!-- Fixed navbar -->
        <nav class="navbar navbar-inverse" role="navigation">
            <div class="container">
                <div class="navbar-header"  id="sanduiche">
                    <button class="navbar-toggle" type="button" data-target=".navbar-collapse" data-toggle="collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">HPM</a>
                </div>
                <div class="container-fluid">
                    <ul class="nav navbar-nav collapse navbar-collapse">
                        <li><a href="index.action">Home</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >Chamados<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="cadastra-solicitacao.jsp">Novo Chamado</a></li>
                                <li class="divider"></li>
                                <li><a href="lischa.action">Consultar Chamado</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >Cadastros<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="cadastra-solicitacao.jsp">Chamado</a></li>
                                <li><a href="cadastra-usuario.jsp">Usuário</a></li>
                                <li><a href="cadastra-empresa.jsp">Empresa</a></li>
                                <li><a href="cadastra-oficina.jsp">Oficina</a></li>
                                <li><a href="listaOficinasDropdown.action">Ocorrência</a></li>
                                <li><a href="cadastra-setor.jsp">Setor</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >Consultas<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="lischa.action">Chamados</a></li>
                                <li><a href="lisemp.action">Empresas</a></li>
                                <li><a href="listaOficinas.action">Oficinas</a></li>
                                <li><a href="listaOficinasAjax.action">Oficinas Ajax</a></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right collapse navbar-collapse">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><%=session.getAttribute("usuario")%><b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="perfil.jsp">Perfil</a></li>
                                <li class="divider"></li>
                                <li><s:url action="Logout" var="url"/><s:a href="%{url}">Sair</s:a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
<div class="container">