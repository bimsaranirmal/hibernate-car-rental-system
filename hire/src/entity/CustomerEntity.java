package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Customer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CustID", nullable = false)
    private String id;

    

    @Column(name = "CustName", length = 50, nullable = false)
    private String name;

    @Column(name = "nic",length = 12, nullable = false )
    private String nic;

    @Column(name = "CustAddress", length = 100)
    private String address;

    @Column(name = "contactNo", length = 10)
    private String contactNo;

}
