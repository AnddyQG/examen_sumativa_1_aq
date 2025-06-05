package com.programacion.distribuida.customers.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customer_purchaseorders")
@Getter
@Setter
public class CustomerPurchaseorde {
    @EmbeddedId
    private CustomerPurchaseorderId id;

    @ManyToOne
    @MapsId("customerId")
    @Column(name = "customers_id", nullable = false)
    private Customer customer;
}
