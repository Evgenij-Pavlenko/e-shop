package oa.pavlenko.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "ORDER")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "id_order")
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "ORDER_PRODUCT",
            joinColumns = @JoinColumn(name = "id_order"),
            inverseJoinColumns = @JoinColumn(name = "id_product")
    )
    private List<Goods> productList;

    @Column(name = "timestamp")
    private Timestamp timestamp;

//    @Column(name = "timestamp_pay")
//    private Timestamp timestampPay;
}
