package Project.DAO;

import Project.Item;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ItemDAO {
    private static SessionFactory sessionFactory;
    private Transaction tr = null;


    public Item save(Item item){
        System.out.println(item);
        try (Session session = createSessionFactory().openSession()) {

            tr = session.getTransaction();
            tr.begin();

            session.save(item);

            tr.commit();

            System.out.println("Save is done");
        } catch (HibernateError e){
            System.err.println("Save is failed");
            System.err.println(e.getMessage());
        }
        return item;
    }


    static SessionFactory createSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory =  new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }
}
