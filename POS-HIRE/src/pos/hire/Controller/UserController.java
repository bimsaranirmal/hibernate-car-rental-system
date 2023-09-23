/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Controller;

import java.util.ArrayList;
import pos.hire.Dto.UserDto;
import pos.hire.Service.Custom.UserService;
import pos.hire.Service.ServiceFactory;

/**
 *
 * @author BIMSARA
 */
public class UserController {

    UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public String addUser(UserDto userDto) throws Exception {
        return userService.addUser(userDto);
    }

    public ArrayList<UserDto> getAllUsers() throws Exception {
        return userService.getAllUser();
    }

    public String updateUser(UserDto userDto) throws Exception {
        return userService.updateUser(userDto);
    }

    public String deleteUser(String id) throws Exception {
        return userService.deleteUser(id);
    }

    public UserDto getUser(String userId) throws Exception {
        return userService.getUser(userId);
    }
   
    
    
}
