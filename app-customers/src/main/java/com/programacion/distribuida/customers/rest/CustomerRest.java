package com.programacion.distribuida.customers.rest;


import com.programacion.distribuida.customers.db.PurchaseOrder;
import com.programacion.distribuida.customers.repo.CustomerRepo;
import com.programacion.distribuida.customers.repo.PurchaseOrderRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
@Transactional
public class CustomerRest {
    @Inject
    CustomerRepo customerRepository;


    @Inject
    PurchaseOrderRepo orderRepo;

    @GET
    @Path("/cliente/{id}")
    public List<PurchaseOrder> listarPorCliente(@PathParam("id") Integer id) {
        return orderRepo.list("customer.id", id);
    }

    @GET
    @Path("/{id}")
    public PurchaseOrder buscarPorId(@PathParam("id") Integer id) {
        return orderRepo.findById(id);
    }



}
