package repository;

import util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.CustomerEntity;



public class CustomerRepository {
     Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public Integer saveCustomer(CustomerEntity customerEntity){

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(customerEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

    public CustomerEntity getCustomer(Integer id) {
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;
    }

    public void updateCustomer(CustomerEntity customerEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(customerEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteCustomer(CustomerEntity customerEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(customerEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }
}
