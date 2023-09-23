/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Dao.Custom.Impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import pos.hire.Dao.CrudUtil;
import pos.hire.Dao.Custom.CarCategoryDao;
import pos.hire.Entity.CarCategoryEntity;

/**
 *
 * @author BIMSARA
 */
public class CarCategoryDaoImpl implements CarCategoryDao {

    @Override
    public boolean add(CarCategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO CarCategory VALUES ( ?, ?)",
                t.getId(), t.getCategoryName());

    }

    @Override
    public boolean update(CarCategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE CarCategory SET CategoryName =? WHERE CategoryID =?",
                t.getCategoryName(), t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM CarCategory WHERE CategoryID=?",
                id);
    }

    @Override
    public CarCategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM CarCategory WHERE CategoryID = ?", id);

        while (rst.next()) {
            CarCategoryEntity carCategoryEntity = new CarCategoryEntity(rst.getString(1),
                    rst.getString(2));

            return carCategoryEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CarCategoryEntity> getAll() throws Exception {
        ArrayList<CarCategoryEntity> carCategoryEntitys = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("Select * FROM CarCategory");

        while (rst.next()) {
            CarCategoryEntity carCategoryEntity = new CarCategoryEntity(rst.getString(1),
                    rst.getString(2));

            carCategoryEntitys.add(carCategoryEntity);
        }

        return carCategoryEntitys;
    }

}
