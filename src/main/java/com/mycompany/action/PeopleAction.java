package com.mycompany.action;

import com.mycompany.dao.PessoaDao;
import com.mycompany.entity.Contato;
import com.mycompany.entity.Endereco;
import com.mycompany.entity.Pessoa;
import com.mycompany.entity.Usuario;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class PeopleAction {

    private Pessoa pessoa = new Pessoa();
    private Usuario usuario = new Usuario();
    private Endereco endereco = new Endereco();
    private Contato contato = new Contato();
    private String message;

    @Action(value = "addPeople", results
            = @Result(name = "success", location = "/cadastra-usuario.jsp"))
    public String addPeople() {
        PessoaDao dao = new PessoaDao();
        pessoa.setEndereco(endereco);
        pessoa.setContato(contato);
        pessoa.setUsuario(usuario);
        dao.salvar(pessoa);
        message = "Usuário cadastrado com sucesso!";
        return "success";
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public String getMessage() {
        return message;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
