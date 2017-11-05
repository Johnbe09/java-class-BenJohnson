package exercise4;
import java.util.*;
/**
 * @author yasiro01
 */
public class Ex4Driver {
  /* Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task1(Integer n) {
      // take an integer and return the integer + 1
      return n + 1;
  }
    
  /* Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task2(String s) {
      //takes a string and returns the length of the string
      int n = 0;
      n = s.length();
      return n;
  }
  /* Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task3(Character c) {
      // takes a character and returns the number 3
      int n = 3;
      return n;
  }
  
 /* Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity. */
  public Character task4(String s) {
      // takes a string and returns the first character
    Character c = null;
    c = s.charAt(0);
    return c;
      
  }
    
  /* Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task5(Integer x, Integer y)  {
      // takes two integers and returns the sum
      int z = x + y;
return z;
        }
  /* Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity. */
  public Character task6(String x, Integer y) {
     // takes a string and integer and returns character at the yth position
      Character c = 'B';
      c = x.charAt(y);
      return c;
  }
  /* Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task7(Integer[] a) {
     // takes an array of integers and returns the first integer in the array
      int i = 0;
      i = a[0];
      return i;
  }
  /* Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity. */
  public Boolean task8(Integer[] a, Integer i) {
      // takes an array of integers and an integer and returns true if the integer is the same as the length of the array; false otherwise
      boolean b = false;
      int length = a.length;
      if (i == length) {
         b = true;
      }
      return b;
  }
  /* Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task9(ArrayList<String> s) {
      // takes a arraylist of strings and returns the size of the list
      int i = 0;
      i = s.size();
      return i;
  }
  /* Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
  public Integer task10(HashMap<String, Integer> h) {
      // takes a hashmap as a parameter and returns 0
      int i = 0;
      return i;
  }
}
