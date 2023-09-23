/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Service;

import pos.hire.Dao.Custom.Impl.UserDaoImpl;
import pos.hire.Dao.Custom.UserDao;
import pos.hire.Service.Custom.Impl.CarCategoryServiceImpl;
import pos.hire.Service.Custom.Impl.CarServiceImpl;
import pos.hire.Service.Custom.Impl.CustomerServiceImpl;

import pos.hire.Service.Custom.Impl.RentalDetailServiceImpl;

import pos.hire.Service.Custom.Impl.UserLoginServiceImpl;
import pos.hire.Service.Custom.Impl.UserServiceImpl;
import pos.hire.Service.Custom.UserLoginService;

/**
 *
 * @author BIMSARA
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }

        return serviceFactory;
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerServiceImpl();
            case USER:
                return new UserServiceImpl();
            case CAR:
                return new CarServiceImpl();
            case CARCATEGORY:
                return new CarCategoryServiceImpl();
            case RENTALDETAIL:
                return new RentalDetailServiceImpl();
            
            default:
                return null;
        }
    }

    public UserLoginService getUserLoginService() {
        UserDao userDao = new UserDaoImpl(); 
        return new UserLoginServiceImpl(userDao); 
    }

    public enum ServiceType {
        CUSTOMER, USER, CAR, CARCATEGORY,RENTALDETAIL, RENTAL
    }

}
