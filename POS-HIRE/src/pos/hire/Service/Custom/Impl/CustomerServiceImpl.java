/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Service.Custom.Impl;

import java.util.ArrayList;
import pos.hire.Dao.Custom.CustomerDao;
import pos.hire.Dao.DaoFactory;
import pos.hire.Dto.CustomerDto;
import pos.hire.Entity.CustomerEntity;
import pos.hire.Service.Custom.CustomerService;

/**
 *
 * @author BIMSARA
 */
public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    public String addCustomer(CustomerDto dto) throws Exception {

        CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getAddress(),
                dto.getContactNo(), dto.getName(),
                dto.getNic());

        if (customerDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }

    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {

        CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getAddress(),
                dto.getContactNo(),
                dto.getName(), dto.getNic());

        if (customerDao.update(ce)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if (customerDao.delete(id)) {
            return "Successfully deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        return new CustomerDto(entity.getId(), entity.getAddress(),
                entity.getContactNo(), entity.getName(), entity.getNic());
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();

        for (CustomerEntity entity : customerEntitys) {
            CustomerDto dto = new CustomerDto(entity.getId(), entity.getAddress(),
                    entity.getContactNo(), entity.getName(), entity.getNic());
            customerDtos.add(dto);
        }

        return customerDtos;
    }

}
