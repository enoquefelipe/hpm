package com.mycompany.utils;

import com.mycompany.entities.Contato;
import com.mycompany.entities.Departamento;
import com.mycompany.entities.Empresa;
import com.mycompany.entities.Endereco;
import com.mycompany.entities.Ocorrencia;
import com.mycompany.entities.Oficina;
import com.mycompany.entities.Pessoa;
import com.mycompany.entities.Setor;
import com.mycompany.entities.Chamado;
import com.mycompany.entities.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(Pessoa.class);
                ac.addAnnotatedClass(Chamado.class);
                ac.addAnnotatedClass(Usuario.class);
                ac.addAnnotatedClass(Contato.class);
                ac.addAnnotatedClass(Endereco.class);
                ac.addAnnotatedClass(Empresa.class);
                ac.addAnnotatedClass(Departamento.class);
                ac.addAnnotatedClass(Oficina.class);
                ac.addAnnotatedClass(Setor.class);
                ac.addAnnotatedClass(Ocorrencia.class);
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
