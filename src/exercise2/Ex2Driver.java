package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yasiro01
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    nheads(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6(); // how do you
    task7();
    System.out.println(task8(numberLst, 75));
    task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row. Seed the randomizer in the main() function.
   * @param n
   */
  public static void nheads(int n) {
    Random coin = new Random();
    coin.setSeed(252);
    int streak = 0;
    while (streak < n) {
        int flip = coin.nextInt(2);
        if (flip == 1) {
            streak = streak + 1;
            System.out.println("heads");
        } else {
            streak = 0;
            System.out.println("tails");
        }
    
    }
System.out.println();
    
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
    boolean larger = true;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= n){
            larger = false;
        }
        // go through arr and see if n is larger than every element
    }
    return larger;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
      System.out.println();
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < threshold){
            count++;
        }
        // go through arr and see if n is larger than every element
    }
    return count;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
    System.out.println();
    int largest = -1000;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }
    int diff = 100 - largest;
    for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] + diff;
    } 
 
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
    System.out.println();
    int numA = 0;
    int numB = 0;
    int numC = 0;
    int numD = 0;
    int numF = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 60) {
            numF = numF + 1;
        } else if (arr[i] < 70) {
            numD = numD + 1;
        }else if (arr[i] < 80) {
            numC = numC + 1;
        } else if (arr[i] < 90) {
            numB = numB + 1;
        } else if (arr[i] < 110) {
            numA = numA + 1;
        }
        }
    System.out.printf("%1d students had A's%n", numA);
    System.out.printf("%1d students had B's%n", numB);
    System.out.printf("%1d students had C's%n", numC);
    System.out.printf("%1d students had D's%n", numD);
    System.out.printf("%1d students had F's%n", numF);
    System.out.println();
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    ArrayList<Double> arr = new ArrayList();
    Scanner keyboard = new Scanner(System.in);
    double newNum = 0.0;
    System.out.printf("Enter a number to add (enter 0 to stop)%n");
    newNum = keyboard.nextDouble();
    while (newNum != 0) {
            arr.add(newNum);
            System.out.printf("Enter a number to add (enter 0 to stop)%n");
            newNum = keyboard.nextDouble();  
        } 
    for (int i = 0; i < arr.size(); ++i) {
        System.out.println(arr.get(i));
    }
    System.out.println();
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    Random rand = new Random();
    ArrayList<Integer> integers = new ArrayList();
    for (int i = 0; i < 10; i++) {
        int newNum = rand.nextInt(50) + 50;
        integers.add(newNum);
    }
    System.out.println(integers);
    System.out.println();
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    System.out.println();
    int lower = 0;
    for (int i = 0; i < arrLst.size(); i++) {
        if (arrLst.get(i) < 75) {
            lower = lower + 1;
        }
    }
    return lower;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    System.out.println();
    int[][] matrix = new int[10][10];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[i][j] = (i + 1) * (j + 1);
            //System.out.printf("%-4d", matrix[i][j]);
        }
        //System.out.println();
    }
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.printf("%-4d", matrix[i][j]);
        }
        System.out.println();
    }
    return matrix;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
    System.out.println();
    int time = 0;
    for (int i = 0; i < matrix.length; i++) {
        int sum = 0;
        time = time + 1;
        for (int j = 0; j < matrix[0].length; j++) {
            sum = sum +matrix[i][j];
        }
        System.out.printf("Row %2d sums to%4d%n", time, sum);
            
            
            
        }
    int time2 = 0;
    for (int i = 0; i < matrix.length; i++) {
        int sum = 0;
        time2 = time2 + 1;
        for (int j = 0; j < matrix[0].length; j++) {
            sum = sum +matrix[j][i];


    }
    System.out.printf("Column %2d sums to%4d%n", time2, sum);

}
  }
}
    
