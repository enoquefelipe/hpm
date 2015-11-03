<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="inc/header.jsp"/>
<section>
    <div class="alert alert-success" role="alert" id="message-sucesso"><s:property value="message" /></div>

    <h4 class="tittle-page">Cadastro de Departamento</h4>

    <form class="form-horizontal" action="caddep" method="POST">
        <div class="panel panel-default">
            <div class="panel-heading">     
                <h3 class="panel-title">Dados do Departamento</h3>
            </div>
            <div class="panel-body">

                <div class="form-group">
                    <label for="menu-setor" class="col-sm-2 control-label">Setor</label>
                    <div class="col-sm-6" id="menu-setor">
                    </div>
                </div>
                <div class="form-group">
                    <label for="nome" class="col-sm-2 control-label">Nome</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="nome" name="departamento.nome" placeholder="Nome..." required="" >
                    </div>
                </div>

                <div class="form-group">
                    <label for="descricao" class="col-sm-2 control-label">Descrição</label>
                    <div class="col-sm-8">
                        <textarea class="form-control" id="descricao" rows="3" name="departamento.descricao" placeholder="Descrição..."></textarea>
                    </div>
                </div>

                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">Status</label>
                    <div class="col-sm-2">
                        <select class="form-control" name="departamento.status">
                            <option>ATIVO</option>
                            <option>INATIVO</option>
                        </select>
                    </div>
                </div>
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
<script>
    $(window).load(function() {
        $.get("menuSetor",
                function(result) {
                    $('#menu-setor').html(result);
                });
    });
</script>