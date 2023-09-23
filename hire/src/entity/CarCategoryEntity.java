package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "carCategory")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CarCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CategoryID", nullable = false)
    private String categoryID;

    @Column(name = "CategoryName", length = 50, nullable = false)
    private String categoryName;

   

    

    
}
