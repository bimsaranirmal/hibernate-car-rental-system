package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.RentalEntity;

import util.SessionFactoryConfiguration;

public class RentalRepository {
     Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveRental(RentalEntity rentalEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(rentalEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

    public RentalEntity getRental(Integer id) {
        RentalEntity rentalEntity = session.get(RentalEntity.class, id);
        return rentalEntity;
    }

    public void updateRental(RentalEntity rentalEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(rentalEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteRental(RentalEntity rentalEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(rentalEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
    
}
