package exercise5;

/**
 * Class Student
 * Task 9: Create a class Student with the following private data members: String name, String major, double gpa.
 * Implement setters for major and gpa
 * @author yasiro01
 */
public class Student {
    private String name;
    private String major;
    private double gpa;
    public Student(String name, String Major, double gpa) {
        this.name = name;
        this.major = Major;
        this.gpa = gpa;
                
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String newMajor) {
        this.major = newMajor;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return String.format("%s is majoring in %s with a GPA of %.1f", name, major, gpa);
    }
  
}
