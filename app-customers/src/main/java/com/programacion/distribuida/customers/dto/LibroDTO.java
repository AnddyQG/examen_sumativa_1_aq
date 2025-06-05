package com.programacion.distribuida.customers.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class LibroDTO {

        public String isbn;
        public String title;
        public Double price;
        public String authorName;

}
