package exercise5;

/**
 * Class Room
 * Task 1: Create a class Room with the following private data members: String building, int number
 * @author yasiro01
 */
public class Room {
    private String building;
    private int number;
    public Room(String building, int number) {
        this.building = building;
        this.number = number;
    } 
    public int getNumber() {
        return number;
    }
    public String getBuilding() {
        return building;
    }
    public String toString() {
        return String.format("%s %s", building, number);
    }
}
