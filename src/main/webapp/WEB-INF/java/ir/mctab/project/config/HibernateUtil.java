package ir.mctab.project.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static Session session;
    private static SessionFactory sessionFactoryTest;
    private static Session sessionTest;

    static {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        session=sessionFactory.openSession();
        sessionFactoryTest = new Configuration().configure("hibernateTest.cfg.xml").buildSessionFactory();
        sessionTest=sessionFactoryTest.openSession();
    }

    public static Session getSession() {
        return session;
    }
    public static void closeSession(){
        session.close();
    }
    public static Session getSessionTest() {
        return sessionTest;
    }
}
