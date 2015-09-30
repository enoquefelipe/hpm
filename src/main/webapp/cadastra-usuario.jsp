<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>

    <div class="alert alert-success" role="alert" id="message-sucesso"><s:property value="message" /></div>

    <h4 class="tittle-page">Cadastro de Usuário</h4>
    <form action="cadpes" method="POST">

        <div id="accordion">
            <h3>Dados Pessoais</h3>
            <div class="form-horizontal">
                <div class="form-group">
                    <label for="name" class="col-sm-2 control-label">Nome</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="name" name="pessoa.nome" placeholder="Nome...">
                    </div>
                </div>

                <div class="form-group">
                    <label for="rg" class="col-sm-2 control-label">RG</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" id="rg" name="pessoa.rg" placeholder="RG...">
                    </div>
                </div>

                <div class="form-group">
                    <label for="cpf" class="col-sm-2 control-label">CPF</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="cpf" name="pessoa.cpf" placeholder="CPF..." data-mask="999.999.999-99">
                    </div>
                </div>

                <div class="form-group">
                    <label for="datepicker" class="col-sm-2 control-label">Data de Nascimento</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" id="datepicker" name="data" placeholder="Data de Nascimento..." data-mask="99-99-9999">
                    </div>
                </div>
            </div>
            <h3>Dados de Contato</h3>
            <div class="form-horizontal">

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Telefone Fixo</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" id="" name="pessoa.contato.residencial" placeholder="" data-mask="99 9999-9999">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Telefone Celular</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" id="" name="pessoa.contato.movel" placeholder="" data-mask="99 99999-9999">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">E-mail</label>
                    <div class="col-sm-6">
                        <input type="email" class="form-control" id="" name="pessoa.contato.email" placeholder="">
                    </div>
                </div>                    

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Site</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="" name="pessoa.contato.site" placeholder="">
                    </div>
                </div>
            </div>

            <h3>Dados de Localização</h3>
            <div class="form-horizontal"> 
                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">CEP</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" placeholder="" data-mask="99999-999" name="pessoa.endereco.cep">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Endereço</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="" name="pessoa.endereco.logradouro" placeholder="">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Bairro</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="" name="pessoa.endereco.bairro" placeholder="">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Cidade</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="" name="pessoa.endereco.cidade" placeholder="">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Estado</label>
                    <div class="col-sm-2">
                        <select name="pessoa.endereco.estado" id="" class="form-control">
                            <option>&nbsp;</option>
                            <option>AL</option>
                            <option>SP</option>
                            <option>RJ</option>
                        </select>
                    </div>
                </div>
            </div>

            <h3>Dados de Acesso</h3>
            <div class="form-horizontal">
                <div class="form-group">
                    <label for="username" class="col-sm-2 control-label">Usuario</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="username" name="pessoa.usuario.usuario"placeholder="Usuario..." title="Digite aqui os dado de login!!">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label">Senha</label>
                    <div class="col-sm-3">
                        <input type="password" class="form-control" id="password" name="pessoa.usuario.senha" placeholder="Senha..." title="Digite aqui os de senha!!">
                    </div>
                </div>

                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">Nível de Acesso</label>
                    <div class="col-sm-3">
                        <select class="form-control" name="pessoa.usuario.nivel" title="Escolha o nível de acesso para o usuário!!!">
                            <option>Administrador</option>
                            <option>Técnico</option>
                            <option>Usuário</option>
                        </select>
                    </div>
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