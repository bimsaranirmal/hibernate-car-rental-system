package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CarEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CarID", nullable = false)
    private Long carID;

   

    @Column(name = "VehicleNumber", length = 8, nullable = false)
    private String vehicleNumber;

    @Column(name = "Brand", nullable = false)
    private String brand;

   

    @Column(name = "Year", nullable = false)
    private String year;

     @Column(name = "PricePerDay", nullable = false)
    private Double PricePerDay;

    @Column(name = "Availability")
    private boolean availability;

    @ManyToOne // Many cars belong to one category
    @JoinColumn(name = "CategoryID", referencedColumnName = "CategoryID", nullable = false)
    private CarCategoryEntity carCategory;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<RentalEntity> rentals;
}
