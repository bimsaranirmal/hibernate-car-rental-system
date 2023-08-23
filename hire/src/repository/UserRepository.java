package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.UserEntity;
import util.SessionFactoryConfiguration;

public class UserRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveUser(UserEntity userEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(userEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

    public UserEntity getUser(Integer id) {
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
