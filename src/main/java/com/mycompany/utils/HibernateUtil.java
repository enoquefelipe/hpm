package com.mycompany.utils;

import com.mycompany.entity.Contato;
import com.mycompany.entity.Departamento;
import com.mycompany.entity.Empresa;
import com.mycompany.entity.Endereco;
import com.mycompany.entity.Pessoa;
import com.mycompany.entity.Ticket;
import com.mycompany.entity.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(Pessoa.class);
                ac.addAnnotatedClass(Ticket.class);
                ac.addAnnotatedClass(Usuario.class);
                ac.addAnnotatedClass(Contato.class);
                ac.addAnnotatedClass(Endereco.class);
                ac.addAnnotatedClass(Empresa.class);
                ac.addAnnotatedClass(Departamento.class);
                sessionFactory = ac.configure().buildSessionFactory();
            } catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
            return sessionFactory;
        } else {
            return sessionFactory;
        }
    }
}
