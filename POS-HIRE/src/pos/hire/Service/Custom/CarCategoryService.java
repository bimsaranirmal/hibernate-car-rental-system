/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.hire.Service.Custom;

import java.util.ArrayList;
import pos.hire.Dto.CarCategoryDto;
import pos.hire.Service.SuperService;

/**
 *
 * @author BIMSARA
 */
public interface CarCategoryService extends SuperService {

    String addCarCategory(CarCategoryDto carCategoryDto) throws Exception;

    String updateCarCategory(CarCategoryDto carCategoryDto) throws Exception;

    String deleteCarCategory(String id) throws Exception;

    CarCategoryDto getCarCategory(String id) throws Exception;

    ArrayList<CarCategoryDto> getAllCarCategory() throws Exception;
}
