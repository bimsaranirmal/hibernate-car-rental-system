/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Service.Custom.Impl;

import java.util.ArrayList;
import pos.hire.Dao.Custom.CarDao;
import pos.hire.Dao.DaoFactory;
import pos.hire.Dto.CarDto;
import pos.hire.Dto.UserDto;
import pos.hire.Entity.CarEntity;
import pos.hire.Service.Custom.CarService;

/**
 *
 * @author BIMSARA
 */
public class CarServiceImpl implements CarService {

    CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);

    @Override
    public String addCar(CarDto dto) throws Exception {
        CarEntity ce = new CarEntity(dto.getId(), dto.getPricePerDay(),
                dto.getAvailability(), 
                dto.getBrand(), dto.getVehicleNumber(), dto.getYear(), dto.getCategoryid());

        if (carDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateCar(CarDto dto) throws Exception {
        CarEntity ce = new CarEntity(dto.getId(), dto.getPricePerDay(),
                dto.getAvailability(), 
                dto.getBrand(), dto.getVehicleNumber(), dto.getYear(), dto.getCategoryid());

        if (carDao.update(ce)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCar(String id) throws Exception {
        if (carDao.delete(id)) {
            return "Successfully deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CarDto getCar(String id) throws Exception {
        CarEntity entity = carDao.get(id);
        return new CarDto(entity.getId(), entity.getPricePerDay(),
                entity.getAvailability(), 
                entity.getBrand(), entity.getVehicleNumber(), entity.getYear(), entity.getCategoryid());
    }

    @Override
    public ArrayList<CarDto> getAllCar() throws Exception {
        ArrayList<CarDto> carDtos = new ArrayList<>();
        ArrayList<CarEntity> carEntitys = carDao.getAll();

        for (CarEntity entity : carEntitys) {
            CarDto dto = new CarDto(entity.getId(), entity.getPricePerDay(),
                    entity.getAvailability(), 
                    entity.getBrand(), entity.getVehicleNumber(), entity.getYear(), entity.getCategoryid());
            carDtos.add(dto);
        }

        return carDtos;
    }

    }

    
    

    

    

 


