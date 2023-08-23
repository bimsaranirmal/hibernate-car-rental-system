package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.ReviewDetailEntity;
import util.SessionFactoryConfiguration;

public class ReviewDetailRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveReviewDetail(ReviewDetailEntity reviewDetailEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(reviewDetailEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

    public ReviewDetailEntity getReviewDetail(Integer id) {
        ReviewDetailEntity reviewDetailEntity = session.get(ReviewDetailEntity.class, id);
        return reviewDetailEntity;
    }

    public void updateDetailReview(ReviewDetailEntity reviewDetailEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(reviewDetailEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteDetailReview(ReviewDetailEntity reviewDetailEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(reviewDetailEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
}
