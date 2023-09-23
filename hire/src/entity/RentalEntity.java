package entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "RentalDetail")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RentalEntity  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RentalID", nullable = false)
    private String rentalID;
    
    //@Column(name = "CustId", nullable = false)
    //private String id;

    //@Column(name = "CarID", nullable = false)
    //private String carID;
   
    
   
    
    @Column(name = "RentalStartDate", nullable = false)
    private Date rentalStartDate;

    @Column(name = "RentalEndDate", nullable = false)
    private Date rentalEndDate;

    @Column(name = "TotalAmount", nullable = false)
    private double totalAmount;

    @Column(name = "Balance")
    private double balance;

    @Column(name = "Refund")
    private double refund;

    @Column(name = "AdvancedPay")
    private double advancedPay;

    @Column(name = "perDayRent", nullable = false)
    private double perDayRent;

    @Column(name = "Returned")
    private boolean returned;

   @ManyToOne // Many rentals belong to one customer
    @JoinColumn(name = "CustId", referencedColumnName = "custId", nullable = false)
    private CustomerEntity customer;

    @ManyToOne // Many rentals belong to one customer
    @JoinColumn(name = "CarID", referencedColumnName = "carID", nullable = false)
    private CarEntity car;
}
