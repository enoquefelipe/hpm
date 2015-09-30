<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>

    <div class="jumbotron">
        <div class="container">
            <h2 style=" color: red;">Erro, Não foi possivel processar sua solicitação!</h2>
            <p>Ocorreu um erro e o sistema não conseguiu processar sua solicitação. Tente novamente dentro de alguns minutos.</p>
            <p>Motivo: <label style=" color: green;"><s:property  value="message"/></label></p>
            <p><a class="btn btn-primary btn-lg" href="#" role="button">Detalhes&raquo;</a></p>
        </div>
    </div>

</section>
<jsp:include page="inc/footer.html"/>