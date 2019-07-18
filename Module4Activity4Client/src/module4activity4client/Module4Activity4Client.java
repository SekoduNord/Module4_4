/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4activity4client;

import com.fasterxml.jackson.xml.XmlMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Olivier
 */
public class Module4Activity4Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            System.out.println("Perform a call to GetBooks() and display the result");
            
            System.out.println();
            System.out.println("*************************************");
            System.out.println();
            
            Book[] booksBefore = new Book[getBooks().size()];
            for (int i = 0; i < getBooks().size(); i++) {
                booksBefore[i] = (Book) getBooks().get(i);
                printBook(booksBefore[i]);
            }
            
            System.out.println();
            System.out.println("*************************************");
            System.out.println();
            
            System.out.println("Perform a call to AddBook() and then a subsequent call to GetBooks() and display the result");
            
            Author a = new Author();
            a.setFn("New First Name");
            a.setLn("New Last Name");
            
            Book b = new Book();
            b.setId(0);
            b.setTitle("New Title");
            b.setAuthor(a);
            b.setPublisher("New Publisher");
            
            addBook(b);
            
            System.out.println();
            System.out.println("Perform a call to GetBooks() and display the result");
            
            System.out.println();
            System.out.println("*************************************");
            System.out.println();
            
            Book[] booksAfter = new Book[getBooks().size()];
            for (int i = 0; i < getBooks().size(); i++) {
                booksAfter[i] = (Book) getBooks().get(i);
                printBook(booksAfter[i]);
            }
            
            System.out.println();
            System.out.println("Read a xml file and add it to the list");
            
            File file = new File("book.xml");
            JAXBContext jaxBContext = JAXBContext.newInstance(Book.class);
            Unmarshaller unmarshaller = jaxBContext.createUnmarshaller();
            Book bb = (Book) unmarshaller.unmarshal(file);
            addBook(bb);
            
//            File file = new File("book.xml");
//            XmlMapper xmlMapper = new XmlMapper();
//            InputStream inputStream = new FileInputStream (file);
//            String xml = inputStream.toString();
//            Book bb = (Book) xmlMapper.readValue(xml, Book.class);
//            addBook(bb);
            
            System.out.println();
            System.out.println("*************************************");
            System.out.println();
            
            System.out.println();
            System.out.println("Perform a call to GetBooks() and display the result");
            
            System.out.println();
            System.out.println("*************************************");
            System.out.println();
            
            Book[] booksFinal = new Book[getBooks().size()];
            for (int i = 0; i < getBooks().size(); i++) {
                booksFinal[i] = (Book) getBooks().get(i);
                printBook(booksFinal[i]);
            }
            
            System.out.println();
            System.out.println("Application exit");
            System.out.println();
        } catch (JAXBException ex) {
            System.out.println("JAXB Conversion error : " + ex.getMessage());
        }
    }

    private static java.util.List<module4activity4client.Book> getBooks() {
        module4activity4client.BookWebService_Service service = new module4activity4client.BookWebService_Service();
        module4activity4client.BookWebService port = service.getBookWebServicePort();
        return port.getBooks();
    }

    private static String addBook(module4activity4client.Book book) {
        module4activity4client.BookWebService_Service service = new module4activity4client.BookWebService_Service();
        module4activity4client.BookWebService port = service.getBookWebServicePort();
        return port.addBook(book);
    }

    public static void printBook(Book b) {
        System.out.println("Id :\t" + b.getId());
        System.out.println("Title :\t" + b.getTitle());
        System.out.println("Publisher :\t" + b.getPublisher());
        System.out.println("Author :\t" + b.getAuthor().getFn() + " " + b.getAuthor().getLn());
    }

}
