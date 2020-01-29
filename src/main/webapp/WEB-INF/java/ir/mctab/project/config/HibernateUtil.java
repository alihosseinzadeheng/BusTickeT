package ir.mctab.project.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static Session session;

    static {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        session= sessionFactory.openSession();
    }

    public static Session getSession() {
        return session;
    }
    public static void closeSession(){
        session.close();
    }
}
