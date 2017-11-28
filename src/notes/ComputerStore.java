/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ben
 */
interface Computer { // this should be private
    String os = "";
    
    public abstract void turnOn();
    public abstract void turnOff();
    

    }
class A {}
    
class ComputerLaptop extends A implements Computer, Comparable {
    String os;
    Double screen;
    Double weight;
    Integer memory;

    public ComputerLaptop(String os, Double screen, Double weight, Integer memory) {
        this.screen = screen;
        this.weight = weight;
        this.memory = memory;
        this.os = os;
    }
    

    @Override
    public void turnOn() {
        System.out.println("ON");    
    }

    @Override
    public void turnOff() {
        System.out.println("OFF");   
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof ComputerLaptop) {
            ComputerLaptop cl = (ComputerLaptop)o;
            return this.screen.compareTo(cl.screen);
        }
        return -1;
    }
    
//    @Override
//    public String toString() {
//        return os + " " + screen;
//    }

    @Override
    public String toString() {
        return "ComputerLaptop{" + "os=" + os + ", screen=" + screen + ", weight=" + weight + ", memory=" + memory + '}';
    }
    
}

public class ComputerStore { // this should be the public one
    ArrayList<ComputerLaptop> inventory;
    
    public ComputerStore() {
        inventory = new ArrayList();
    }
    public ComputerStore(ComputerLaptop cl) {
        this();
        inventory.add(cl);
    }
    public ComputerStore(ComputerStore anotherStore) {
        this();
        inventory = (ArrayList<ComputerLaptop>)anotherStore.inventory.clone();
    }
    
    public void addNewLaptop(ComputerLaptop cl) {
        inventory.add(cl);
    }
    
    public void printAll() {
        for (ComputerLaptop cl: inventory) {
            System.out.println(cl);
        }
    }
    public void sort() {
        Collections.sort(inventory);
    }
    
    public void sortMyStore(Comparator comp) {
        Collections.sort(inventory, comp);
    }
}

class ByOS implements Comparator<ComputerLaptop> {

    @Override
    public int compare(ComputerLaptop o1, ComputerLaptop o2) {
        return o1.os.compareTo(o2.os);
    }
    
}
class ByMemory implements Comparator<ComputerLaptop> {

    @Override
    public int compare(ComputerLaptop o1, ComputerLaptop o2) {
        return o1.memory.compareTo(o2.memory);
    }
    
}