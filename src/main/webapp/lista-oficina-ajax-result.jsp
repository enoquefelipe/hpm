
<%@taglib uri="/struts-tags" prefix="s"%>

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
