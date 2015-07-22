package com.mycompany.action;

import com.mycompany.dao.OficinaDao;
import com.mycompany.entities.Oficina;
import java.util.ArrayList;
import java.util.List;
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

    @Action(value = "addOficina", results
            = @Result(name = "success", location = "/cadastra-oficina.jsp"))
    public String addOficina() {
        OficinaDao dao = new OficinaDao();
        dao.salvar(oficina);
        message = "Oficina cadastrada com sucesso!";
        return "success";
    }
    
        @Action(value = "listaOficinas", results = {
        @Result(name = "success", location = "/lista-oficina.jsp"),
        @Result(name = "error", location = "/lista-oficina.jsp")
    })
    public String listaOficinas() {
        OficinaDao dao = new OficinaDao();
        listaoficinas = dao.listar();
        if (listaoficinas.isEmpty()) {
            setMessage("Nenhum registro encontado!");
            return "success";
        } else {
            return "success";
        }
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
