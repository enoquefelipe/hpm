<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>
    <div class="alert alert-success" role="alert" id="message-sucesso"><s:property value="message" /></div>

    <h4 class="tittle-page">Cadastro de Setor</h4>

    <form class="form-horizontal" action="addSetor" method="POST">
        <div class="panel panel-default">
            <div class="panel-heading">     
                <h3 class="panel-title">Dados do Setor</h3>
            </div>
            <div class="panel-body">

                <div class="form-group">
                    <label for="empresa" class="col-sm-2 control-label">Empresa</label>
                    <div class="col-sm-6" id="menu-empresa">
                    </div>
                </div>

                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">Nome</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="nome" name="setor.nome" placeholder="Nome..." >
                    </div>
                </div>

                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">Descrição</label>
                    <div class="col-sm-8">
                        <textarea class="form-control" rows="3" name="setor.descricao" placeholder="Descrição..."></textarea>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">Status</label>
                    <div class="col-sm-2">
                        <select class="form-control" name="setor.status">
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
        $.get("menuEmpresa",
                function(result) {
                    $('#menu-empresa').html(result);
                });
    });
</script>