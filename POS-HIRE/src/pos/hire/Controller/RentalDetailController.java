/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Controller;

import java.util.ArrayList;
import java.util.Date;
import pos.hire.Dao.Custom.CustomerDao;
import pos.hire.Dao.Custom.RentalDetailDao;
import pos.hire.Dao.DaoFactory;
import pos.hire.Dto.RentalDetailDto;
import pos.hire.Dto.UserDto;
import pos.hire.Service.Custom.UserService;
import pos.hire.Service.ServiceFactory;
import pos.hire.Service.Custom.RentalDetailService;

/**
 *
 * @author BIMSARA
 */
public class RentalDetailController {
    RentalDetailService hireService = (RentalDetailService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RENTALDETAIL);

    public String addHire(RentalDetailDto hireDto) throws Exception {
        return hireService.addHire(hireDto);
    }

    public ArrayList<RentalDetailDto> getAllHires() throws Exception {
        return hireService.getAllHire();
    }

    public String updateHire(RentalDetailDto hireDto) throws Exception {
        return hireService.updateHire(hireDto);
    }

    public String deleteHire(String id) throws Exception {
        return hireService.deleteHire(id);
    }

    public RentalDetailDto getHire(String hireId) throws Exception {
        return hireService.getHire(hireId);
    }

    public boolean hasActiveHire(String custId) {
         try {
        DaoFactory daoFactory = DaoFactory.getInstance();
        RentalDetailDao rentalDetailDao = (RentalDetailDao) daoFactory.getDao(DaoFactory.DaoTypes.RENTALDETAIL);
     
        return rentalDetailDao.hasActiveHire(custId);
    } catch (Exception ex) {
        ex.printStackTrace();
        return false; 
    }  }

    public boolean isCarAvailableForHire(String carId, Date rentDate, Date rentDate1) {
       try {
        DaoFactory daoFactory = DaoFactory.getInstance();
        RentalDetailDao rentalDetailDao = (RentalDetailDao) daoFactory.getDao(DaoFactory.DaoTypes.RENTALDETAIL);
     
        return rentalDetailDao.isCarAvailableForHire(carId, rentDate, rentDate1);
    } catch (Exception ex) {
        ex.printStackTrace();
        return false;
    }
    }

  

   
}
