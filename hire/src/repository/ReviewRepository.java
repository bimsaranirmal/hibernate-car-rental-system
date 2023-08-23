package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.ReviewEntity;
import util.SessionFactoryConfiguration;

public class ReviewRepository {
     Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveReview(ReviewEntity reviewEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(reviewEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

    public ReviewEntity getReview(Integer id) {
        ReviewEntity reviewEntity = session.get(ReviewEntity.class, id);
        return reviewEntity;
    }

    public void updateReview(ReviewEntity reviewEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(reviewEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteReview(ReviewEntity reviewEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(reviewEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
}
