import org.hibernate.Session;

import entity.CustomerEntity;
import entity.UserEntity;
import repository.CarCategoryRepository;
import repository.CarRepository;
import repository.CustomerRepository;

import repository.RentalRepository;

import repository.UserRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepo = new CustomerRepository();

        RentalRepository rentalRepo = new RentalRepository();
        CarRepository carRepo = new CarRepository();
        CarCategoryRepository carCatagoryRepo = new CarCategoryRepository();

        UserRepository userRepo = new UserRepository();
        
        Session session = SessionFactoryConfiguration.getInstance().getSession();

        try{
         // Begin a transaction
            session.beginTransaction();

            // Create a new UserEntity instance with sample data
            UserEntity user = new UserEntity();
            user.setUserName("Bimsara");  // Set the username
            user.setPassword("bimsara123");  // Set the password
            user.setName("Bimsara Nirmal");  // Set the user's name
            user.setEmail("bimsara@gmail.com");  // Set the email
            user.setContactNo("0774512325");  // Set the contact number

            // Save the user entity to the database
            Long userId = userRepo.saveUser(user);

            // Commit the transaction
            session.getTransaction().commit();

            System.out.println("User inserted successfully with ID: " + userId);
        } catch (Exception e) {
            // Handle exceptions
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // Close the Session
            session.close();
        }
    } 
}
