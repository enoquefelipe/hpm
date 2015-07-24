package com.mycompany.action;

import com.mycompany.dao.OficinaDao;
import com.mycompany.entities.Oficina;
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
public class OficinaAction {

    private Oficina oficina = new Oficina();
    private List<Oficina> listaoficinas = new ArrayList<>();
    private String message;
    private OficinaDao dao = new OficinaDao();



    @Action(value = "addOficina", results
            = @Result(name = "success", location = "/cadastra-oficina.jsp"))
    public String addOficina() {
        dao.salvar(oficina);
        message = "Oficina cadastrada com sucesso!";
        return "success";
    }

    @Action(value = "listaOficinas", results = {
        @Result(name = "success", location = "/lista-oficina.jsp"),
        @Result(name = "error", location = "/lista-oficina.jsp")
    })
    public String listaOficinas() {
        listaoficinas = dao.listar();
        if (listaoficinas.isEmpty()) {
            setMessage("Nenhum registro encontado!");
            return "success";
        } else {
            return "success";
        }
    }

    @Action(value = "detalhesOficina", results = {
        @Result(name = "success", location = "/detalhes-oficina.jsp"),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String detalhesOficina() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        oficina = dao.selecionar(Integer.parseInt(request.getParameter("id")));
        return "success";
    }

    @Action(value = "selecionaOficina", results
            = @Result(name = "success", location = "/edita-oficina.jsp"))
    public String selecionaOficina() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        oficina = dao.selecionar(Integer.parseInt(request.getParameter("id")));
        return "success";
    }

    @Action(value = "excluirOficina", results = {
        @Result(name = "success", type = "redirectAction", params = {"actionName", "listaOficinas"}),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String excluirOficina() {
        dao.remover(oficina);
        setMessage("Oficina removida com sucesso!!!");
        return "success";
    }

    @Action(value = "pesquisarOficina", results = {
        @Result(name = "success", location = "/lista-oficina.jsp"),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String pesquisarOficina() {
        listaoficinas = dao.pesquisar(oficina.getDescricao());
        if (listaoficinas.isEmpty()) {
            setMessage("Nenhum registro encontado!");
            return "success";
        } else {
            return "success";
        }
    }

    @Action(value = "atualizaOficina", results
            = @Result(name = "success", type = "redirectAction", params = {"actionName", "listaOficinas"}))
    public String atualizaOficina() {
        dao.atualizar(oficina);
        return "success";
    }

    // Getters
    public Oficina getOficina() {
        return oficina;
    }

    public String getMessage() {
        return message;
    }

    public List<Oficina> getListaoficinas() {
        return listaoficinas;
    }

    // Setters
    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setListaoficinas(List<Oficina> listaoficinas) {
        this.listaoficinas = listaoficinas;
    }
}
