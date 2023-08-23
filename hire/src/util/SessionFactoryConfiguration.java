package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.CarCategoryEntity;
import entity.CarEntity;
import entity.CustomerEntity;
import entity.DriverEntity;
import entity.RentalEntity;

public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration sessionFactoryConfiguration;

    private SessionFactory sessionFactory;

    private SessionFactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
            .addAnnotatedClass(CustomerEntity.class)
            .addAnnotatedClass(DriverEntity.class)
            .addAnnotatedClass(RentalEntity.class)
            .addAnnotatedClass(CarEntity.class)
            .addAnnotatedClass(CarCategoryEntity.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactoryConfiguration getInstance() {
        return sessionFactoryConfiguration == null ? 
            sessionFactoryConfiguration = new SessionFactoryConfiguration()
            : sessionFactoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}