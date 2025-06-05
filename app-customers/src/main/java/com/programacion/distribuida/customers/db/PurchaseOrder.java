package com.programacion.distribuida.customers.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime deliveredor;
    private LocalDateTime placedon;
    private Integer status;
    private Integer total;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    public Customer customer;

    @OneToMany(mappedBy = "order")
    public List<Lineitem> items;


}
