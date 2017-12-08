/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13;

import java.util.HashMap;

/**
 *
 * @author ben
 */
public class TestQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("question 1");
//        Integer int = 22;
//        int++;
//        System.out.println(int);
//        // result = syntax error
//        System.out.println("");
        System.out.println("question 2");
        System.out.println("Conditions");
        int x = (int) 2.2;
        if (x == 2) {
            System.out.println("round down");
        } else {
            System.out.println("round up");
        }
        // result = round down
        System.out.println("");
        System.out.println("question 3");
        System.out.println("loops");
        int[] arr =  {1, 2, 3, 4};
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i] + " ");
        }
        // result = 1 2 
        System.out.println("");
        System.out.println("");
        System.out.println("question 4");
        System.out.println("collections");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Ben");
        map.put(1, "Will");
        map.put(2, "Austin");
        map.put(3, "Anna");
        System.out.println(map.get(1));
        // output: Will
        System.out.println("");
        System.out.println("question 5");
        System.out.println("Functions");
        int i = 4;
        System.out.println(moreThanFour(i));
        // output: false
        System.out.println("");
        System.out.println("question 6");
        System.out.println("encapsulation");
        basketball b = new basketball("Wilson", 10);
        // question: write code to bounce the ball until it pops
        while (b.getBounces() > 0) { // this loop is the answer to the question
            b.bounce();
        }
        System.out.println("");
        System.out.println("quesion 7");
        System.out.println("inheritance");
        shortBus s = new shortBus(5, 15, "yellow");
        s.kidsOn(6);
        s.handiKidsOn(3);
        // how many spots are available
        System.out.println(s.totalAvailable());
        // result = 11
        System.out.println("");
        System.out.println("question 8");
        System.out.println("interfaces");
        apple ap = new apple("Red");
        ap.bite();
        // what will the output be?
        // output = yum
        System.out.println("");
        System.out.println("question 9");
        System.out.println("generics");
        generic g = new generic();
        int k = 252;
        System.out.println(g.getString(i));
        System.out.println("");
        System.out.println("question 10");
        System.out.println("data structures");
        // we didn't learn data structures
        int c = 3, d = 3;
        if (++c == d++) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        // what is the output?
        // output = D
                
        
    }
    public static boolean moreThanFour(int i) {
        if (i > 4) {
            return true;
        } else {
            return false;
        }
        }
    
    
    
    
}
class basketball {
        private final String brand;
        private int bounces;

        public basketball(String brand, int bounces) {
            this.brand = brand;
            this.bounces = bounces;
        }

        public String getBrand() {
            return brand;
        }

        public int getBounces() {
            return bounces;
        }
        
        public void bounce() {
            if (bounces > 0) {
                bounces--;
                if (bounces > 0) {
                    System.out.println("ball bounced");
                } else {
                    System.out.println("ball popped");
                }
            } else {
                System.out.println("ball is popped");
            }
            
        }

        @Override
        public String toString() {
            return brand + " basketball has " + bounces + " remaining";
        }
     
    }
class bus {
    protected int capacity;
    protected String color;
    protected int occupied;

    public bus(int capacity, String color) {
        this.capacity = capacity;
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int moreRoom() {
        return capacity - occupied;
    }
    
    public void kidsOn(int i) {
        occupied = occupied + i;
    }
    
    public void kidsOff(int i) {
        occupied = occupied - i;
    }
    public int getOccupied() {
        return occupied;
    }
    public void empty() {
        occupied = 0;
    }
    public void openDoor() {
        System.out.println("Door opened");
    }
    public void closeDoor() {
        System.out.println("Door closed");
    }
    
}
class shortBus extends bus {
    private int handiCapacity;
    private int handiOccupied;

    public shortBus(int handiCapacity, int capacity, String color) {
        super(capacity, color);
        this.handiCapacity = handiCapacity;
    }

    public int getHandiCapacity() {
        return handiCapacity;
    }

    public void setHandiCapacity(int handiCapacity) {
        this.handiCapacity = handiCapacity;
    }

    public int getHandiOccupied() {
        return handiOccupied;
    }

    public void setHandiOccupied(int handiOccupied) {
        this.handiOccupied = handiOccupied;
    }
    public void handiKidsOn(int i) {
        handiOccupied = handiOccupied + i;
    }
    
    public void handiKidsOff(int i) {
        handiOccupied = handiOccupied - i;
    }
    @Override
    public void empty() {
        occupied = 0;
        handiOccupied = 0;
    }
    public int totalCapacity() {
        return handiCapacity + capacity;
    }
    public int handiAvailable() {
        return handiCapacity - handiOccupied;
    }
    public int totalAvailable() {
        return handiCapacity + capacity - handiOccupied - occupied;
    }
} 

interface fruit {
    String color = "";
    public abstract void bite();
    
}
class apple implements fruit {
    private String color = "";
            
    apple(String color) {
        this.color = color;
    }

    @Override
    public void bite() {
        System.out.println("yum");
    }
    
}
class generic {
    public <T> String getString (T item) {
        return item.toString();
    }
}
