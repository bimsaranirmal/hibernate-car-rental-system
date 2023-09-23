/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Entity;

/**
 *
 * @author BIMSARA
 */
public class CarEntity {

    private String id;
    
    private Double pricePerDay;
    private Boolean availability;
    private String brand;
    
    private String vehicleNumber;
    private String year;
    private String categoryid;

    public CarEntity() {
    }

    public CarEntity(String id, Double pricePerDay, Boolean availability, String brand, String vehicleNumber, String year, String categoryid) {
        this.id = id;
        this.pricePerDay = pricePerDay;
        this.availability = availability;
        this.brand = brand;
        this.vehicleNumber = vehicleNumber;
        this.year = year;
        this.categoryid = categoryid;
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
     * @return the pricePerDay
     */
    public Double getPricePerDay() {
        return pricePerDay;
    }

    /**
     * @param pricePerDay the pricePerDay to set
     */
    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    /**
     * @return the availability
     */
    public Boolean getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the vehicleNumber
     */
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    /**
     * @param vehicleNumber the vehicleNumber to set
     */
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the categoryid
     */
    public String getCategoryid() {
        return categoryid;
    }

    /**
     * @param categoryid the categoryid to set
     */
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    @Override
    public String toString() {
        return "CarEntity{" + "id=" + id + ", pricePerDay=" + pricePerDay + ", availability=" + availability + ", brand=" + brand + ", vehicleNumber=" + vehicleNumber + ", year=" + year + ", categoryid=" + categoryid + '}';
    }

    
}
