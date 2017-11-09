package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Chart
 * Task 8: Create a class Chart that contains a private data member HashMap<Integer, Song> (reuse class Song from task 7). Its constructor must take file name as a parameter, read data from the file (sample top40pop.csv is provided), create a new Song object from each line, and put that object into a HashMap using a song position as a key. Implement method getSong that takes an integer position as a parameter and returns a Song at that position. 
 * 
 * @author yasiro01
 */
public class Chart {
    private HashMap<Integer, Song> map = new HashMap<>(); // = new HashMap<>();
    //private String fileName;
    
    
    /*
    public void main() throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
        String line;
        int position;
        //Pattern p = Pattern.compile("\d+," + Song.getTitle() + "," + Song.getArtist());
        while ((line = inputFile.readLine()) != null) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                System.out.printf("%s %s%n", m.group(2), m.group(1));
            }
        }

    }
*/
    
    public Chart(String fileName) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
        String line;
        int i = 0;
        String title = "";
        String artist = "";
        
//        while ((line = inputFile.readLine()) != null) {
//            Scanner lineContent = new Scanner(line);
            //i++;
//            while (lineContent.hasNext()) {
//                i++;
//                String[] thisLine = line.split(",");
//                title = thisLine[1];
//                artist = thisLine[2];
//                
//                //title = lineContent.next();
//                //artist = lineContent.next();
//                Song newSong = new Song(title, artist);
//                map.put(i, newSong);
//            }
//        }

        
        while ((line = inputFile.readLine()) != null) {
           // i++;
                String[] thisLine = line.split(",");
                i = Integer.parseInt(thisLine[0]);
                title = thisLine[1];
                artist = thisLine[2];
                
                //title = lineContent.next();
                //artist = lineContent.next();
                Song newSong = new Song(title, artist);
                map.put(i, newSong);
            }
        }
        

        
        
 
    public Song getSong(int pos) {
        System.out.println(map.get(pos));
        return map.get(pos);
    }
}
