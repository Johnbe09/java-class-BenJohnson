package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.github.javafaker.Faker;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author yasiro01
 * @assignment Exercise 3
 */
public class Ex3Driver {
  public static final String PATH = "data/";
  /**
   * main application function
   * @param args 
   */
  public static void main(String[] args) {
    int[][] matrix1 = null;
    int[][] matrix2 = null;
    int[][] result = null;
    try {
      matrix1 = readFile(PATH + "matrix1.txt");
      matrix2 = readFile(PATH + "matrix2.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    } catch (IOException ex) {
        
    }
    System.out.println("Matrix 1");
    printMatrix(matrix1);
    System.out.println("Matrix 2");
    printMatrix(matrix2);
    if (matrix1[0].length == matrix2.length) {
      result = multiply(matrix1, matrix2);
    } else {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, "{0}", "Impossible to multiply matrices");
      System.exit(0);
    }
    System.out.println("Result");
    printMatrix(result);
    try {
      writeMatrix(result, PATH + "result.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    catch (IOException ex) {
        
    }
  }
  /**
   * Print a matrix
   * @param matrix to print
   */
  public static void printMatrix(int[][] matrix) {
    for (int[] row: matrix) {
      for (int item: row) {
        System.out.printf("%5d", item);
      }
      System.out.printf("%n");
    }
  }
  /**
   * Write a matrix to the file
   * @param matrix 
   * @param filename 
   * @throws java.io.FileNotFoundException 
   */
  public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException, IOException {
    //throw new UnsupportedOperationException();
    // help from FileIO.java
    // buffered writer or print writer????
    // if buffer...
    BufferedWriter outputFile = new BufferedWriter(new FileWriter(filename));
    
    for (int i = 0; i < matrix.length; ++i) {
      for (int j = 0; j < matrix[0].length; ++j) {
          outputFile.write(matrix[i][j]);
          // j first or i first in the above line?
      }
      
  }
    outputFile.close();
  }
  /**
   * Read a matrix from a file
   * @param filename
   * @return matrix read from a file
   * @throws java.io.FileNotFoundException
   */
  public static int[][] readFile(String filename) throws FileNotFoundException, IOException {
    /*
    10. Open the input file and create a Scanner object to read its content
    20. Read two values (rows and columns) from the first line, if possible
    30. Create a new 2-D array
    40. Read data from the file, one line at a time, using the Scanner object
    50. Split each line into individual tokens and put them into your array
    60. Return the array
    */
    // help from Austin and Will
    File file = new File(filename);
    BufferedReader reader = new BufferedReader(new FileReader(file)); 

    Scanner lineContent = new Scanner(reader);
    String dimensions = lineContent.nextLine();
    System.out.println(dimensions);
    String[] dimensionList = dimensions.split("\\s+");
    int length = Integer.parseInt(dimensionList[0]);
    int height = Integer.parseInt(dimensionList[1]); 

    int[][] result = new int[length][height];
    
    for (int i = 0; i < length; i++) {
        String[] matrixList = null;
        String thisLine = lineContent.nextLine();
        matrixList = thisLine.split("\\s+");
        for (int j = 0; j < height; j++) {
            result[i][j] = Integer.parseInt(matrixList[j]);
        }
        
    }
  
      
  
    
  
    
       return result; 
    }
    
  /**
   * Multiply two matrices
   * @param matrix1
   * @param matrix2
   * @return the resulting matrix
   */
  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
    int m1Rows = matrix1.length;
    int m2Rows = matrix2.length;
    int m1Col = matrix1[0].length;
    int m2Col = matrix2[0].length;
    int[][] result = new int[m1Rows][m2Col];
    if (m1Col != m2Rows) {
        throw new IllegalArgumentException("These matrices cannot be multiplied because the columns of the first matrix don't equal the rows of the second matrix");
    // help from stack overflow
    }
    int temporary = 0;
    for (int j = 0; j < m1Rows; j++) {   // changed row to col
        for (int i = 0; i < m2Col; i++) { // changed Col to Rows
            for (int l = 0; l < m2Rows; l++) { // changed Col to Rows // changed 1 to 2
                /*
            System.out.println();
            System.out.println("I = " + i);
            System.out.println("J = " + j);
            System.out.println("L = " + l);
            System.out.println(matrix1[j][l]);
            System.out.println("matrix2");
            System.out.println(matrix2.length); // = 4 // m2Rows
            System.out.println(matrix2[0].length);
            System.out.println(matrix2[l][i]); // matrix2[0][1] doesn't exist
            System.out.println("Temporary");
            */
            
            temporary = matrix1[j][l] * matrix2[l][i];
           // System.out.println(temporary);
           // System.out.println();

            result[j][i] = result[j][i] + temporary;
            /*
            System.out.println();
            System.out.println(i);
            System.out.println(j);
            System.out.println(l);
            System.out.println();
*/
            }
        }
    }
    return result;

  }
  // Path issues
  // buffered writer or print writer??
}
