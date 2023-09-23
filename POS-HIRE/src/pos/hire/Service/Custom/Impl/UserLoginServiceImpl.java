/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Service.Custom.Impl;

import pos.hire.Dao.Custom.UserDao;
import pos.hire.Dto.UserDto;
import pos.hire.Service.Custom.UserLoginService;

/**
 *
 * @author BIMSARA
 */
public class UserLoginServiceImpl implements UserLoginService {

    private UserDao userDao;

    public UserLoginServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDto loginUser(String username, String password) throws Exception {
        UserDto userDto = userDao.getUserByUsername(username);

        if (userDto != null && userDto.getPassword().equals(password)) {
            return userDto; 
        } else {
            return null; 
        }
    }

}
