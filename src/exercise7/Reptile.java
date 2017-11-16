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
public class Reptile extends AnimalAbstract { // Repitle doesn't work because you need to iplement method move or make the class abstract
    private int eggs;

    public Reptile(int eggs, double bloodTemperature) {
        super(bloodTemperature);
        this.eggs = eggs;
    }

    @Override
    public void move() {
        System.out.println("Reptile moved 5 steps");
    }
    @Override
    public void breathe() {
        System.out.println("Reptile just used its lungs");
    }

    
    
    
}
