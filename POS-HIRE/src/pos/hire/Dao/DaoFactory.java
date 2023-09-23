/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Dao;

import pos.hire.Dao.Custom.Impl.CarCategoryDaoImpl;
import pos.hire.Dao.Custom.Impl.CarDaoImpl;
import pos.hire.Dao.Custom.Impl.CustomerDaoImpl;

import pos.hire.Dao.Custom.Impl.RentalDetailDaoImpl;
import pos.hire.Dao.Custom.Impl.UserDaoImpl;
import pos.hire.Dao.Custom.UserDao;

/**
 *
 * @author BIMSARA
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }

        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerDaoImpl();
            case USER:
                return new UserDaoImpl();
            case CAR:
                return new CarDaoImpl();
            case CARCATEGORY:
                return new CarCategoryDaoImpl();
            
            case RENTALDETAIL:
                return new RentalDetailDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        CUSTOMER, USER, CAR, CARCATEGORY, RENTALDETAIL,RENTAL
    }
}
