/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servs;

import com.fasterxml.jackson.xml.XmlMapper;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Olivier
 */
@XmlRootElement(name = "book")
public class Book implements Serializable, Comparable<Book>, Cloneable {

    private String title;
    private Author author;
    private String publisher;
    private int id;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Book o) {
        if (this.title == o.getTitle()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Book clone() {
        Book b = new Book();
        b.setTitle(this.getTitle());
        b.setAuthor(this.getAuthor());
        b.setPublisher(this.getPublisher());
        b.setId(this.getId());
        return b;
    }

    @Override
    public String toString() {
        String xml = "";
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xml = xmlMapper.writeValueAsString(this);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return xml;
    }
}
