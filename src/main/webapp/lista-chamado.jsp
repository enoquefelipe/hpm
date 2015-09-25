<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="inc/header.jsp"/>
<section>

    <div>

        <form class="form-inline">
            <div style="text-align: right">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Pesquisar...">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">
                            <span class="glyphicon glyphicon-search"></span>
                        </button>
                    </span>
                </div>
            </div>
        </form

        <s:form>

            <h4 class="tittle-page">Chamados</h4>
            <div style=" color: green; text-align: center; ">
                <s:property value="message_alerta"/>
            </div>
            <table class="table table-striped">
                <tr>
                    <th class="tabela-chamados"> O.S       </th>
                    <th class="tabela-chamados"> Título    </th>
                    <th class="tabela-chamados"> Abertura  </th>
                    <th class="tabela-chamados"> Abrir     </th>
                </tr>

                <s:if test="listachamados.size() > 0" >
                    <s:iterator value="listachamados" status="userStatus">

                        <tr>
                            <td class="tabela-chamados"> <s:property value="id" />  </td>
                            <td class="tabela-chamados"> <s:property value="titulo" />  </td>
                            <td class="tabela-chamados"> <s:property value="data_abertura" /> </td>

                            <td class="tabela-chamados"> 
                                <s:url id="editURL" action="selCha">
                                    <s:param name="id" value="%{id}"></s:param>
                                </s:url>
                                <s:a href="%{editURL}" cssClass="glyphicon glyphicon-zoom-in zoom" title="Clique aqui para visualizar com detalhes!!!"></s:a>
                                </td>

                            </tr>

                    </s:iterator>
                </s:if>


            </table>

            <div style=" color: green; text-align: center; margin-top: 200px; ">
                <s:property value="message"/>
            </div>
        </s:form>
    </div>

</section>
<jsp:include page="inc/footer.html"/>