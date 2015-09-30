package com.mycompany.dao;

import com.mycompany.entities.Departamento;
import com.mycompany.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class DepartamentoDao {

    public void salvar(Departamento departamento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(departamento);
        t.commit();
        session.close();
    }
}
