/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Controller;

import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import pos.hire.Dao.CrudUtil;
import pos.hire.Dao.Custom.CarDao;
import pos.hire.Dao.Custom.RentalDetailDao;
import pos.hire.Dao.DaoFactory;
import pos.hire.Dto.CarDto;
import pos.hire.Service.Custom.CarService;
import pos.hire.Service.ServiceFactory;

/**
 *
 * @author BIMSARA
 */
public class CarController {

    CarService carService = (CarService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR);

    public String addCar(CarDto carDto) throws Exception {
        return carService.addCar(carDto);
    }

    public ArrayList<CarDto> getAllCars() throws Exception {
        return carService.getAllCar();
    }

    public String updateCar(CarDto carDto) throws Exception {
        return carService.updateCar(carDto);
    }

    public String deleteCar(String id) throws Exception {
        return carService.deleteCar(id);
    }

    public CarDto getCar(String carId) throws Exception {
        return carService.getCar(carId);
    }

    public void updateCarAvailability(String Id, boolean availability) {
        try {
        DaoFactory daoFactory = DaoFactory.getInstance();
        CarDao carDao = (CarDao) daoFactory.getDao(DaoFactory.DaoTypes.CAR);

        // Update the car's availability status in the database
        boolean success = carDao.updateCarAvailability(Id, availability);

        if (success) {
            // Optionally, you can log or handle a successful update here
        } else {
            // Handle the case where the update fails
        }
    } catch (Exception ex) {
        // Handle any exceptions that may occur during the update
        ex.printStackTrace();
    }
    }

    

    }

    
   
   

   

    

   





    

