<%@taglib uri="/struts-tags" prefix="s"%>

<s:select cssClass="form-control" headerKey="-1" headerValue="Selecione..." list="listamarcas" listKey="id" name="carro.marca.id" value="%{listamarcas.marca.{id}}"/>
