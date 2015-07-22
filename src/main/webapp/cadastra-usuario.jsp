<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>

<section>

    <div class="alert alert-success" role="alert" id="message-sucesso"><s:property value="message" /></div>

    <h4 class="tittle-page">Cadastro de Usuário</h4>
    <form action="addPeople" method="POST">

        <div id="accordion">
            <h3>Dados Pessoais</h3>
            <div>
                <div class="form-group">
                    <label for="name">Nome</label>
                    <input type="text" class="form-control" id="name" name="pessoa.nome" placeholder="Nome...">
                </div>

                <div class="form-group">
                    <label for="rg">RG</label>
                    <input type="text" class="form-control" id="rg" name="pessoa.rg" placeholder="RG...">
                </div>

                <div class="form-group">
                    <label for="cpf">CPF</label>
                    <input type="text" class="form-control" id="cpf" name="pessoa.cpf" placeholder="CPF..." data-mask="999.999.999-99">
                </div>

                <div class="form-group">
                    <label for="nascimento">Data de Nascimento</label>
                    <input type="date" class="form-control" id="nascimento" name="pessoa.nascimento" placeholder="Data de Nascimento...">
                </div>
            </div>
            <h3>Dados de Contato</h3>
            <div>
                <div class="form-group">
                    <label for="">Telefone Fixo</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Telefone Celular</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">E-mail</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Site</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>
            </div>
            <h3>Dados de Localização</h3>
            <div>
                <div class="form-group">
                    <label for="">CEP</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Endereço</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Bairro</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Cidade</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Estado</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>
            </div>
            <h3>Dados de Acesso</h3>
            <div>
                <div class="form-group">
                    <label for="username">Usuario</label>
                    <input type="text" class="form-control" id="username" name="usuario.usuario"placeholder="Usuario..." title="Digite aqui os dado de login!!">
                </div>
                <div class="form-group">
                    <label for="password">Senha</label>
                    <input type="password" class="form-control" id="password" name="usuario.senha" placeholder="Senha..." title="Digite aqui os de senha!!">
                </div>
            </div>
        </div>

        <div id="botao-enviar">
            <button type="submit" class="btn btn-default" >
                <span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span> Salvar
            </button>
        </div>
    </form>
</section>
<jsp:include page="inc/footer.html"/>