package com.mycompany.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */


public class LogoutAction extends ActionSupport{
    
    private String mensagem;

    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(true);
        session.removeAttribute("usuario");
        this.mensagem = "Até logo!";
        return LoginAction.SUCCESS;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }
}
