/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Entity;

import java.util.Date;

/**
 *
 * @author BIMSARA
 */
public class RentalDetailEntity {
     private String rentalId;
      private Double AdvancedPay;
      private Double Balance;
      
      private Double PerDayRent;
      private Double Refund;
      private Date RentalEndDate;
      private Date RentalStartDate;
      private Boolean Returned;
      private Double TotalAmount;
      private String carId;
      private String custId;

    public RentalDetailEntity() {
    }

    public RentalDetailEntity(String rentalId, Double AdvancedPay, Double Balance, Double PerDayRent, Double Refund, Date RentalEndDate, Date RentalStartDate, Boolean Returned, Double TotalAmount, String carId, String custId) {
        this.rentalId = rentalId;
        this.AdvancedPay = AdvancedPay;
        this.Balance = Balance;
        this.PerDayRent = PerDayRent;
        this.Refund = Refund;
        this.RentalEndDate = RentalEndDate;
        this.RentalStartDate = RentalStartDate;
        this.Returned = Returned;
        this.TotalAmount = TotalAmount;
        this.carId = carId;
        this.custId = custId;
    }

    /**
     * @return the rentalId
     */
    public String getRentalId() {
        return rentalId;
    }

    /**
     * @param rentalId the rentalId to set
     */
    public void setRentalId(String rentalId) {
        this.rentalId = rentalId;
    }

    /**
     * @return the AdvancedPay
     */
    public Double getAdvancedPay() {
        return AdvancedPay;
    }

    /**
     * @param AdvancedPay the AdvancedPay to set
     */
    public void setAdvancedPay(Double AdvancedPay) {
        this.AdvancedPay = AdvancedPay;
    }

    /**
     * @return the Balance
     */
    public Double getBalance() {
        return Balance;
    }

    /**
     * @param Balance the Balance to set
     */
    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }

    /**
     * @return the PerDayRent
     */
    public Double getPerDayRent() {
        return PerDayRent;
    }

    /**
     * @param PerDayRent the PerDayRent to set
     */
    public void setPerDayRent(Double PerDayRent) {
        this.PerDayRent = PerDayRent;
    }

    /**
     * @return the Refund
     */
    public Double getRefund() {
        return Refund;
    }

    /**
     * @param Refund the Refund to set
     */
    public void setRefund(Double Refund) {
        this.Refund = Refund;
    }

    /**
     * @return the RentalEndDate
     */
    public Date getRentalEndDate() {
        return RentalEndDate;
    }

    /**
     * @param RentalEndDate the RentalEndDate to set
     */
    public void setRentalEndDate(Date RentalEndDate) {
        this.RentalEndDate = RentalEndDate;
    }

    /**
     * @return the RentalStartDate
     */
    public Date getRentalStartDate() {
        return RentalStartDate;
    }

    /**
     * @param RentalStartDate the RentalStartDate to set
     */
    public void setRentalStartDate(Date RentalStartDate) {
        this.RentalStartDate = RentalStartDate;
    }

    /**
     * @return the Returned
     */
    public Boolean getReturned() {
        return Returned;
    }

    /**
     * @param Returned the Returned to set
     */
    public void setReturned(Boolean Returned) {
        this.Returned = Returned;
    }

    /**
     * @return the TotalAmount
     */
    public Double getTotalAmount() {
        return TotalAmount;
    }

    /**
     * @param TotalAmount the TotalAmount to set
     */
    public void setTotalAmount(Double TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * @return the carId
     */
    public String getCarId() {
        return carId;
    }

    /**
     * @param carId the carId to set
     */
    public void setCarId(String carId) {
        this.carId = carId;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "RentalDetailEntity{" + "rentalId=" + rentalId + ", AdvancedPay=" + AdvancedPay + ", Balance=" + Balance + ", PerDayRent=" + PerDayRent + ", Refund=" + Refund + ", RentalEndDate=" + RentalEndDate + ", RentalStartDate=" + RentalStartDate + ", Returned=" + Returned + ", TotalAmount=" + TotalAmount + ", carId=" + carId + ", custId=" + custId + '}';
    }

     
}
