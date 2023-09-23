/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Dao.Custom.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.hire.Dao.CrudUtil;
import pos.hire.Dao.Custom.UserDao;
import pos.hire.Dto.UserDto;
import pos.hire.Entity.UserEntity;

/**
 *
 * @author BIMSARA
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
    }

    @Override
    public boolean add(UserEntity t) throws Exception {

        return CrudUtil.executeUpdate("INSERT INTO User(  ContactNo, email, name, password, userName) VALUES(?,?,?,?,?)",
                t.getContactNo(), t.getEmail(), t.getName(), t.getPassword(), t.getUserName());
    }

    @Override
    public boolean update(UserEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE User SET ContactNo=?, email=?, name=?, userName=?, password=? WHERE UserId=?",
                t.getContactNo(), t.getEmail(),
                t.getName(), t.getPassword(), t.getUserName(), t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM User WHERE UserId=?",
                id);
    }

    @Override
    public UserEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM User WHERE UserId = ?", id);

        while (rst.next()) {
            UserEntity userEntity = new UserEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6));

            return userEntity;
        }
        return null;
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        ArrayList<UserEntity> userEntitys = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("Select * FROM User");

        while (rst.next()) {
            UserEntity userEntity = new UserEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6));

            userEntitys.add(userEntity);
        }

        return userEntitys;
    }

    @Override
    public UserDto getUserByUsername(String username) {
        try {
            ResultSet rst = CrudUtil.executeQuery("SELECT * FROM User WHERE userName = ?", username);

            while (rst.next()) {
                UserDto userDto = new UserDto(rst.getString("UserId"),
                        rst.getString("ContactNo"),
                        rst.getString("email"),
                        rst.getString("name"),
                        rst.getString("password"),
                        rst.getString("userName"));
                return userDto;
            }

            return null;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
