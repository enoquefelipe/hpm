package com.mycompany.action;

import com.mycompany.dao.UsuarioDao;
import com.mycompany.entities.Usuario;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class UsuarioAction {

    private Usuario user = new Usuario();
    private String message;

    @Action(value = "addUser", results
//           = @Result(name = "success", type = "redirectAction", params = {"actionName", "cadUser"}))
             = @Result(name = "success", location = "/cadastra-usuario.jsp"))
    public String addUser() {
        UsuarioDao dao = new UsuarioDao();
        dao.salvar(user);
        message = "Cadastrado realizado com sucesso!";
        return "success";
    }

    @Action(value = "cadUser", results
            = @Result(name = "success", location = "/cadastra-usuario.jsp"))
    public String cadUser() {
        return "success";
    }

    public Usuario getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
