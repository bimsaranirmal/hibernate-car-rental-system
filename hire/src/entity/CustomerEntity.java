package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerEntity {
    @Id
    @Column(name = "id", length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "address", length = 50)
    private String address;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "contactNo", length = 20)
    private String contactNo;

    //Multi Valued Attribute
    @ElementCollection
    @CollectionTable(
        name = "customer_mobile",
        joinColumns = @JoinColumn(name = "customer_id")
    )
    private List<String> mobiles  = new ArrayList<>();;

     @CreationTimestamp
    @Column(name= "create_date", nullable = false)
    private Date createDate;

   
    
}

