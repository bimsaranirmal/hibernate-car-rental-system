/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.hire.Service.Custom;

import java.util.ArrayList;
import pos.hire.Dto.CustomerDto;
import pos.hire.Service.SuperService;

/**
 *
 * @author BIMSARA
 */
public interface CustomerService extends SuperService {

    String addCustomer(CustomerDto customerDto) throws Exception;

    String updateCustomer(CustomerDto customerDto) throws Exception;

    String deleteCustomer(String id) throws Exception;

    CustomerDto getCustomer(String id) throws Exception;

    ArrayList<CustomerDto> getAllCustomer() throws Exception;
}
