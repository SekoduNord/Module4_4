
package module4activity4client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookWebService", targetNamespace = "http://servs/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookWebService {


    /**
     * 
     * @param book
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AddBook")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AddBook", targetNamespace = "http://servs/", className = "module4activity4client.AddBook")
    @ResponseWrapper(localName = "AddBookResponse", targetNamespace = "http://servs/", className = "module4activity4client.AddBookResponse")
    @Action(input = "http://servs/BookWebService/AddBookRequest", output = "http://servs/BookWebService/AddBookResponse")
    public String addBook(
        @WebParam(name = "Book", targetNamespace = "")
        Book book);

    /**
     * 
     * @return
     *     returns java.util.List<module4activity4client.Book>
     */
    @WebMethod(operationName = "GetBooks")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetBooks", targetNamespace = "http://servs/", className = "module4activity4client.GetBooks")
    @ResponseWrapper(localName = "GetBooksResponse", targetNamespace = "http://servs/", className = "module4activity4client.GetBooksResponse")
    @Action(input = "http://servs/BookWebService/GetBooksRequest", output = "http://servs/BookWebService/GetBooksResponse")
    public List<Book> getBooks();

    /**
     * 
     * @param id
     * @return
     *     returns module4activity4client.Book
     */
    @WebMethod(operationName = "GetBookInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetBookInfo", targetNamespace = "http://servs/", className = "module4activity4client.GetBookInfo")
    @ResponseWrapper(localName = "GetBookInfoResponse", targetNamespace = "http://servs/", className = "module4activity4client.GetBookInfoResponse")
    @Action(input = "http://servs/BookWebService/GetBookInfoRequest", output = "http://servs/BookWebService/GetBookInfoResponse")
    public Book getBookInfo(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
