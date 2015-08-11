<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<jsp:include page="inc/header.jsp"/>
<section>

    <form class="form-inline" method="POST" action="pesquisarOficina">
        <div style="text-align: right">
            <div class="input-group">
                <input type="text" name="oficina.descricao" class="form-control" placeholder="Pesquisar...">
                <span class="input-group-btn">
                    <button class="btn btn-default" type="submit">
                        <span class="glyphicon glyphicon-search"></span>
                    </button>
                </span>
            </div>
        </div>
    </form>
    <div id="div1">
        <s:form>
            <h4 class="tittle-page">Oficinas</h4>
            <table class="table table-striped">
                <tr>
                    <th class="tabela-chamados"> SIGLA    </th>
                    <th class="tabela-chamados"> NOME     </th>
                    <th class="tabela-chamados"> ATIVA    </th>
                    <th class="tabela-chamados"> DETALHES </th>
                </tr>

                <s:if test="listaoficinas.size() > 0" >
                    <s:iterator value="listaoficinas" status="userStatus">

                        <tr>
                            <td class="tabela-chamados"> <s:property value="sigla" />  </td>
                            <td class=""> <s:property value="nome" />  </td>
                            <td class="tabela-chamados"> <s:property value="status" /> </td>

                            <td class="tabela-chamados"> 
                                <s:url id="editURL" action="detalhesOficina">
                                    <s:param name="id" value="%{id}"></s:param>
                                </s:url>
                                <s:a href="%{editURL}" cssClass="glyphicon glyphicon-zoom-in zoom" ></s:a>
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