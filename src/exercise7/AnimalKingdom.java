/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

import java.util.ArrayList;

/**
 *
 * @author ben
 */
public class AnimalKingdom {
    
    
    public static void main(String[] args) {
        //AnimalAbstract a;  = new AnimalAbstract();
        Mammal m = new Mammal ("green", 100);
        Reptile r = new Reptile( 1000, 60);
        System.out.println("Mammal: " + m);
        System.out.println("Reptile: " + r);
        System.out.println("");
        ArrayList<AnimalAbstract> zoo = new ArrayList();
        
        zoo.add(m);
        zoo.add(r);
        for (AnimalAbstract animal: zoo) {  // never says make me a new type of abstract animal
            animal.move();
            animal.breathe();
            //animal.makeSound(); // can't do this because not all Abstract animals can make sounds, just mammals
            //System.out.println(animal);
        }
        System.out.println("");
        AnimalAbstract a = m;
        System.out.println(a);
        a = r;
        System.out.println(a);
        System.out.println("");
        System.out.println(m instanceof Mammal); // true because m is a mammal
        System.out.println(m instanceof AnimalAbstract); // true because m is a mmall and mammal is also an animal
        //System.out.println(m instanceof Reptile); lets you know if they are in the same class or a sub of a super, //false because mammal is not a reptile
        AnimalAbstract b;
        //System.out.println(b instranceof Mammal); false because 
        
    }
    
}
