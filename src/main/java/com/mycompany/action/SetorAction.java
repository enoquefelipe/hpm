package com.mycompany.action;

import com.mycompany.dao.SetorDao;
import com.mycompany.entities.Setor;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class SetorAction {

    private Setor setor = new Setor();
    private String message;

    // Action new chamado
    @Action(value = "addSetor", results = {
        @Result(name = "success", location = "/cadastra-setor.jsp"),
        @Result(name = "error", location = "/cadastra-setor.html")
    })

    public String addSetor() {

        SetorDao dao = new SetorDao();
        dao.salvar(setor);
        setMessage("Solicitação registrada com sucesso: ");
        return "success";
    }

    // Getters
    public Setor getSetor() {
        return setor;
    }

    public String getMessage() {
        return message;
    }

    // Setters
    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
