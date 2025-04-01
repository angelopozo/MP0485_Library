package main;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Angelo
 */
public class Book {
    protected String isbn;
    protected String title;
    protected ArrayList<String> authors = new ArrayList<>();
    protected double price;
    protected int stock;

    public Book(String isbn, String title, double price, int stock) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public void addAuthor(String author) {
        this.authors.add(author);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return Objects.equals(this.title, other.title);
    }

    @Override
    public String toString() {
        return isbn+";"+title+";"+price+";"+stock+";";
    }
    
    
    
}
