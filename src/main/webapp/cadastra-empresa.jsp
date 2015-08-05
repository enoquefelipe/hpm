<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>

    <h4 class="tittle-page">Cadastro de Empresa</h4>
    
    <form>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Dados da Empresa</h3>
            </div>
            <div class="panel-body">
                
                <div class="form-group">
                    <label for="">Nome</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Razão Social</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Nome Fantasia</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">CNPJ</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Incrição Estadual</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
                </div>

            </div>
        </div>

        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Dados de Localização</h3>
            </div>
            <div class="panel-body">
                <div class="form-group">
                    <label for="">CEP</label>
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="" data-mask="99999-999">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">
                                <span class="glyphicon glyphicon-search"></span>
                            </button>
                        </span>
                    </div>
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
        </div>

        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Dados de Contato</h3>
            </div>
            <div class="panel-body">
                <div class="form-group">
                    <label for="">Telefone Fixo</label>
                    <input type="text" class="form-control" id="" name="" placeholder="" data-mask="99 9999-9999">
                </div>

                <div class="form-group">
                    <label for="">Telefone Celular</label>
                    <input type="text" class="form-control" id="" name="" placeholder="" data-mask="99 99999-9999">
                </div>

                <div class="form-group">
                    <label for="">E-mail</label>
                    <input type="email" class="form-control" id="" name="" placeholder="">
                </div>

                <div class="form-group">
                    <label for="">Site</label>
                    <input type="text" class="form-control" id="" name="" placeholder="">
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