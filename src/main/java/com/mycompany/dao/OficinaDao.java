package com.mycompany.dao;

import com.mycompany.entities.Oficina;
import com.mycompany.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class OficinaDao {

    public void salvar(Oficina oficina) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(oficina);
        t.commit();
    }

    public List<Oficina> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Oficina").list();
        t.commit();
        return lista;
    }

}
