/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Service.Custom.Impl;

import java.util.ArrayList;
import pos.hire.Dao.Custom.CustomerDao;
import pos.hire.Dao.DaoFactory;
import pos.hire.Dto.CustomerDto;
import pos.hire.Dto.RentalDetailDto;
import pos.hire.Entity.CustomerEntity;
import pos.hire.Entity.RentalDetailEntity;
import pos.hire.Dao.Custom.RentalDetailDao;
import pos.hire.Service.Custom.RentalDetailService;

/**
 *
 * @author BIMSARA
 */
public class RentalDetailServiceImpl implements RentalDetailService{

    RentalDetailDao hireDao = (RentalDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENTALDETAIL);
    public String addHire(RentalDetailDto dto) throws Exception {
       RentalDetailEntity ce = new RentalDetailEntity(dto.getRentalId(),
               dto.getAdvancedPay(),
               dto.getBalance(),
              
               dto.getPerDayRent(),
               dto.getRefund(),
               dto.getRentalEndDate(),
               dto.getRentalStartDate(),
               dto.getReturned(),
                
       dto.getTotalAmount(),
               dto.getCarId(),
               dto.getCustId()
       );

        if (hireDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateHire(RentalDetailDto dto) throws Exception {
        RentalDetailEntity ce = new RentalDetailEntity(dto.getRentalId(), dto.getAdvancedPay(),
               dto.getBalance(),
               
               dto.getPerDayRent(),
               dto.getRefund(),
               dto.getRentalEndDate(),
               dto.getRentalStartDate(),
               dto.getReturned(),
       dto.getTotalAmount(),
                dto.getCarId(),
               dto.getCustId()
       );
        if (hireDao.update(ce)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteHire(String id) throws Exception {
       if (hireDao.delete(id)) {
            return "Successfully deleted";
        } else {
            return "Fail";
        }
    }

    

    @Override
    public ArrayList<RentalDetailDto> getAllHire() throws Exception {
        ArrayList<RentalDetailDto> hireDtos = new ArrayList<>();
        ArrayList<RentalDetailEntity> hireEntitys = hireDao.getAll();

        for (RentalDetailEntity entity : hireEntitys) {
            RentalDetailDto dto = new RentalDetailDto(entity.getRentalId(),
                    entity.getAdvancedPay(),
                    entity.getBalance(),
                    
                    entity.getPerDayRent(),
                    entity.getRefund(),
                    entity.getRentalEndDate(),
                    entity.getRentalStartDate(),
                    entity.getReturned(),
                     entity.getTotalAmount(),
                    entity.getCarId(),
                    entity.getCustId()
                     );
            hireDtos.add(dto);
        }

        return hireDtos;
    }

    @Override
    public RentalDetailDto getHire(String id) throws Exception {
        RentalDetailEntity entity = hireDao.get(id);
        return new RentalDetailDto(entity.getRentalId(), 
                     entity.getAdvancedPay(),
                    entity.getBalance(),
                    
                    entity.getPerDayRent(),
                    entity.getRefund(),
                    entity.getRentalEndDate(),
                    entity.getRentalStartDate(),
                    entity.getReturned(),
                     entity.getTotalAmount(),
                    entity.getCarId(),
                    entity.getCustId()
                     );
    }

   
    
}
