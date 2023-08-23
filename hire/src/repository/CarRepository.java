package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.CarEntity;

import util.SessionFactoryConfiguration;

public class CarRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveCar(CarEntity carEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(carEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

    public CarEntity getCar(Integer id) {
        CarEntity carEntity = session.get(CarEntity.class, id);
        return carEntity;
    }

    public void updateCar(CarEntity carEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(carEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteCar(CarEntity carEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(carEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
    
}
