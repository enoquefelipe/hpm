package com.mycompany.action;

import com.mycompany.dao.EmpresaDao;
import com.mycompany.entities.Contato;
import com.mycompany.entities.Empresa;
import com.mycompany.entities.Endereco;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class EmpresaAction {

    private String message;
    private Empresa empresa = new Empresa();
    private Contato contato = new Contato();
    private Endereco endereco = new Endereco();
    private List<Empresa> listaempresas = new ArrayList<>();

    @Action(value = "cadastraEmpresa", results
            = @Result(name = "success", location = "/cadastra-empresa.jsp"))
    public String cadastraEmpresa() {
        EmpresaDao dao = new EmpresaDao();
        empresa.setContato(contato);
        empresa.setEndereco(endereco);
        dao.salvar(empresa);
        message = "Empresa cadastrada com sucesso!";
        return "success";
    }

    @Action(value = "listaEmpresas", results = {
        @Result(name = "success", location = "/lista-empresa.jsp"),
        @Result(name = "error", location = "/lista-empresa.jsp")
    })
    public String listaEmpresas() {
        EmpresaDao dao = new EmpresaDao();
        listaempresas = dao.listar();
        if (listaempresas.isEmpty()) {
            setMessage("Nenhum registro encontado!");
            return "success";
        } else {
            return "success";
        }
    }

    // Getter
    public String getMessage() {
        return message;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Contato getContato() {
        return contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Empresa> getListaempresas() {
        return listaempresas;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setListaempresas(List<Empresa> listaempresas) {
        this.listaempresas = listaempresas;
    }
}
