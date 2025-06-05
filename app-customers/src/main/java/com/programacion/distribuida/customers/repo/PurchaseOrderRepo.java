package com.programacion.distribuida.customers.repo;


import com.programacion.distribuida.customers.db.PurchaseOrder;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.List;

public class PurchaseOrderRepo implements PanacheRepositoryBase<PurchaseOrder,Integer> {
    public PurchaseOrder findById(Integer id) {

        return findById(id);
    }

    public List<PurchaseOrder> list(String s, Integer id) {

        return list(s, id);
    }


}
