/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Entity;

/**
 *
 * @author BIMSARA
 */
public class CarCategoryEntity {

    private String id;
    private String categoryName;

    public CarCategoryEntity() {
    }

    public CarCategoryEntity(String id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "CarCategoryEntity{" + "id=" + id + ", categoryName=" + categoryName + '}';
    }

}
