<%@taglib uri="/struts-tags" prefix="s"%>

<s:select cssClass="form-control" headerKey="-1" headerValue="Selecione..." list="listasetores" listKey="id" name="departamento.setor.id" value="%{listasetores.setor.{id}}" />