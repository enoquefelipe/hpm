package teste.dao;

import com.mycompany.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import teste.entity.Carro;

public class CarroDao {

    public int salvar(Carro carro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(carro);
        t.commit();
        return carro.getId();
    }
    
        public void remover(Carro carro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(carro);
        t.commit();
    }
}
