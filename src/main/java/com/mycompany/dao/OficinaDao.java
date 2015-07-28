package com.mycompany.dao;

import com.mycompany.entities.Oficina;
import com.mycompany.utils.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Administrador
 */
public class OficinaDao {

    public void salvar(Oficina oficina) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(oficina);
        t.commit();
    }

    public List<Oficina> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Oficina").list();
        t.commit();
        return lista;
    }

    public Oficina selecionar(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Oficina) session.load(Oficina.class, id);
    }

    public void remover(Oficina oficina) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(oficina);
        t.commit();
    }

    public void atualizar(Oficina oficina) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(oficina);
        t.commit();
    }

    public List<Oficina> pesquisar(String descricao) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Oficina.class);

//      crit.add(Restrictions.like("nome", descricao + "%"));
        Criterion sigla = Restrictions.ilike("sigla", descricao + "%");
        Criterion nome = Restrictions.like("nome", descricao + "%");
        Disjunction disjunction = Restrictions.disjunction();
        disjunction.add(sigla);
        disjunction.add(nome);
        crit.add(disjunction);

        List results = crit.list();
        return results;
    }
}
