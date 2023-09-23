/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.hire.Service.Custom;

import pos.hire.Dto.UserDto;

/**
 *
 * @author BIMSARA
 */
public interface UserLoginService {

    UserDto loginUser(String username, String password) throws Exception;

}
