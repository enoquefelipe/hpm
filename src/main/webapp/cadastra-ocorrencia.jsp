<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>
    <div class="alert alert-success" role="alert" id="message-sucesso"><s:property value="message" /></div>

    <h4 class="tittle-page">Cadastro de Ocorr�ncia</h4>

    <form class="form-horizontal" action="cadoco" method="POST">
        <div class="panel panel-default">
            <div class="panel-heading">     
                <h3 class="panel-title">Dados da Ocorr�ncia</h3>
            </div>
            <div class="panel-body">

                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">Oficina</label>
                    <div class="col-sm-2" id="menu-oficina">
                       
                    </div>
                </div>
                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">Nome</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="nome" name="ocorrencia.nome" placeholder="Nome..." >
                    </div>
                </div>

                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">Descri��o</label>
                    <div class="col-sm-8">
                        <textarea class="form-control" rows="3" name="ocorrencia.descricao" placeholder="Descri��o..."></textarea>
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
        $.get("menuOficina",
                function(result) {
                    $('#menu-oficina').html(result);
                });
    });
</script>