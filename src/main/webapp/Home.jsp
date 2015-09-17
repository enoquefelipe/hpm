<jsp:include page="inc/header.jsp"/>

<section>
    <div class="row">
        <div class="col-md-2"> </div>
        <div class="col-md-8">
            <p><center> Bem vindo ao HPM </center></p>

            <p>
                <label> Usuário: </label> <%=session.getAttribute("usuario")%>
            </p>

            <div>
                <center>
                    <img src="img/acesso_restrito.gif" alt="acesso_restrito" class="img-responsive"  />
                </center>
            </div>
        </div> 

        <div class="col-md-2"></div>
    </div>
</section>

<jsp:include page="inc/footer.html"/>