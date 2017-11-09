package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FrogArmy
 * @author yasiro01
 */
public class FrogArmy {
    private ArrayList<Frog> army = new ArrayList();
    
    public FrogArmy (String filename) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String name = "";
        int age = 0;
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] animal = line.split(",");
            if("Frog".equals(animal[2])) {
                name = animal[0];
                age = Integer.parseInt(animal[1]);
                Frog tempFrog = new Frog(name, age);
                army.add(tempFrog);
            }
        }
        
    }
    public int size() {
        return army.size();
    }
    
    public Frog getChief() {
        Frog chief = new Frog("", 0);
        Frog tempFrog = null;
        for (int i = 0; i < army.size(); i++) {
            if (chief.getAge() < army.get(i).getAge()) {
                chief = army.get(i);
            }
        } return chief;
    }
    
}
