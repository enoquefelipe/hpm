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
                <label class="col-sm-2 control-label">CNPJ:</label>
                <s:property value="empresa.cnpj"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Inscrição Estadual:</label>
                <s:property value="empresa.inscricao_estadual"/>
            </div>
        </div>
    </div>

    <div class="panel panel-default">
        <div class="panel-heading">Dados de Localização</div>
        <div class="panel-body">

            <input type="hidden" name="endereco.id" value="<s:property value="empresa.endereco.id"/>">

            <div class="form-group">
                <label class="col-sm-2 control-label">CEP:</label>
                <s:property value="empresa.endereco.cep"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Endereço:</label>
                <s:property value="empresa.endereco.logradouro"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Bairro:</label>
                <s:property value="empresa.endereco.bairro"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Cidade:</label>
                <s:property value="empresa.endereco.cidade"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Estado:</label>
                <s:property value="empresa.endereco.estado"/>
            </div>
        </div>
    </div>

    <div class="panel panel-default">
        <div class="panel-heading">Dados de Contato</div>
        <div class="panel-body">

            <input type="hidden" name="contato.id" value="<s:property value="empresa.contato.id"/>">

            <div class="form-group">
                <label class="col-sm-2 control-label">Telefone Fixo:</label>
                <s:property value="empresa.contato.residencial"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Telefone Celular:</label>
                <s:property value="empresa.contato.movel"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">E-mail:</label>
                <s:property value="empresa.contato.email"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Site:</label>
                <s:property value="empresa.contato.site"/>
            </div>

            <hr>

            <div class="tittle-page">
                <s:url id="editURL" action="selemp">
                    <s:param name="id" value="%{empresa.id}"></s:param>
                </s:url>
                <s:a href="%{editURL}">
                    <span class="glyphicon glyphicon-pencil" title="Clique aqui para editar!!!">&nbsp;</span>
                </s:a>

                <a href="excemp?empresa.id=<s:property value="empresa.id"/>&empresa.endereco.id=<s:property value="empresa.endereco.id"/>&empresa.contato.id=<s:property value="empresa.contato.id"/>" class="glyphicon glyphicon-trash" title="Clique aqui para excluir!!!">&nbsp;</a>
         
            </div>
        </div>
    </div>


</section>
<jsp:include page="inc/footer.html"/>