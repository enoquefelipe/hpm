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
    private String message_alerta;
    private int id;

    // Metodo cadastra chamado
    @Action(value = "novcha", results = {
        @Result(name = "success", location = "/cadastra-chamado.jsp"),
        @Result(name = "error", location = "/error.html")
    })

    public String novcha() {
        java.util.Date dataAtual = new java.util.Date(System.currentTimeMillis());
        chamado.setData_abertura(dataAtual);
        ChamadoDao dao = new ChamadoDao();
        dao.salvar(chamado);
        id = chamado.getId();
        setMessage("Solicitação registrada com sucesso: ");
        return "success";
    }

    // Metodo Lista Chamados
    @Action(value = "lischa", results = {
        @Result(name = "success", location = "/lista-chamado.jsp"),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String lischa() {
        try {
            ChamadoDao dao = new ChamadoDao();
            listachamados = dao.listar();
            if (listachamados.isEmpty()) {
                setMessage("Nenhum registro encontado!");
                return "success";
            }
            return "success";
        } catch (Exception e) {
            setMessage("Error: " + e.getMessage() + ".");
            return "success";
        }
    }

    // Metodo Seleciona Chamado
    @Action(value = "selCha", results = {
        @Result(name = "success", location = "/detalhes-chamado.jsp"),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String selCha() {
        try {
            ChamadoDao dao = new ChamadoDao();
            HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
            chamado = dao.selecionar(Integer.parseInt(request.getParameter("id")));
            return "success";
        } catch (NumberFormatException e) {
            setMessage("Error: " + e.getMessage() + ".");
            return "error";
        }
    }

    // Método Excluir
    @Action(value = "exccha", results = {
        //@Result(name = "success", type = "redirectAction", params = {"actionName", "lischa"}),
        @Result(name = "success", location = "/lista-chamado.jsp"),
        @Result(name = "error", location = "/Home.jsp")
    })
    public String exccha() {
        ChamadoDao dao = new ChamadoDao();
        chamado.setId(id);
        dao.remover(chamado);
        lischa();
        setMessage_alerta("Chamado " + id + " excluido com sucesso");
        return "success";
    }

    // Getters
    public Chamado getTicket() {
        return chamado;
    }

    public String getMessage() {
        return message;
    }

    public String getMessage_alerta() {
        return message_alerta;
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

    public void setMessage_alerta(String message_alerta) {
        this.message_alerta = message_alerta;
    }

    public void setListachamados(List<Chamado> listachamados) {
        this.listachamados = listachamados;
    }

    public void setId(int id_solicitacao) {
        this.id = id_solicitacao;
    }

}
