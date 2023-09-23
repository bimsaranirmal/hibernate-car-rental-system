package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.CarCategoryEntity;
import entity.CarEntity;
import util.SessionFactoryConfiguration;

public class CarCategoryRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public String saveCarCategory(CarEntity carCategoryEntity){

        Transaction transaction = session.beginTransaction();
        try {
            String id = (String)session.save(carCategoryEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return null;
        }
    }

    public CarCategoryEntity getCarCategory(String id) {
        CarCategoryEntity carCategoryEntity = session.get(CarCategoryEntity.class, id);
        return carCategoryEntity;
    }

    public void updateCarCategory(CarCategoryEntity carCategoryEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(carCategoryEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteCarCategory(CarCategoryEntity carCategoryEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(carCategoryEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
}
