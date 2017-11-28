package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    ArrayList<Book> catalog;

  public BookShop() {
      catalog = new ArrayList();
  }
  
  public BookShop(String filename) throws FileNotFoundException, IOException {
      this();
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      String tempTitle = "";
      String tempAuthor = "";
      Double tempPrice = 0.0;
      Integer tempYear = 0;
      String line;
      
      line = reader.readLine();
      while (line != null) {
          String[] book = line.split(",");
          tempTitle = book[0];
          tempAuthor = book[1];
          tempPrice = Double.parseDouble(book[2]);
          tempYear = Integer.parseInt(book[3]);
          Book tempBook = new Book (tempTitle, tempAuthor, tempPrice, tempYear);
          catalog.add(tempBook);
          line = reader.readLine();
      }
      
      
  }
  
  public BookShop(BookShop anotherBookShop) {
      this();
      //catalog = (ArrayList<Book>)anotherBookShop.catalog.clone();
      for (Book b: anotherBookShop.catalog) {
        Book a = new Book(b);
        this.catalog.add(a);

        
    }
  }
  
  public void addNewTitle(Book book) {
      catalog.add(book);
  }
  
  public int size() {
      return catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
      for (Book b: catalog) {
          b.price = b.price * (100 - discountPercent)/100;
      }
  }
  
  public void printCatalog() {
      for (Book b: catalog) {
          System.out.println(b);
      }
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalog, comp);
  }
  
  public ArrayList<Book> getCatalog() {
      return catalog;
  }

}
