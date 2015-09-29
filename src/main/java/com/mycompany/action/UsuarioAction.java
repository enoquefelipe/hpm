package com.mycompany.action;

import com.mycompany.dao.PessoaDao;
import com.mycompany.entities.Pessoa;
import static com.opensymphony.xwork2.Action.SUCCESS;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */

public class UsuarioAction {

    private Pessoa pessoa = new Pessoa();
    private String message;

    // Método cadastra pessoa
    @Action(value = "cadpes", results
            = @Result(name = SUCCESS, location = "/cadastra-usuario.jsp"))
    public String cadpes() {
        PessoaDao dao = new PessoaDao();
        dao.salvar(pessoa);
        message = "Cadastrado realizado com sucesso!";
        return SUCCESS;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
