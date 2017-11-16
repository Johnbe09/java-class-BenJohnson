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
public abstract class AnimalAbstract { // abstract means you can't make new objects of that class
    protected double bloodTemperature;
    
    public AnimalAbstract(double bloodTemperature) {
        this.bloodTemperature = bloodTemperature;
    }
    
    public void breathe() {
        System.out.println("Oxygen level icreased");
    }
    
    public abstract void move(); // abstract says that you can't create new objects of type ANimal
    
    
    
    @Override
    public String toString() {
        return "I'm an animal, my blood temperature is " + bloodTemperature;
    }
    
}
