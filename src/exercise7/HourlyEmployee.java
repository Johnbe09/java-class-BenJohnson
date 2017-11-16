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
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;

    public HourlyEmployee(double wageRate, double hours, String name, String ssn) {
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    
    @Override
    public double getNetPay() {
        netPay = hours * wageRate;
        return netPay;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    @Override
    public void printWeeklyCheck() {
        double check = 0;
        check = hours * wageRate;
        System.out.println(check);
    }
    
    
    
}
