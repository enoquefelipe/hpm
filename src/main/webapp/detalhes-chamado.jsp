<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>

<section>
    <div class="row">
        <div class="col-md-1"> </div>
        <div class="col-md-10">

            <div class="tittle-page">
                <label> Detalhes do Chamado </label>
            </div> 

            <div class="panel panel-default">
                <div class="panel-heading">Dados do Chamado</div>
                <div class="panel-body">

                    <!-- <form> -->
                    <div class="row">
                        <div class="form-group col-sm-4">
                            <label for="os">O.S <span class="glyphicon glyphicon-lock"></span></label>
                            <input class="form-control" id="os" name="ticket.id" value="<s:property value="id"/>" disabled style="color: red;">
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-sm-6">
                            <label for="solicitante">Solicitante</label>
                            <input class="form-control" id="solicitante" value="Enoque Felipe" disabled >
                        </div>

                        <div class="form-group col-sm-6">
                            <label for="ramal">Ramal</label>
                            <input class="form-control" id="ramal"name="ticket.ramal" value="<s:property value="ticket.ramal" />" disabled >
                        </div>

                        <div class="form-group col-sm-6">
                            <label for="departamento">Departamento</label>
                            <input class="form-control" id="departamento"name="ticket.departamento" value="<s:property value="ticket.departamento" />" disabled >
                        </div>

                        <div class="form-group col-sm-6">
                            <label for="tipo">Departamento</label>
                            <input class="form-control" id="tipo"name="ticket.tipo" value="<s:property value="ticket.tipo" />" disabled >
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="titulo">Título</label>
                                <input type="text" class="form-control" id="titulo" name="ticket.titulo" value="<s:property value="ticket.titulo" />" disabled  >
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <div>
                                <label for="descricao">Descrição</label>
                                <textarea class="form-control" id="descricao" rows="10" name="ticket.descricao"  disabled ><s:property value="ticket.descricao" /></textarea>
                            </div>
                        </div>
                    </div>
                    <div>
                        <div class=" button-submit">
                            <button class="btn btn-default">Atender</button>
                            <button class="btn btn-primary" id="opener">Excluir</button>

                            <div id="dialog" title="Atenção" style="text-align: center;">
                                <p>Deseja realmente excluir?</p>
                            </div>

                        </div>
                    </div>
                    <!-- </form> -->
                </div>
            </div>
        </div>

        <div class="col-md-1"></div>
    </div>
</section>

<jsp:include page="inc/footer.html"/>

<script>
 
</script>