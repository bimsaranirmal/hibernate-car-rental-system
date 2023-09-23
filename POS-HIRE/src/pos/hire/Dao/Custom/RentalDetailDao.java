/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.hire.Dao.Custom;

import java.util.Date;
import pos.hire.Dao.CrudDao;
import pos.hire.Entity.CustomerEntity;
import pos.hire.Entity.RentalDetailEntity;

/**
 *
 * @author BIMSARA
 */
public interface RentalDetailDao extends CrudDao<RentalDetailEntity, String> {
    boolean hasActiveHire(String custId) throws Exception;

    public boolean isCarAvailableForHire(String carId, Date rentDate, Date rentDate1) throws Exception;

   
}
