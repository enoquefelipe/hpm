package com.mycompany.utils;

import com.mycompany.entities.Contato;
import com.mycompany.entities.Departamento;
import com.mycompany.entities.Empresa;
import com.mycompany.entities.Endereco;
import com.mycompany.entities.Oficina;
import com.mycompany.entities.Pessoa;
import com.mycompany.entities.Ticket;
import com.mycompany.entities.Usuario;
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
                ac.addAnnotatedClass(Oficina.class);
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
