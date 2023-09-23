/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.hire.Service.Custom;

import java.util.ArrayList;
import pos.hire.Dto.UserDto;
import pos.hire.Service.SuperService;

/**
 *
 * @author BIMSARA
 */
public interface UserService extends SuperService {

    String addUser(UserDto userDto) throws Exception;

    String updateUser(UserDto userDto) throws Exception;

    String deleteUser(String id) throws Exception;

    UserDto getUser(String id) throws Exception;

    ArrayList<UserDto> getAllUser() throws Exception;
}
