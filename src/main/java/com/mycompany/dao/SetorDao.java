package com.mycompany.dao;

import com.mycompany.entities.Setor;
import com.mycompany.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class SetorDao {
       public void salvar(Setor setor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(setor);
        t.commit();
    }
}
