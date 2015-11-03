<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>
    <div class="row">
        <div class="col-md-2"> </div>
        <div class="col-md-8">
            <form action="novcha" method="POST">
                <hr>

                <div class="tittle-page">
                    <label> Novo Chamado </label>
                </div> 

                <div style=" color: green; text-align: center; ">
                    <s:property value="message"/>
                    <s:property value="id"/>
                </div>

                <div class="row">
                    <div class="form-group col-md-6">
                        <input class="form-control" id="solicitante" placeholder="Solicitante..." disabled value="<%=session.getAttribute("usuario")%>" title="Informações do solicitante!!">
                    </div>

                    <div class="form-group col-md-6">
                        <input type="text" size="4" maxlength="4" class="form-control" id="ramal" placeholder="Ramal..." name="ticket.ramal" title="Digite aqui o ramal para contato!!">
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-6">
                        <select class="form-control" name="ticket.departamento" title="Selecione o departamento!!">
                            <option>Departamento Solicitante...</option>
                            <option>Internação</option> 
                            <option>Pronto Atendimento</option>
                            <option>Medicina Fetal</option>
                        </select>
                    </div>

                    <div class="col-md-6">
                        <select class="form-control" name="ticket.tipo" title="Selecione o tipo do ocorrencia!!">
                            <option>Tipo da solicitação...</option>
                            <option>Infraestrutura</option>
                            <option>Sistemas</option>
                            <option>Telefonia</option>
                        </select>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
                            <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Titulo..." name="ticket.titulo" title="Digite aqui o titulo!!">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <div>
                            <textarea class="form-control" rows="10"  placeholder="Descrição..." name="ticket.descricao" title="Digite aqui a Descição da solicitação!!"></textarea>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="exampleInputFile">Adicionar arquivo</label>
                    <input type="file" id="exampleInputFile">
                </div>

                <div class=" button-submit">
                    <button type="submit" class="btn btn-default">
                        <span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span> Concluir
                    </button>
                </div>
            </form>
        </div>

        <div class="col-md-2"></div>

    </div>

</section>
<jsp:include page="inc/footer.html"/>