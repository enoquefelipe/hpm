package com.mycompany.action;

import com.mycompany.dao.SetorDao;
import com.mycompany.entities.Setor;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class SetorAction {

    private Setor setor = new Setor();
    private String message;
    private List<Setor> listasetores = new ArrayList<>();

    // Action new chamado
    @Action(value = "addSetor", results = {
        @Result(name = "success", location = "/cadastra-setor.jsp"),
        @Result(name = "error", location = "/cadastra-setor.jsp")
    })

    public String addSetor() {

        SetorDao dao = new SetorDao();
        dao.salvar(setor);
        setMessage("Solicitação registrada com sucesso: ");
        return "success";
    }

    // Método Lista Empresas 
    @Action(value = "lisset", results = {
        @Result(name = SUCCESS, location = "/lista-setor.jsp"),
        @Result(name = ERROR, location = "/lista-setor.jsp")
    })
    public String lisset() {
        try {
            SetorDao dao = new SetorDao();
            listasetores = dao.listar();
            if (listasetores.isEmpty()) {
                setMessage("Nenhum registro encontado!");
                return SUCCESS;
            }
            return SUCCESS;
        } catch (Exception e) {
            setMessage("Error: " + e.getMessage() + ".");
            return SUCCESS;
        }
    }

    @Action(value = "menuSetor", results = {
        @Result(name = SUCCESS, location = "/ajax/menu-setor.jsp"),
        @Result(name = ERROR, location = "/ajax/menu-setor.jsp")
    })
    public String menuSetor() {
        lisset();
        if (listasetores.isEmpty()) {
            setMessage("Nenhuma empresa cadastrada.");
            return ERROR;
        }
        System.out.println(listasetores);
        return SUCCESS;
    }

    // Getters
    public Setor getSetor() {
        return setor;
    }

    public String getMessage() {
        return message;
    }

    public List<Setor> getListasetores() {
        return listasetores;
    }

    // Setters
    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setListasetores(List<Setor> listasetores) {
        this.listasetores = listasetores;
    }
}
