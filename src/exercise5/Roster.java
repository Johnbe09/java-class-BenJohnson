package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9). Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author yasiro01
 */
public class Roster {
    private ArrayList<Student> roster = new ArrayList();
    
    public Roster(String filename) throws FileNotFoundException, IOException {
        // read contents of file into the roster
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        //Scanner lineContent = new Scanner(reader);
        String tempName = "";
        String tempMajor = "";
        double tempGpa = 0;
        String line;
        //while ((line = reader.readLine()) != null); {
        //while (lineContent.hasNext()) {
            //String attributes = lineContent.nextLine();
        line = reader.readLine();
        while (line != null) {
            String[] people = line.split(",");
             tempName = people[0];
             tempMajor = people[1];
             tempGpa = Double.parseDouble(people[2]);
            Student tempStudent = new Student(tempName, tempMajor, tempGpa);
            roster.add(tempStudent);
            line = reader.readLine();
        }
        
        
    }
    
    
    public void printRoster() {
        // student.toString(); repeatedly
        for (int i = 0; i < roster.size(); i++) {
            System.out.print(roster.get(i).toString() + "\n");
        }
            
    }
    
    
    
  
}
