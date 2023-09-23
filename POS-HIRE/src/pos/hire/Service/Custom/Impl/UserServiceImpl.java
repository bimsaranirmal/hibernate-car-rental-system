/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Service.Custom.Impl;

import java.util.ArrayList;
import pos.hire.Dao.Custom.UserDao;
import pos.hire.Dao.DaoFactory;
import pos.hire.Dto.UserDto;
import pos.hire.Entity.UserEntity;
import pos.hire.Service.Custom.UserService;

/**
 *
 * @author BIMSARA
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public String addUser(UserDto dto) throws Exception {

        UserEntity ce = new UserEntity(dto.getId(), dto.getContactNo(),
                dto.getEmail(), dto.getName(),
                dto.getPassword(), dto.getUserName());

        if (userDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateUser(UserDto dto) throws Exception {
        UserEntity ce = new UserEntity(dto.getId(), dto.getContactNo(),
                dto.getEmail(), dto.getName(),
                dto.getPassword(), dto.getUserName());

        if (userDao.update(ce)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteUser(String id) throws Exception {
        if (userDao.delete(id)) {
            return "Successfully deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public UserDto getUser(String id) throws Exception {
        UserEntity entity = userDao.get(id);
    if (entity != null) {
        return new UserDto(entity.getId(), entity.getContactNo(),
            entity.getEmail(), entity.getName(), entity.getPassword(), entity.getUserName());
    } else {
        // Handle the case where the entity is null, e.g., by returning a default or throwing an exception.
        throw new Exception("User not found for id: " + id);
    }
    }

    @Override
    public ArrayList<UserDto> getAllUser() throws Exception {
        ArrayList<UserDto> userDtos = new ArrayList<>();
        ArrayList<UserEntity> userEntitys = userDao.getAll();

        for (UserEntity entity : userEntitys) {
            UserDto dto = new UserDto(entity.getId(), entity.getContactNo(),
                    entity.getEmail(), entity.getName(), entity.getPassword(), entity.getUserName());
            userDtos.add(dto);
        }

        return userDtos;
    }

}

