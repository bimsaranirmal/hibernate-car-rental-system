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
import pos.hire.Dao.Custom.CarDao;
import pos.hire.Dto.CarDto;
import pos.hire.Dto.UserDto;
import pos.hire.Entity.CarEntity;

/**
 *
 * @author BIMSARA
 */
public class CarDaoImpl implements CarDao {

    @Override
    public boolean add(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Car (  PricePerDay, Availability, Brand,  VehicleNumber, Year, CategoryID) VALUES (?,  ?, ?, ?, ?,?)",
                t.getPricePerDay(), t.getAvailability(),
                t.getBrand(), t.getVehicleNumber(), t.getYear(),t.getCategoryid());
    }

    @Override
    public boolean update(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Car SET PricePerDay=?, Availability=?, Brand=?, VehicleNumber=?, Year=?, CategoryID=? WHERE CarId=?",
                t.getPricePerDay(), t.getAvailability(),
                t.getBrand(),  t.getVehicleNumber(), t.getYear(),t.getCategoryid(), t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Car WHERE CarId=?",
                id);
    }

    @Override
    public CarEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Car WHERE CarId = ?", id);
        while (rst.next()) {
            CarEntity carEntity = new CarEntity(rst.getString(1),
                   rst.getDouble(2),
                    rst.getBoolean(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)
            );

            return carEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CarEntity> getAll() throws Exception {
        ArrayList<CarEntity> carEntitys = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("Select * FROM Car");

        while (rst.next()) {
            CarEntity carEntity = new CarEntity(rst.getString(1),
                     
                    rst.getDouble(2),
                    rst.getBoolean(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)
            );

            carEntitys.add(carEntity);
        }

        return carEntitys;
    }

    @Override
    public boolean updateCarAvailability(String Id, boolean availability) {
        try {
            return CrudUtil.executeUpdate("UPDATE Car SET Availability = ? WHERE CarId = ?",
                    availability, Id);
        } catch (SQLException ex) {
            Logger.getLogger(CarDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}


