/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Olivier
 */
public class BookRepo {

    private static BookRepo instance = null;
    private static ConcurrentHashMap<Integer, Book> books = new ConcurrentHashMap<>();
    private AtomicInteger ai;

    public BookRepo() {
        ai = new AtomicInteger();
    }

    public static BookRepo getInstance() {
        if (instance == null) {
            instance = new BookRepo();
            return instance;
        } else {
            return instance;
        }
    }

    public void addBook(Book b) {

        b.setId(ai.addAndGet(1));
        books.put(b.getId(), b.clone());
    }

    public List<Book> getBooks() {

        /**
         *
         *
         *
         */
        ArrayList<Book> result = new ArrayList(books.values());
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i).clone());
        }

        Collections.sort(result, (Book b2, Book b1) -> b1.getTitle().compareTo(b2.getTitle()));

        return result;
    }
    
    public Book GetBookInfo(int id){
        return books.get(id);
    }
}
