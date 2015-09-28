<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<jsp:include page="inc/header.jsp"/>

<div class="form-inline" >
    <div style="text-align: right">
        <div class="input-group">
            <input type="text" name="oficina.descricao" id="des" class="form-control" placeholder="Pesquisar...">
            <span class="input-group-btn">
                <button id="buscar" class="btn btn-default" type="button">
                    <span class="glyphicon glyphicon-search"></span>
                </button>
            </span>
        </div>
    </div>
</div>

<div id="pesquisaAjax">
    <s:form>
        <h4 class="tittle-page">Oficinas</h4>
        <table class="table table-striped">
            <tr>
                <th class="tabela-chamados"> Sigla  </th>
                <th class="tabela-chamados"> Nome   </th>
                <th class="tabela-chamados"> Status </th>
                <th class="tabela-chamados"> Abrir  </th>
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

<jsp:include page="inc/footer.html"/>
<script>

    $('document').ready(function() {
        $('#buscar').click(function() {
            $.get("pesquisarOficina", {
                'oficina.descricao': $("#des").val()
            },
            function(result) {
                $('#pesquisaAjax').html(result);
            });
        });
    });

</script>