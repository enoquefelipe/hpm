package com.mycompany.action;

import com.mycompany.dao.PessoaDao;
import com.mycompany.entities.Contato;
import com.mycompany.entities.Endereco;
import com.mycompany.entities.Pessoa;
import com.mycompany.entities.Usuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class PessoaAction {

    private Pessoa pessoa = new Pessoa();
    private Usuario usuario = new Usuario();
    private Endereco endereco = new Endereco();
    private Contato contato = new Contato();
    private String message;
    private String data;
    private Date dt;

    @Action(value = "addPeople", results
            = @Result(name = "success", location = "/cadastra-usuario.jsp"))
    public String addPeople() throws ParseException {
        PessoaDao dao = new PessoaDao();

//        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        dt = (Date) (java.util.Date) formatter.parse(data);
        
        SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd-MM-yyyy");
        dt = sdfEntrada.parse(data);

        pessoa.setNascimento(dt);
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

    public String getData() {
        return data;
    }

    public Date getDt() {
        return dt;
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

    public void setData(String data) {
        this.data = data;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }
}
