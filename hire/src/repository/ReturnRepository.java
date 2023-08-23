package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.ReturnEntity;

import util.SessionFactoryConfiguration;

public class ReturnRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveReturn(ReturnEntity returnEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(returnEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

    public ReturnEntity getReturn(Integer id) {
        ReturnEntity returnEntity = session.get(ReturnEntity.class, id);
        return returnEntity;
    }

    public void updateDetailReview(ReturnEntity returnEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(returnEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteDetailReview(ReturnEntity returnEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(returnEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
}
