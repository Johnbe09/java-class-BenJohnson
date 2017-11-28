/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

/**
 *
 * @author ben
 */
public class ComputerMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComputerStore store = new ComputerStore();
        System.out.println();
        ComputerLaptop cl1 = new ComputerLaptop("Windows", 15.6, 2.0, 8);
        ComputerLaptop cl2 = new ComputerLaptop("Ubuntu", 14.6, 1.0, 7);
        ComputerLaptop cl3 = new ComputerLaptop("macOS", 16.6, 4.0, 2);
        ComputerLaptop cl4 = new ComputerLaptop("ChromeOS", 17.6, 3.0, 4);    
        store.addNewLaptop(cl1);
        store.addNewLaptop(cl2);
        store.addNewLaptop(cl3);
        store.addNewLaptop(cl4);
        store.printAll();
        store.sort();
        System.out.println("");
        store.printAll();
        System.out.println("--");
        store.sortMyStore(new ByOS());
        store.printAll();
        System.out.println("");
        store.sortMyStore(new ByMemory());
        store.printAll();
    }
    
}
