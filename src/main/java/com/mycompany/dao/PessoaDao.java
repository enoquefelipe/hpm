
package com.mycompany.dao;

import com.mycompany.entities.Pessoa;
import com.mycompany.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class PessoaDao {

    public void salvar(Pessoa pessoa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(pessoa);
        t.commit();
    }
}
