package repository;

import util.SessionFactoryConfiguration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import entity.CustomerEntity;



public class CustomerRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();
    
    public String  saveCustomer(CustomerEntity customerEntity){

        Transaction transaction = session.beginTransaction();
        try {
            String  id = (String )session.save(customerEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return null;
        }
    }

    public CustomerEntity getCustomer(String  id) {
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;
    }

    public void updateStudent(CustomerEntity customerEntity){
        Transaction transaction = session.beginTransaction();
        try {
            session.update(customerEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteStudent(CustomerEntity customerEntity){
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