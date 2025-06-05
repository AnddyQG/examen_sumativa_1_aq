package com.programacion.distribuida.customers.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
public class PurchaseOrderDto {
    //El detalle de una orde de compra en particular, el cual incluya: nombre del cliente, email del cliente,
    //fecha de compra, lista de libros comprados en la orden de compra (isbn, título, precio, nombre
    //autor)

    private String name;
    private String email;
    private String purchaseDate;
    private String bookIsbn;
    private String bookTitle;
    private String bookPrice;
    private String bookAuthor;

    private List<String> books;
}
