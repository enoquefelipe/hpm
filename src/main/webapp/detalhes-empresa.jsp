<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>

    <div class="tittle-page">
        <label> Detalhes da Empresa </label>
    </div> 

    <div class="panel panel-default">
        <div class="panel-heading">Dados da Empresa</div>
        <div class="panel-body">

            <input type="hidden" name="empresa.id" value="<s:property value="empresa.id"/>">

            <div class="form-group">
                <label class="col-sm-2 control-label">ID:</label>
                <s:property value="empresa.id"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Razão Social:</label>
                <s:property value="empresa.razao_social"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Nome Fantasia:</label>
                <s:property value="empresa.nome_fantasia"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">CNPJ</label>
                <s:property value="empresa.cnpj"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Inscrição Estadual</label>
                <s:property value="empresa.inscricao_estadual"/>
            </div>

            <hr>

            <div class="tittle-page">
                <s:url id="editURL" action="selecionaEmpresa">
                    <s:param name="id" value="%{empresa.id}"></s:param>
                </s:url>
                <s:a href="%{editURL}">
                    <span class="glyphicon glyphicon-pencil" title="Clique aqui para editar!!!">&nbsp;</span>
                </s:a>

                <s:url id="deleteURL" action="excluirEmpresa">
                    <s:param name="oficina.id" value="%{empresa.id}"></s:param>
                </s:url>
                <s:a href="%{deleteURL}">
                    <span class="glyphicon glyphicon-trash" title="Clique aqui para excluir!!!">&nbsp;</span>
                </s:a>

                <a href="#" title="Clique aqui para editar!!!"></a>               
            </div>

        </div>
    </div>
</section>
<jsp:include page="inc/footer.html"/>