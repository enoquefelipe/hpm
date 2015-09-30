package com.mycompany.action;

import com.mycompany.dao.OficinaDao;
import com.mycompany.entities.Oficina;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import java.io.UnsupportedEncodingException;
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

    @Action(value = "addOficina", results = @Result(name = SUCCESS, location = "/cadastra-oficina.jsp"))
    public String addOficina() {
        OficinaDao dao = new OficinaDao();
        dao.salvar(oficina);
        message = "Oficina cadastrada com sucesso!";
        return SUCCESS;
    }

    @Action(value = "listaOficinas", results = @Result(name = SUCCESS, location = "/lista-oficina.jsp"))
    public String listaOficinas() {
        OficinaDao dao = new OficinaDao();
        listaoficinas = dao.listar();
        if (listaoficinas.isEmpty()) {
            setMessage("Nenhum registro encontado!");
            return SUCCESS;
        } else {
            return SUCCESS;
        }
    }

    @Action(value = "listaOficinasAjax", results = @Result(name = SUCCESS, location = "/lista-oficina-ajax.jsp"))
    public String listaOficinasAjax() {
        listaOficinas();
        return SUCCESS;
    }

    @Action(value = "menuOficina", results = @Result(name = SUCCESS, location = "/ajax/menu-oficina.jsp"))
    public String menuOficina() {
        listaOficinas();
        return SUCCESS;
    }

    @Action(value = "detalhesOficina", results = @Result(name = SUCCESS, location = "/detalhes-oficina.jsp"))
    public String detalhesOficina() {
        selecionaOficina();
        return SUCCESS;
    }

    @Action(value = "selecionaOficina", results = @Result(name = SUCCESS, location = "/edita-oficina.jsp"))
    public String selecionaOficina() {
        OficinaDao dao = new OficinaDao();
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        oficina = dao.selecionar(Integer.parseInt(request.getParameter("id")));
        return SUCCESS;
    }

    @Action(value = "excluirOficina", results = {
        @Result(name = SUCCESS, type = "redirectAction", params = {"actionName", "listaOficinas"}),
        @Result(name = ERROR, location = "/Home.jsp")
    })
    public String excluirOficina() {
        OficinaDao dao = new OficinaDao();
        dao.remover(oficina);
        setMessage("Oficina removida com sucesso!!!");
        return SUCCESS;
    }

    @Action(value = "pesquisarOficina", results = {
        @Result(name = SUCCESS, location = "/lista-oficina-ajax-result.jsp"),
        @Result(name = ERROR, location = "/lista-oficina-ajax-result.jsp")
    })
    public String pesquisarOficina() throws UnsupportedEncodingException {
        OficinaDao dao = new OficinaDao();
        listaoficinas = dao.pesquisar(oficina.getDescricao());
        if (listaoficinas.isEmpty()) {
            setMessage("Nenhum registro encontado!");
            return ERROR;
        } else {
            return SUCCESS  ;
        }
    }

    @Action(value = "atualizaOficina", results = @Result(name = SUCCESS, type = "redirectAction", params = {"actionName", "listaOficinas"}))
    public String atualizaOficina() {
        OficinaDao dao = new OficinaDao();
        dao.atualizar(oficina);
        return SUCCESS;
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
