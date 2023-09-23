package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.UserEntity;
import util.SessionFactoryConfiguration;

public class UserRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Long saveUser(UserEntity userEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Long id = (Long)session.save(userEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return null;
        }
    }

    public UserEntity getUser(Long id) {
        UserEntity UserEntity = session.get(UserEntity.class, id);
        return UserEntity;
    }

    public void updateUser(UserEntity userEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(userEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteUser(UserEntity userEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(userEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
}
