package com.mycompany.dao;

import com.mycompany.entity.Ticket;
import com.mycompany.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class TicketDao {

    public int salvar(Ticket ticket) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(ticket);
        t.commit();
        return ticket.getId();
    }

    public List<Ticket> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Ticket").list();
        t.commit();
        return lista;
    }

    public Ticket selecionar(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Ticket) session.load(Ticket.class, id);
    }
}
