package entity;


import java.util.Date;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "driver")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DriverEntity {
    @Id
    @Column(name = "driver_id", length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "address", length = 50)
    private String address;

    @Column(name = "licenseNo", length = 20)
    private String licenseNo;

    @Column(name = "contactNo", length = 20)
    private String contactNo;

    @Column(name = "salaryPerDay", length = 20)
    private Integer salaryPerDay;

     @CreationTimestamp
    @Column(name= "create_date", nullable = false)
    private Date createDate;

     @Column(nullable = false)
    private String type;

   

    
}
