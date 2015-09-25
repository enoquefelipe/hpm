<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>
    <div class="alert alert-success" role="alert" id="message-sucesso"><s:property value="message" /></div>

    <h4 class="tittle-page">Cadastro de Empresa</h4>

    <form action="cadastraEmpresa" method="POST" class="form-horizontal">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Dados da Empresa</h3>
            </div>
            <div class="panel-body">

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Razão Social</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="" name="empresa.razao_social" placeholder="" required="">
                    </div>
                </div>

                <div class="form-group"> 
                    <label class="col-sm-2 control-label" for="">Nome Fantasia</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="" name="empresa.nome_fantasia" placeholder="" required="">
                    </div> 
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">CNPJ</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="" name="empresa.cnpj" placeholder="" data-mask="99.999.999/9999-99" required="">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Incrição Estadual</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="" name="empresa.inscricao_estadual" placeholder="">
                    </div>
                </div>

            </div>
        </div>

        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Dados de Localização</h3>
            </div>

            <div class="panel-body">

                <div class="form-group">
                    <label for="" class="col-sm-2 control-label">CEP</label>
                    <div class="col-sm-2">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="" data-mask="99999-999" name="endereco.cep">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <span class="glyphicon glyphicon-search"></span>
                                </button>
                            </span>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Endereço</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="" name="endereco.logradouro" placeholder="">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Bairro</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="" name="endereco.bairro" placeholder="">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Cidade</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="" name="endereco.cidade" placeholder="">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Estado</label>
                    <div class="col-sm-1">
                        <input type="text" class="form-control" id="" name="endereco.estado" placeholder="">
                    </div>
                </div>

            </div>
        </div>

        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Dados de Contato</h3>
            </div>
            <div class="panel-body">
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Telefone Fixo</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" id="" name="contato.residencial" placeholder="" data-mask="99 9999-9999">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Telefone Celular</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" id="" name="contato.movel" placeholder="" data-mask="99 99999-9999">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">E-mail</label>
                    <div class="col-sm-6">
                        <input type="email" class="form-control" id="" name="contato.email" placeholder="">
                    </div>
                </div>                    

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="">Site</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="" name="contato.site" placeholder="">
                    </div>
                </div>

            </div>
        </div>

        <div>
            <div id="botao-enviar">
                <button type="submit" class="btn btn-default" >
                    <span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span> Salvar
                </button>
            </div>
        </div>
    </form>

</section>
<jsp:include page="inc/footer.html"/>