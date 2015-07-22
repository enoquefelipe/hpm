package com.mycompany.dao;

import com.mycompany.entities.Usuario;
import com.mycompany.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class UsuarioDao {

    public void salvar(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(usuario);
        t.commit();
    }
}
