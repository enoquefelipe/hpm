package teste.dao;

import com.mycompany.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import teste.entity.Marca;

public class MarcaDao {

    public int salvar(Marca marca) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(marca);
        t.commit();
        return marca.getId();
    }

    public void remover(Marca marca) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(marca);
        t.commit();
    }

    public List<Marca> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Marca").list();
        t.commit();
        return lista;
    }
}
