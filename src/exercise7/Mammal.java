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
public class Mammal extends AnimalAbstract {
    private String furColor;

    public Mammal(String furColor, double bloodTemperature) {
        super(bloodTemperature);
        this.furColor = furColor;
    }

    @Override
    public void move() {
        System.out.println("Mammal jumped");
    }
    @Override
    public String toString() {
        return super.toString() + ", I'm a " + furColor + " mammal";
    }
    public void makeSound() {
        System.out.println("Meow");
    }

    
    
    
    
}
