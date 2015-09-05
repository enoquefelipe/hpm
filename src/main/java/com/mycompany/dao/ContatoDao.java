package com.mycompany.dao;

import com.mycompany.entities.Contato;
import com.mycompany.utils.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Administrador
 */
public class ContatoDao {
    
        public Contato selecionar(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Contato) session.load(Contato.class, id);
    }
}
