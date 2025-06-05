package com.programacion.distribuida.customers.clients;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8081")
@Path("/libros")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface BookClient {
    @GET
    @Path("/isbn/{isbn}")

    com.programacion.distribuida.customers.dto.LibroDTO buscarPorIsbn(@PathParam("isbn") String isbn);

    class LibroDTO {
        public String isbn;
        public String title;
        public Double price;
        public String authorName;
    }
}
