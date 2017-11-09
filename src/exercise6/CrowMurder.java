package exercise6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class CrowMurder
 * @author johnbe09
 */
public class CrowMurder {
    private ArrayList<Crow> murder = new ArrayList();
    
    public CrowMurder(String filename) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String name = "";
        int age = 0;
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] animal = line.split(",");
            if("Crow".equals(animal[2])) {
                name = animal[0];
                age = Integer.parseInt(animal[1]);
                Crow tempCrow = new Crow(name, age);
                murder.add(tempCrow);
            }
        }
        
    }
    public int size() {
        return murder.size();
    }
    
    public Crow getChief() {
        Crow chief = new Crow("", 0);
        Crow tempCrow = null;
        for (int i = 0; i < murder.size(); i++) {
            if (chief.getAge() < murder.get(i).getAge()) {
                chief = murder.get(i);
            }
        }
        
        
        return chief;
    }
    
    
    
    
}
