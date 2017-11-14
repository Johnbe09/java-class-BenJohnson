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
public class Employee {
    protected String name;
    protected String ssn = "000-00-0000";
    protected double netPay;

    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    protected double getNetPay() {
        return netPay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    protected void setNetPay(double netPay) {
        this.netPay = netPay;
    }
    protected void printWeeklyCheck() {
        System.out.println(netPay/52);
    }
    
    
    
    
    
}
