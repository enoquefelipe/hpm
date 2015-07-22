package com.mycompany.action;

import java.util.HashMap;
import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

    private static Map< String, String> mapa = new HashMap<>();
    private String usuario;
    private String senha;
    private String mensagem;

    static {
        LoginAction.mapa.put("enoque.leal", "1234");
        LoginAction.mapa.put("admin", "1234");
    }

    @Override
    public String execute() throws Exception {
        if (LoginAction.mapa.containsKey(this.usuario) && LoginAction.mapa.get(this.usuario).equals(this.senha)) {
            HttpSession session = ServletActionContext.getRequest().getSession(true);
            session.setAttribute("usuario", this.usuario);
            this.mensagem = " Autenticação realizada com sucesso.";
            return LoginAction.SUCCESS; // return "SUCCESS";
        } else {
            this.mensagem = " Usuário e/ou senha incorretos.";
            return LoginAction.INPUT; // return "INPUT";
        }
    }

//     GETTERS E SETTERS
    public static Map<String, String> getMapa() {
        return mapa;
    }

    public static void setMapa(Map<String, String> mapa) {
        LoginAction.mapa = mapa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
