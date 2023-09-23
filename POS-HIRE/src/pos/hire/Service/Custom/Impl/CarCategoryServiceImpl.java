/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Service.Custom.Impl;

import java.util.ArrayList;
import pos.hire.Dao.Custom.CarCategoryDao;
import pos.hire.Dao.DaoFactory;
import pos.hire.Dto.CarCategoryDto;
import pos.hire.Entity.CarCategoryEntity;
import pos.hire.Service.Custom.CarCategoryService;

/**
 *
 * @author BIMSARA
 */
public class CarCategoryServiceImpl implements CarCategoryService {

    CarCategoryDao carCategoryDao = (CarCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CARCATEGORY);

    @Override
    public String addCarCategory(CarCategoryDto dto) throws Exception {
        CarCategoryEntity ce = new CarCategoryEntity(dto.getId(), dto.getCategoryName()
        );

        if (carCategoryDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateCarCategory(CarCategoryDto dto) throws Exception {
        CarCategoryEntity ce = new CarCategoryEntity(dto.getId(), dto.getCategoryName()
        );

        if (carCategoryDao.update(ce)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCarCategory(String id) throws Exception {
        if (carCategoryDao.delete(id)) {
            return "Successfully deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CarCategoryDto getCarCategory(String id) throws Exception {
        CarCategoryEntity entity = carCategoryDao.get(id);
        return new CarCategoryDto(entity.getId(), entity.getCategoryName());

    }

    @Override
    public ArrayList<CarCategoryDto> getAllCarCategory() throws Exception {
        ArrayList<CarCategoryDto> carCategoryDtos = new ArrayList<>();
        ArrayList<CarCategoryEntity> carCategoryEntitys = carCategoryDao.getAll();

        for (CarCategoryEntity entity : carCategoryEntitys) {
            CarCategoryDto dto = new CarCategoryDto(entity.getId(), entity.getCategoryName());

            carCategoryDtos.add(dto);
        }

        return carCategoryDtos;
    }

}
