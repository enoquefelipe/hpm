package com.mycompany.dao;

import com.mycompany.entities.Endereco;
import com.mycompany.utils.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Administrador
 */
public class EnderecoDao {

    public Endereco selecionar(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Endereco) session.load(Endereco.class, id);
    }
}
