package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class LemurConspiracy
 * @author yasiro01
 */
public class LemurConspiracy {
    private ArrayList<Lemur> conspiracy = new ArrayList();
    
    public LemurConspiracy (String filename) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String name = "";
        int age = 0;
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] animal = line.split(",");
            if("Lemur".equals(animal[2])) {
                name = animal[0];
                age = Integer.parseInt(animal[1]);
                Lemur tempLemur = new Lemur(name, age);
                conspiracy.add(tempLemur);
            }
        }
        
    }
    public int size() {
        return conspiracy.size();
    }
    
    public Lemur getChief() {
        Lemur chief = new Lemur("", 0);
        Lemur tempLemur = null;
        for (int i = 0; i < conspiracy.size(); i++) {
            if (chief.getAge() <= conspiracy.get(i).getAge()) {
                chief = conspiracy.get(i);
            }
        } return chief;
    }
    
}
