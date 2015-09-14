package com.mycompany.action;

import com.mycompany.dao.ChamadoDao;
import com.mycompany.entities.Chamado;
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
public class ChamadoAction {

    private Chamado chamado = new Chamado();
    private List<Chamado> listachamados = new ArrayList<>();
    private String message;
    private int id;

    // Action new chamado
    @Action(value = "novoChamado", results = {
        @Result(name = "success", location = "/cadastra-solicitacao.jsp"),
        @Result(name = "error", location = "/error.html")
    })

    public String novoChamado() {
        java.util.Date dataAtual = new java.util.Date(System.currentTimeMillis());
        chamado.setData_abertura(dataAtual);
        ChamadoDao dao = new ChamadoDao();
        dao.salvar(chamado);
        id = chamado.getId();
        setMessage("Solicitação registrada com sucesso: ");
        return "success";
    }

    @Action(value = "listaChamados", results = {
        @Result(name = "success", location = "/lista-solicitacao.jsp"),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String listaChamados() {
        try {
            ChamadoDao dao = new ChamadoDao();
            listachamados = dao.listar();
            if (listachamados.isEmpty()) {
                setMessage("Nenhum registro encontado!");
                return "success";
            } else {
                return "success";
            }
        } catch (Exception e) {
            setMessage(e.getMessage());
            return "success";
        }
    }

    @Action(value = "selecionaChamado", results = {
        @Result(name = "success", location = "/detalhes-solicitacao.jsp"),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String selecionaChamado() {
        ChamadoDao dao = new ChamadoDao();
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        chamado = dao.selecionar(Integer.parseInt(request.getParameter("id")));
        return "success";
    }

    // Getters
    public Chamado getTicket() {
        return chamado;
    }

    public String getMessage() {
        return message;
    }

    public List<Chamado> getListachamados() {
        return listachamados;
    }

    public int getId() {
        return id;
    }

    //Setters
    public void setTicket(Chamado ticket) {
        this.chamado = ticket;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setListachamados(List<Chamado> listachamados) {
        this.listachamados = listachamados;
    }

    public void setId(int id_solicitacao) {
        this.id = id_solicitacao;
    }

}
