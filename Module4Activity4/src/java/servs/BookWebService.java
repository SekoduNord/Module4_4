/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servs;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Olivier
 */
@WebService(serviceName = "BookWebService")
public class BookWebService {

    public BookWebService() {
    }


    
    @WebMethod(operationName = "GetBookInfo")
    public Book GetBookInfo(@WebParam(name = "id") int id) {
        //TODO return proper representation object
        BookRepo book = BookRepo.getInstance();

        return book.GetBookInfo(id).clone();
    }

    @WebMethod(operationName = "AddBook")
    public String addBook(@WebParam(name = "Book") Book b) {
        
        BookRepo book = BookRepo.getInstance();

        book.addBook(b);

        return "Book " + b.getId() + " added to the list";
    }

    @WebMethod(operationName = "GetBooks")
    public Book [] getBooks() {
        //TODO return proper representation object
        BookRepo book = BookRepo.getInstance();
        
        Book [] books = new Book [book.getBooks().size()];
        
        for (int i = 0; i < book.getBooks().size(); i++){
            books[i] = book.getBooks().get(i).clone();
        }

        return books;
    }
}
