package entity;

import java.sql.Date;

import javax.persistence.Column;
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
@Table(name = "rental")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RentalEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RentalID")
    private int rentalID;

    @ManyToOne
    @JoinColumn(name = "CarID")
    private CarEntity car;

    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private CustomerEntity customer;

    @Column(name = "RentalStartDate")
    private Date rentalStartDate;

    @Column(name = "RentalEndDate")
    private Date rentalEndDate;

    @Column(name = "TotalAmount")
    private double totalAmount;

    @Column(name = "Returned")
    private boolean returned;

   
}
