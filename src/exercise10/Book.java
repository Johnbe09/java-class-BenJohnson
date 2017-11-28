package exercise10;

import java.util.Comparator;
import java.util.Objects;


/**
 * Class Book
 * @author yasiro01
 */

public class Book {
    final String title;
    final String author;
    Double price;
    final Integer year;

    public Book(String title, String author, Double price, Integer year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    
    public Book(Book b) {
        this.title =  b.title;
        this.author = b.author;
        this.price = b.price;
        this.year = b.year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.title);
        hash = 29 * hash + Objects.hashCode(this.author);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 29 * hash + this.year;
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
        if (!Objects.equals(this.year, other.year)) { // switch this to look like the other statments
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return title + " (" + year + ") by " + author + " costs $" + price;
        return String.format("%s (%d) by %s costs $%.2f", title, year, author, price);
    }
    
    
    
    
}

class ByTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }

}

class ByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.author.compareTo(o2.author);
    }
}

class ByPrice implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.price.compareTo(o2.price);
    }
}

class ByYear implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.year.compareTo(o2.year);
    }
}
