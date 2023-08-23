package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "review")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReviewEntity {
     @Id
    @Column(name = "id")
    private String id;

    @Column(name = "date")
    private Date date;

    @Column(name = "vehicleId")
    private String vehicleId;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerEntity customer;

    @Column(name = "statues")
    private String status;
}
