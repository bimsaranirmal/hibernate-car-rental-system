/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Dto;

/**
 *
 * @author BIMSARA
 */
public class CarCategoryDto {

    private String id;
    private String categoryName;

    public CarCategoryDto() {
    }

    public CarCategoryDto(String id, String categoryName) {
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
        return "CarCategoryDto{" + "id=" + id + ", categoryName=" + categoryName + '}';
    }

}
