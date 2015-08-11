package com.mycompany.action;

import com.mycompany.dao.OcorrenciaDao;
import com.mycompany.entities.Ocorrencia;
import com.mycompany.entities.Oficina;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class OcorrenciaAction {

    private Ocorrencia ocorrencia = new Ocorrencia();
    private Oficina oficina = new Oficina();
    private String message;

    @Action(value = "addOcorrencia", results
            = @Result(name = "success", location = "/Home.jsp"))
    public String addOcorrencia() {
        OcorrenciaDao dao = new OcorrenciaDao();
        ocorrencia.setOficina(oficina);
        dao.salvar(ocorrencia);
        message = "Oficina cadastrada com sucesso!";

        return "success";
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public String getMessage() {
        return message;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
