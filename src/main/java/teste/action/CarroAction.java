package teste.action;

import static com.opensymphony.xwork2.Action.SUCCESS;
import static com.opensymphony.xwork2.Action.ERROR;
import java.util.ArrayList;
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
    private List<Carro> listacarros = new ArrayList<>();
    private List<Marca> listamarcas = new ArrayList<>();
    private String message;

    // Método cadastra Carro
    @Action(value = "cadcar", results = {
        @Result(name = SUCCESS, location = "/cadastra-carro.jsp"),
        @Result(name = ERROR, location = "/erro.jsp")
    })
    public String cadcar() {
        CarroDao dao = new CarroDao();
        dao.salvar(carro);
        setMessage("Veiculo cadastrado com sucesso.");
        return SUCCESS;
    }

    // Método cadastra Marca
    @Action(value = "cadmar", results = {
        @Result(name = SUCCESS, location = "/cadastra-carro.jsp"),
        @Result(name = ERROR, location = "/erro.jsp")
    })
    public String cadmar() {
        MarcaDao dao = new MarcaDao();
        dao.salvar(marca);
        setMessage("Marca cadastrada com sucesso.");
        return SUCCESS;
    }

    // Método excluir carro
    @Action(value = "exccar", results = {
        @Result(name = SUCCESS, location = "/cadastra-carro.jsp"),
        @Result(name = ERROR, location = "/erro.jsp")
    })
    public String exccar() {
        CarroDao dao = new CarroDao();
        dao.remover(carro);
        setMessage("Carro removido com sucesso.");
        return "success";
    }

    // Método listar carro
    @Action(value = "liscar", results = {
        @Result(name = SUCCESS, location = "/cadastra-carro.jsp"),
        @Result(name = ERROR, location = "/erro.jsp")
    })
    public String liscar() {
        CarroDao dao = new CarroDao();
        listacarros = dao.listar();
        return SUCCESS;
    }

    // Método listar marca
    @Action(value = "lismar", results = {
        @Result(name = SUCCESS, location = "/ajax/lista-marca.jsp"),
        @Result(name = ERROR, location = "/erro.jsp")
    })
    public String lismar() {
        MarcaDao dao = new MarcaDao();
        listamarcas = dao.listar();
        return SUCCESS;
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

    public List<Carro> getListacarros() {
        return listacarros;
    }

    public void setListacarros(List<Carro> listacarros) {
        this.listacarros = listacarros;
    }

    public List<Marca> getListamarcas() {
        return listamarcas;
    }

    public void setListamarcas(List<Marca> listamarcas) {
        this.listamarcas = listamarcas;
    }
}
