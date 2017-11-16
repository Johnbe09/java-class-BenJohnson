/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author ben
 */
public class EmployeePractice {
    private String name;
    private String ssn;
    private double salary;
    private double rate;
    private double hours;
    private boolean isSalaried;

    public EmployeePractice(String name, String ssn, double salary, double rate, double hours, boolean isSalaried) {
        this.name = name;
        this.ssn = ssn;
        this.isSalaried = isSalaried;
        if (isSalaried) {
            this.salary = salary;
            this.rate = 0;
            this.hours = 0;
        } else {
            this.salary = 0;
            this.rate = rate;
            this.hours = hours;
        }
    } // possible to do this but better to do SUper and SUbclasses
    
    
    
    
    
    
}
