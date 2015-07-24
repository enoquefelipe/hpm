<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>
    <div class="alert alert-success" role="alert" id="message-sucesso"><s:property value="message" /></div>

    <h4 class="tittle-page">Editar de Oficina</h4>

    <form action="atualizaOficina" method="POST" class="form-horizontal">

        <div class="form-group">
            <label for="id" class="col-sm-1 control-label">Sigla</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="id" value="<s:property value="oficina.id"/>" disabled>
                <input type="hidden" name="oficina.id" value="<s:property value="oficina.id"/>">
            </div>
        </div>

        <div class="form-group">
            <label for="sigla" class="col-sm-1 control-label">Sigla</label>
            <div class="col-sm-2">
                <input type="text" name="oficina.sigla" class="form-control" id="sigla" value="<s:property value="oficina.sigla"/>" size="4" maxlength="4">
            </div>
        </div>

        <div class="form-group">
            <label for="nome" class="col-sm-1 control-label">Nome</label>
            <div class="col-sm-10">
                <input type="text" name="oficina.nome" class="form-control" id="nome" value="<s:property value="oficina.nome"/>">
            </div>
        </div>

        <div class="form-group">
            <label for="descricao" class="col-sm-1 control-label">Descrição</label>
            <div class="col-sm-10">
                <textarea class="form-control" rows="3" name="oficina.descricao" ><s:property value="oficina.descricao"/></textarea>
            </div>
        </div>

        <div class="form-group">
            <label for="nome" class="col-sm-1 control-label">Ativa?</label>
            <div class="col-sm-4">
                <select class="form-control" name="oficina.status">
                    <option>ATIVA</option>
                    <option>INATIVA</option>
                </select>
            </div>
        </div>

        <div class=" button-submit">
            <button type="submit" class="btn btn-default">
                <span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span> Concluir
            </button>
        </div>

    </form>
</section>
<jsp:include page="inc/footer.html"/>