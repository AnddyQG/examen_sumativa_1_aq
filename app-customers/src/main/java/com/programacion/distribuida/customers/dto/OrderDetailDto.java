package com.programacion.distribuida.customers.dto;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDetailDto {
    public String customerName;
    public String customerEmail;
    public LocalDateTime placedon;

    public Double total;

    public static class ItemDto {
        public String isbn;
        public String title;
        public Double price;
        public String author;
        public Integer quantity;
    }
}
