
import com.mycompany.dao.PessoaDao;
import com.mycompany.entity.Pessoa;
import com.mycompany.entity.Ticket;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.AnnotationConfiguration;

public class Teste {

    public static Pessoa people;

    public static void main(String[] args) {
//
//        AnnotationConfiguration configuration = new AnnotationConfiguration();
//        configuration.configure();
//
//        SessionFactory factory = configuration.buildSessionFactory();
//        Session session = factory.openSession();

////        people = new Pessoa();
////        people.setId(10);
////        people.setName("Enoque");
////        java.util.Date dataAtual = new java.util.Date(System.currentTimeMillis());
////        people.setData_nascimento(dataAtual);
////        PessoaDao dao = new PessoaDao();
////        dao.save(people);
////
////        System.out.println(people.getName());
//        Transaction transaction = session.beginTransaction();
//        session.save(people);
//        session.saveOrUpdate(people);
//        transaction.commit();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hpm_tickets");
        EntityManager manager = factory.createEntityManager();
        Ticket ticket = manager.find(Ticket.class, 1L);
        System.out.println(ticket.getTitulo());
        manager.close();
    }

}
