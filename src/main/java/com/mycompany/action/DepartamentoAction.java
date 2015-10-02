package com.mycompany.action;

import com.mycompany.dao.DepartamentoDao;
import com.mycompany.entities.Departamento;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class DepartamentoAction {

    private Departamento departamento = new Departamento();
    private List<Departamento> listadepartamentos = new ArrayList<>();
    private String message;

    // Método cadastra empresa
    @Action(value = "caddep", results = @Result(name = SUCCESS, location = "/cadastra-departamento.jsp"))
    public String caddep() {
        DepartamentoDao dao = new DepartamentoDao();
        dao.salvar(departamento);
        setMessage("Cadastro efetuado com sucesso.");
        return SUCCESS;
    }

    // Método lista empresa
    @Action(value = "lisdep", results = @Result(name = SUCCESS, location = "/cadastra-departamento.jsp"))
    public String lisdep() {
        return SUCCESS;
    }

    // Método remove empresa
    @Action(value = "remdep", results = @Result(name = SUCCESS, location = "/cadastra-departamento.jsp"))
    public String remdep() {
        return SUCCESS;
    }

    // Getters
    public Departamento getDepartamento() {
        return departamento;
    }

    public String getMessage() {
        return message;
    }

    public List<Departamento> getListadepartamentos() {
        return listadepartamentos;
    }

    // Setters
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setListadepartamentos(List<Departamento> listadepartamentos) {
        this.listadepartamentos = listadepartamentos;
    }
}
