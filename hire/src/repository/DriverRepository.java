package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;


import entity.DriverEntity;
import util.SessionFactoryConfiguration;

public class DriverRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveDriver(DriverEntity driverEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(driverEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

    public DriverEntity getDriver(Integer id) {
        DriverEntity driverEntity = session.get(DriverEntity.class, id);
        return driverEntity;
    }

    public void updateDriver(DriverEntity driverEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(driverEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteDriver(DriverEntity driverEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(driverEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
}
