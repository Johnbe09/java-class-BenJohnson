package exercise11;

import java.util.Collection;
import java.util.Arrays;
/**
 * Exercise 11 logic
 * @author yasiro01
 */
public class Ex11Logic {
  
  /**
   * Task 1
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
  public <T> int strLen(T item) {
      String s = item.toString();
      return s.length();
      }
  
  /**
   * Task 2
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
  public <T extends Comparable> T greater(T item1, T item2, T item3) {
      T out = item1;
      if (item1.compareTo(item2) >= 0) {
          if (item1.compareTo(item3) >= 0) {
              out = item1;
          }
      } else {
          if (item2.compareTo(item3) >= 0) {
              out = item2;
          } else {
              out = item3;
          }
      } return out;
  }


  
  /**
   * Task 3
   * @param <T>
   * @param list of objects
   * print a list of items
   */
  public <T> void printList (T ... list) {
      for (T item: list) {
          System.out.print(item + " ");
          //System.out.println(item.toString());
  }

    }
  
  /**
   * Task 4
   * @param <T>
   * @param list of objects
   * @return the smallest item in the collection
   */
    public <T extends Comparable> T findMinItem(Collection<T> coll) {
        
        
        //T out = coll[0];
        
        //T[] arr1 = (T)coll.toArray();
        T out = (T)coll.toArray()[0];
       // T out = arr1[0];
        
        //T out = null;
        //int count = 0;
        
        for (T item: coll) {
            //count++;
            //out = coll(count);
            if (item.compareTo(out) < 0) {
                out = item;
            }
            
            
        }
        return out;
        

    }
}

  /**
   * Task 5
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
  // TODO: Implement class Foo
class Foo<T, U> {
    private T fuzz;
    private U buzz;

    public Foo(T fuzz, U buzz) {
        this.fuzz = fuzz;
        this.buzz = buzz;
    }

    public T getFuzz() {
        return fuzz;
    }

    public U getBuzz() {
        return buzz;
    }

    public void setFuzz(T fuzz) {
        this.fuzz = fuzz;
    }

    public void setBuzz(U buzz) {
        this.buzz = buzz;
    }

    @Override
    public String toString() {
        return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
    }
    
    
    
}


