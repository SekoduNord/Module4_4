
package module4activity4client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the module4activity4client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBookInfoResponse_QNAME = new QName("http://servs/", "GetBookInfoResponse");
    private final static QName _GetBooksResponse_QNAME = new QName("http://servs/", "GetBooksResponse");
    private final static QName _AddBookResponse_QNAME = new QName("http://servs/", "AddBookResponse");
    private final static QName _Book_QNAME = new QName("http://servs/", "book");
    private final static QName _GetBookInfo_QNAME = new QName("http://servs/", "GetBookInfo");
    private final static QName _Author_QNAME = new QName("http://servs/", "author");
    private final static QName _GetBooks_QNAME = new QName("http://servs/", "GetBooks");
    private final static QName _AddBook_QNAME = new QName("http://servs/", "AddBook");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: module4activity4client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link GetBooks }
     * 
     */
    public GetBooks createGetBooks() {
        return new GetBooks();
    }

    /**
     * Create an instance of {@link GetBookInfo }
     * 
     */
    public GetBookInfo createGetBookInfo() {
        return new GetBookInfo();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link GetBooksResponse }
     * 
     */
    public GetBooksResponse createGetBooksResponse() {
        return new GetBooksResponse();
    }

    /**
     * Create an instance of {@link GetBookInfoResponse }
     * 
     */
    public GetBookInfoResponse createGetBookInfoResponse() {
        return new GetBookInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servs/", name = "GetBookInfoResponse")
    public JAXBElement<GetBookInfoResponse> createGetBookInfoResponse(GetBookInfoResponse value) {
        return new JAXBElement<GetBookInfoResponse>(_GetBookInfoResponse_QNAME, GetBookInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servs/", name = "GetBooksResponse")
    public JAXBElement<GetBooksResponse> createGetBooksResponse(GetBooksResponse value) {
        return new JAXBElement<GetBooksResponse>(_GetBooksResponse_QNAME, GetBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servs/", name = "AddBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servs/", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servs/", name = "GetBookInfo")
    public JAXBElement<GetBookInfo> createGetBookInfo(GetBookInfo value) {
        return new JAXBElement<GetBookInfo>(_GetBookInfo_QNAME, GetBookInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servs/", name = "author")
    public JAXBElement<Author> createAuthor(Author value) {
        return new JAXBElement<Author>(_Author_QNAME, Author.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servs/", name = "GetBooks")
    public JAXBElement<GetBooks> createGetBooks(GetBooks value) {
        return new JAXBElement<GetBooks>(_GetBooks_QNAME, GetBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servs/", name = "AddBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

}
