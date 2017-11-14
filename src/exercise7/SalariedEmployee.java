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
public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(double salary, String name, String ssn) {
        super(name, ssn);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    @Override
    public double getNetPay() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void printWeeklyCheck () {
        double check = 0;
        check = salary/52;
        System.out.println(check);
    }
 
    
}
