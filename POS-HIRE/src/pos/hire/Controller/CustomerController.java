/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Controller;

import java.util.ArrayList;
import pos.hire.Dao.Custom.CustomerDao;
import pos.hire.Dao.DaoFactory;
import pos.hire.Dto.CustomerDto;
import pos.hire.Service.Custom.CustomerService;
import pos.hire.Service.ServiceFactory;

/**
 *
 * @author BIMSARA
 */
public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        return customerService.getAllCustomer();
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String custId) throws Exception {
        return customerService.deleteCustomer(custId);
    }

    public CustomerDto getCustomer(String custId) throws Exception {
        return customerService.getCustomer(custId);
    }

   
}
