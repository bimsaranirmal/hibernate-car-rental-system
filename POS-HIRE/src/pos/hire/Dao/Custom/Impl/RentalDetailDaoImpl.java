/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Dao.Custom.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.hire.Dao.CrudUtil;
import pos.hire.Entity.CustomerEntity;
import pos.hire.Entity.RentalDetailEntity;
import pos.hire.Dao.Custom.RentalDetailDao;

/**
 *
 * @author BIMSARA
 */
public class RentalDetailDaoImpl implements RentalDetailDao{

    @Override
    public boolean add(RentalDetailEntity t) throws Exception {
         return CrudUtil.executeUpdate("INSERT INTO RentalDetail VALUES(?,?,?,?,?,?,?,?,?,?,?)",
                t.getRentalId(),t.getAdvancedPay(), t.getBalance(),t.getPerDayRent(),
                t.getRefund(), t.getRentalEndDate(),t.getRentalStartDate(),
                t.getReturned(),t.getTotalAmount(),t.getCarId(),t.getCustId()
         );
    }

    @Override
    public boolean update(RentalDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE RentalDetail SET CarID = ?,  CustId = ?,AdvancedPay = ?, Balance = ?, perdayRent = ?, Refund = ?, RentalEndDate = ?, RentalStartDate = ?, Returned = ?, TotalAmount = ? WHERE RentalID = ?",
                  t.getCarId(),t.getCustId(),t.getAdvancedPay(), t.getBalance(),t.getPerDayRent(),
                t.getRefund(), t.getRentalEndDate(),t.getRentalStartDate(),
                t.getReturned(),t.getTotalAmount(),t.getRentalId()
         );
    }

    @Override
    public boolean delete(String id) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM RentalDetail WHERE RentalID=?",
                id);
    }

    @Override
    public RentalDetailEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM RentalDetail WHERE RentalID = ?", id);

        while (rst.next()) {
            RentalDetailEntity hireEntity = new RentalDetailEntity(rst.getString(1),
                    rst.getDouble(2),
                    rst.getDouble(3),
                   
            rst.getDouble(4),
                    rst.getDouble(5),
            rst.getDate(6),
            rst.getDate(7),
            rst.getBoolean(8),
            rst.getDouble(9),
             rst.getString(10),
            rst.getString(11));

            return hireEntity;
        }
        return null;
    }
    

    @Override
    public ArrayList<RentalDetailEntity> getAll() throws Exception {
         ArrayList<RentalDetailEntity> hireEntitys = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("Select * FROM RentalDetail");

        while (rst.next()) {
            RentalDetailEntity hireEntity = new RentalDetailEntity(rst.getString(1),
                 rst.getDouble(2),
                    rst.getDouble(3),
                   
            rst.getDouble(4),
                    rst.getDouble(5),
            rst.getDate(6),
            rst.getDate(7),
            rst.getBoolean(8),
            rst.getDouble(9),
             rst.getString(10),
            rst.getString(11));

            hireEntitys.add(hireEntity);
        }

        return hireEntitys;
    }

    @Override
    public boolean hasActiveHire(String custId) throws Exception {
        ResultSet resultSet = CrudUtil.executeQuery("SELECT COUNT(*) FROM RentalDetail WHERE CustId = ? AND Returned= false", custId);

        if (resultSet.next()) {
            int activeHireCount = resultSet.getInt(1);
            return activeHireCount > 0;
        }

        return false;
    }   

    @Override
    public boolean isCarAvailableForHire(String carId, Date rentDate, Date rentDate1) throws Exception {
       ResultSet resultSet = CrudUtil.executeQuery(
        "SELECT COUNT(*) FROM RentalDetail WHERE CarId = ? AND (RentalEndDate >= ? OR RentalStartDate <= ?) AND Returned = false",
        carId, rentDate, rentDate1);

    if (resultSet.next()) {
        int overlappingHireCount = resultSet.getInt(1);
        return overlappingHireCount == 0;
    }

    return false;
    

   
}}
