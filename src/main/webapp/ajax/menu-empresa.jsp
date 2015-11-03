<%@taglib uri="/struts-tags" prefix="s"%>

<s:select cssClass="form-control" headerKey="-1" headerValue="Selecione..." list="listaempresas" listKey="id" name="setor.empresa.id" value="%{listaempresas.empresa.{id}}" />