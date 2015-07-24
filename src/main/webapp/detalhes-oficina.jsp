<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>

    <div class="tittle-page">
        <label> Detalhes da Oficina </label>
    </div> 

    <div class="panel panel-default">
        <div class="panel-heading">Oficina</div>
        <div class="panel-body">

            <input type="hidden" name="oficina.id" value="<s:property value="oficina.id"/>">

            <div class="form-group">
                <label class="col-sm-2 control-label">ID:</label>
                <s:property value="oficina.id"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Silga:</label>
                <s:property value="oficina.sigla"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Nome:</label>
                <s:property value="oficina.nome"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Descrição</label>
                <s:property value="oficina.descricao"/>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">STATUS</label>
                <s:property value="oficina.status"/>
            </div>

            <hr>

            <div class="tittle-page">
                <s:url id="editURL" action="selecionaOficina">
                    <s:param name="id" value="%{oficina.id}"></s:param>
                </s:url>
                <s:a href="%{editURL}">
                    <span class="glyphicon glyphicon-pencil">&nbsp;</span>
                </s:a>

                <s:url id="deleteURL" action="excluirOficina">
                    <s:param name="oficina.id" value="%{oficina.id}"></s:param>
                </s:url>
                <s:a href="%{deleteURL}">
                    <span class="glyphicon glyphicon-trash">&nbsp;</span>
                </s:a>

                <a href="#" title="Clique aqui para editar!!!"></a>               
            </div>

        </div>
    </div>
</section>

<jsp:include page="inc/footer.html"/>