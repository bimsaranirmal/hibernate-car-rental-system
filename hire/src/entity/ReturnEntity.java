package entity;

import java.math.BigDecimal;
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
@Table(name = "return")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReturnEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "reviewId")
    private ReviewEntity review;

    @Column(name = "returnDate")
    private Date returnDate;

    @Column(name = "additionalDistance")
    private Integer additionalDistance;

    @Column(name = "damageCost")
    private BigDecimal damageCost;

    @Column(name = "total")
    private BigDecimal total;
}
