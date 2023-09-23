/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Controller;

import java.util.ArrayList;
import pos.hire.Dto.CarCategoryDto;
import pos.hire.Service.Custom.CarCategoryService;
import pos.hire.Service.ServiceFactory;

/**
 *
 * @author BIMSARA
 */
public class CarCategoryController {

    CarCategoryService carCategoryService = (CarCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CARCATEGORY);

    public String addCarCategory(CarCategoryDto carCategoryDto) throws Exception {
        return carCategoryService.addCarCategory(carCategoryDto);
    }

    public ArrayList<CarCategoryDto> getAllCarCategorys() throws Exception {
        return carCategoryService.getAllCarCategory();
    }

    public String updateCarCategory(CarCategoryDto carCategoryDto) throws Exception {
        return carCategoryService.updateCarCategory(carCategoryDto);
    }

    public String deleteCarCategory(String id) throws Exception {
        return carCategoryService.deleteCarCategory(id);
    }

    public CarCategoryDto getCarCategory(String carCategoryId) throws Exception {
        return carCategoryService.getCarCategory(carCategoryId);
    }
}
