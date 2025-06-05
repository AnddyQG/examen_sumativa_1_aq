package com.programacion.distribuida.customers.db;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class CustomerPurchaseorderId {
    @Column(name = "customers_id")
    private Integer customerId;
    @Column(name = "purchaseorders_id")
    private Integer purchaseorderId;
}
