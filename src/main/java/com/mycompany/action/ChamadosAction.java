package com.mycompany.action;

import com.mycompany.dao.TicketDao;
import com.mycompany.entities.Ticket;
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
public class ChamadosAction {

    private Ticket ticket = new Ticket();
    private List<Ticket> listachamados = new ArrayList<>();
    private String message;
    private int id;

    // Action new ticket
    @Action(value = "novoChamado", results = {
        @Result(name = "success", location = "/cadastra-solicitacao.jsp"),
        @Result(name = "error", location = "/error.html")
    })

    public String novoChamado() {
        java.util.Date dataAtual = new java.util.Date(System.currentTimeMillis());
        ticket.setData_abertura(dataAtual);
        TicketDao dao = new TicketDao();
        dao.salvar(ticket);
        id = ticket.getId();
        setMessage("Solicitação registrada com sucesso: ");
        return "success";
    }

    @Action(value = "listaChamados", results = {
        @Result(name = "success", location = "/lista-solicitacao.jsp"),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String listaChamados() {
        TicketDao dao = new TicketDao();
        listachamados = dao.listar();
        if (listachamados.isEmpty()) {
            setMessage("Nenhum registro encontado!");
            return "success";
        } else {
            return "success";
        }
    }

    @Action(value = "selecionaChamado", results = {
        @Result(name = "success", location = "/detalhes-solicitacao.jsp"),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String selecionaChamado() {
        TicketDao dao = new TicketDao();
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        ticket = dao.selecionar(Integer.parseInt(request.getParameter("id")));
        return "success";
    }

    // Getters
    public Ticket getTicket() {
        return ticket;
    }

    public String getMessage() {
        return message;
    }

    public List<Ticket> getListachamados() {
        return listachamados;
    }

    public int getId() {
        return id;
    }

    //Setters
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setListachamados(List<Ticket> listachamados) {
        this.listachamados = listachamados;
    }

    public void setId(int id_solicitacao) {
        this.id = id_solicitacao;
    }

}
