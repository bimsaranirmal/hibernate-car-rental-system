package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.CarCategoryEntity;
import entity.CarEntity;
import util.SessionFactoryConfiguration;

public class CarCategoryRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveCarCategory(CarEntity carCategoryEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(carCategoryEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

    public CarCategoryEntity getCarCategory(Integer id) {
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
