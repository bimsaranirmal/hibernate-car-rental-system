/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.hire.Service.Custom;

import java.util.ArrayList;
import pos.hire.Dto.CarDto;
import pos.hire.Service.SuperService;

/**
 *
 * @author BIMSARA
 */
public interface CarService extends SuperService {

    String addCar(CarDto carDto) throws Exception;

    String updateCar(CarDto carDto) throws Exception;

    String deleteCar(String id) throws Exception;

    CarDto getCar(String id) throws Exception;

    ArrayList<CarDto> getAllCar() throws Exception;
    
    
}
