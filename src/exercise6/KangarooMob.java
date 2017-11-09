package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class KangarooMob
 * @author yasiro01
 */
public class KangarooMob {
    private ArrayList<Kangaroo> mob = new ArrayList();
    
    public KangarooMob (String filename) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String name = "";
        int age = 0;
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] animal = line.split(",");
            if("Kangaroo".equals(animal[2])) {
                name = animal[0];
                age = Integer.parseInt(animal[1]);
                Kangaroo tempKangaroo = new Kangaroo(name, age);
                mob.add(tempKangaroo);
            }
        }
        
    }
    public int size() {
        return mob.size();
    }
    
    public Kangaroo getChief() {
        Kangaroo chief = new Kangaroo("", 0);
        Kangaroo tempKangaroo = null;
        for (int i = 0; i < mob.size(); i++) {
            if (chief.getAge() < mob.get(i).getAge()) {
                chief = mob.get(i);
            }
        } return chief;
    }
    
}

