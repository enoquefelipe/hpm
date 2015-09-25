package com.mycompany.dao;

import com.mycompany.entities.Chamado;
import com.mycompany.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class ChamadoDao {

    public int salvar(Chamado chamado) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(chamado);
        t.commit();
        return chamado.getId();
    }

    public List<Chamado> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Chamado").list();
        t.commit();
        return lista;
    }

    public Chamado selecionar(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Chamado) session.load(Chamado.class, id);
    }

    public void remover(Chamado chamado) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(chamado);
        t.commit();
    }
}
