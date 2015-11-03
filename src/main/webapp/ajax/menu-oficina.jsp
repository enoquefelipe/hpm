<%@taglib uri="/struts-tags" prefix="s"%>

<s:select cssClass="form-control" headerKey="-1" headerValue="Selecione..." list="listaoficinas" listKey="id" name="ocorrencia.oficina.id" value="%{listaoficinas.oficina.{id}}" />