/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.hire.Dao.Custom;

import pos.hire.Dao.CrudDao;
import pos.hire.Dto.CarDto;
import pos.hire.Entity.CarEntity;

/**
 *
 * @author BIMSARA
 */
public interface CarDao extends CrudDao<CarEntity, String> {

    public boolean updateCarAvailability(String Id, boolean availability);

    
    
}
