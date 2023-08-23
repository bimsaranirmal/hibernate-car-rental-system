import repository.CarCategoryRepository;
import repository.CarRepository;
import repository.CustomerRepository;
import repository.DriverRepository;
import repository.RentalRepository;
import repository.ReturnRepository;
import repository.ReviewDetailRepository;
import repository.ReviewRepository;
import repository.UserRepository;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepo = new CustomerRepository();
        DriverRepository driverRepo = new DriverRepository();
        RentalRepository rentalRepo = new RentalRepository();
        CarRepository carRepo = new CarRepository();
        CarCategoryRepository carCatagoryRepo = new CarCategoryRepository();
        ReviewRepository reviewRepo = new ReviewRepository();
        ReviewDetailRepository reviewDetailRepo = new ReviewDetailRepository();
        ReturnRepository returnRepo = new ReturnRepository();
        UserRepository userRepo = new UserRepository();
        
            // Create a new CustomerEntity instance
            /* 
            CustomerEntity customer = new CustomerEntity();
            customer.setName("Bimsara Nirmal");
            customer.setAddress("102/A Main St");
            customer.setLicenseNo("345284");
            customer.setContactNo("0774541274");
            customer.getMobiles().add("0112562478");
           
             // Add mobile number
            // Add more properties as needed
    
            // Open a Hibernate Session
            Session session = SessionFactoryConfiguration.getInstance().getSession();
    
            try {
                // Begin a transaction
                session.beginTransaction();
    
                // Save the customer entity
                session.save(customer);
    
                // Commit the transaction
                session.getTransaction().commit();
                
                System.out.println("Customer inserted successfully!");
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
             */
        }    }
