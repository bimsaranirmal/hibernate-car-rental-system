/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.hire.Dao.Custom;

import pos.hire.Dao.CrudDao;
import pos.hire.Dto.UserDto;
import pos.hire.Entity.UserEntity;

/**
 *
 * @author BIMSARA
 */
public interface UserDao extends CrudDao<UserEntity, String> {

    public UserDto getUserByUsername(String username);
    
   
    
        
}
