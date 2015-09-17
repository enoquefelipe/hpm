<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>
    <div class="alert alert-success" role="alert" id="message-sucesso"><s:property value="message" /></div>

    <h4 class="tittle-page">Editar de Empresa</h4>

    <form action="atualizaEmpresa" method="POST" class="form-horizontal">
        <div class="panel panel-default">
            <div class="panel-heading">     
                <h3 class="panel-title">Dados da Empresa</h3>
            </div>
            <div class="panel-body">

                <div class="form-group">
                    <label for="id" class="col-sm-2 control-label">ID</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="id" value="<s:property value="empresa.id"/>" disabled>
                        <input type="hidden" name="empresa.id" value="<s:property value="empresa.id"/>">
                    </div>
                </div>

                <div class="form-group">
                    <label for="sigla" class="col-sm-2 control-label">Razão Social</label>
                    <div class="col-sm-8">
                        <input type="text" name="empresa.razao_social" class="form-control" id="sigla" value="<s:property value="empresa.razao_social"/>" size="4" maxlength="4">
                    </div>
                </div>

                <div class="form-group">
                    <label for="nome" class="col-sm-2 control-label">Nome Fantasia</label>
                    <div class="col-sm-8">
                        <input type="text" name="empresa.nome_fantasia" class="form-control" id="nome" value="<s:property value="empresa.nome_fantasia"/>">
                    </div>
                </div>

                <div class="form-group">
                    <label for="descricao" class="col-sm-2 control-label">CNPJ</label>
                    <div class="col-sm-8">
                        <input type="text" name="empresa.cnpj" class="form-control" id="cnpj" value="<s:property value="empresa.cnpj"/>">
                    </div>
                </div>

                <div class=" button-submit">
                    <button type="submit" class="btn btn-default">
                        <span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span> Concluir
                    </button>
                </div>

            </div>
        </div>
    </form>
</section>
<jsp:include page="inc/footer.html"/>