package com.mycompany.action;

import com.mycompany.dao.EmpresaDao;
import com.mycompany.entities.Contato;
import com.mycompany.entities.Empresa;
import com.mycompany.entities.Endereco;
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

    // Método Lista Empresas 
    @Action(value = "lisemp", results = {
        @Result(name = "success", location = "/lista-empresa.jsp"),
        @Result(name = "error", location = "/lista-empresa.jsp")
    })
    public String lisemp() {
        try {
            EmpresaDao dao = new EmpresaDao();
            listaempresas = dao.listar();
            if (listaempresas.isEmpty()) {
                setMessage("Nenhum registro encontado!");
                return "success";
            }
            return "success";
        } catch (Exception e) {
            setMessage("Error: " + e.getMessage() + ".");
            return "success";
        }
    }

    @Action(value = "detalhesEmpresa", results
            = @Result(name = "success", location = "/detalhes-empresa.jsp")
    )
    public String detalhesEmpresa() {
        EmpresaDao dao = new EmpresaDao();
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        empresa = dao.selecionar(id);
        return "success";
    }

    @Action(value = "selecionaEmpresa", results
            = @Result(name = "success", location = "/edita-empresa.jsp")
    )
    public String selecionaEmpresa() {
        EmpresaDao dao = new EmpresaDao();
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        empresa = dao.selecionar(Integer.parseInt(request.getParameter("id")));
        return "success";
    }

    @Action(value = "atualizaEmpresa", results
            = @Result(name = "success", type = "redirectAction", params = {"actionName", "lisemp"})
    )
    public String atualizaEmpresa() {
        return "success";
    }

    @Action(value = "excluirEmpresa", results = {
        @Result(name = "success", type = "redirectAction", params = {"actionName", "lisemp"}),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String excluirEmpresa() {
        EmpresaDao dao = new EmpresaDao();
        dao.remover(empresa);
        setMessage("Empresa removida com sucesso!!!");
        return "success";
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
