package teste.action;

import static com.opensymphony.xwork2.Action.SUCCESS;
import static com.opensymphony.xwork2.Action.ERROR;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import teste.dao.CarroDao;
import teste.dao.MarcaDao;
import teste.entity.Carro;
import teste.entity.Marca;

public class CarroAction {
    
    private Carro carro = new Carro();
    private Marca marca = new Marca();
    private String message;
    
    @Action(value = "cadcar", results = {
        @Result(name = SUCCESS, location = "/cadastra-carro.jsp"),
        @Result(name = ERROR, location = "/erro.jsp")
    })
    public String cadcar() {
        CarroDao dao = new CarroDao();
        carro.setMarca(marca);
        dao.salvar(carro);
        setMessage("Veiculo cadastrado com sucesso.");
        return SUCCESS;
    }
    
    @Action(value = "cadmar", results = {
        @Result(name = SUCCESS, location = "/cadastra-marca.jsp"),
        @Result(name = ERROR, location = "/erro.jsp")
    })
    public String cadmar() {
        MarcaDao dao = new MarcaDao();
        dao.salvar(marca);
        setMessage("Marca cadastrado com sucesso.");
        return SUCCESS;
    }
    
    @Action(value = "exccar", results = {
        @Result(name = SUCCESS, location = "/cadastra-carro.jsp"),
        @Result(name = ERROR, location = "/erro.jsp")
    })
    public String exccar() {
        CarroDao dao = new CarroDao();
        marca.setId(carro.getId());
        carro.setMarca(marca);
        dao.remover(carro);
        setMessage("Carro removido com sucesso.");
        return "success";
    }
    
    public Carro getCarro() {
        return carro;
    }
    
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public Marca getMarca() {
        return marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
