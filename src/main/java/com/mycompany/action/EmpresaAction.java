package com.mycompany.action;

import com.mycompany.dao.EmpresaDao;
import com.mycompany.entities.Empresa;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class EmpresaAction {

    private Empresa empresa = new Empresa();
    private List<Empresa> listaempresas = new ArrayList<>();
    private String message;

    // Método cadastra Empresa
    @Action(value = "cademp", results = @Result(name = SUCCESS, location = "/cadastra-empresa.jsp"))
    public String cademp() {
        EmpresaDao dao = new EmpresaDao();
        dao.salvar(empresa);
        message = "Empresa cadastrada com sucesso!";
        return SUCCESS;
    }

    // Método Lista Empresas 
    @Action(value = "lisemp", results = {
        @Result(name = SUCCESS, location = "/lista-empresa.jsp"),
        @Result(name = ERROR, location = "/lista-empresa.jsp")
    })
    public String lisemp() {
        try {
            EmpresaDao dao = new EmpresaDao();
            listaempresas = dao.listar();
            if (listaempresas.isEmpty()) {
                setMessage("Nenhum registro encontado!");
                return SUCCESS;
            }
            return SUCCESS;
        } catch (Exception e) {
            setMessage("Error: " + e.getMessage() + ".");
            return SUCCESS;
        }
    }

    // Método detalhes empresa
    @Action(value = "detemp", results = @Result(name = SUCCESS, location = "/detalhes-empresa.jsp"))
    public String detemp() {
        EmpresaDao dao = new EmpresaDao();
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        empresa = dao.selecionar(id);
        return SUCCESS;
    }

    // Método selecionar empresa
    @Action(value = "selemp", results = @Result(name = SUCCESS, location = "/edita-empresa.jsp"))
    public String selemp() {
        EmpresaDao dao = new EmpresaDao();
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        empresa = dao.selecionar(Integer.parseInt(request.getParameter("id")));
        return SUCCESS;
    }

    // Método atualiza empresa
    @Action(value = "atuemp", results = @Result(name = SUCCESS, type = "redirectAction", params = {"actionName", "lisemp"}))
    public String atuemp() {
        return SUCCESS;
    }

    // Método excluir empresa
    @Action(value = "excemp", results = {
        @Result(name = SUCCESS, type = "redirectAction", params = {"actionName", "lisemp"}),
        @Result(name = ERROR, location = "/Home.jsp")
    })
    public String excemp() {
        EmpresaDao dao = new EmpresaDao();
        dao.remover(empresa);
        setMessage("Empresa removida com sucesso!!!");
        return SUCCESS;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public List<Empresa> getListaempresas() {
        return listaempresas;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setListaempresas(List<Empresa> listaempresas) {
        this.listaempresas = listaempresas;
    }
}
