package com.mycompany.dao;

import com.mycompany.entities.Ocorrencia;
import com.mycompany.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class OcorrenciaDao {

    public void salvar(Ocorrencia ocorrencia) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(ocorrencia);
        t.commit();
    }
}
