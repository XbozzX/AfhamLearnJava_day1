import java.util.ArrayList;

public class Assign1main {
    String stringData;
    Integer intData;
    Double flotData;
    static String pakabu; // Unused, can be ignored for now

    // Constructor
    public Assign1main(String stringData, Integer intData, Double flotData) {
        this.stringData = stringData;
        this.intData = intData;
        this.flotData = flotData;
    }

    // Getter and setter for stringData
    public void setString(String stringData) {
        this.stringData = stringData;
    }

    public String getString() {
        return this.stringData;
    }

    // Override toString method to customize how the object is printed
    @Override
    public String toString() {
        // Return a string that displays all the fields of the object
        return "String Data: " + this.stringData + ", Integer Data: " + this.intData + ", Float Data: " + this.flotData;
    }

    public static void main(String[] args) {
        // Initialize the ArrayList
        ArrayList<Assign1main> raws = new ArrayList<>();

        // Add new objects to the list
        raws.add(new Assign1main("adasd", 123, 123.20));

        // Iterate over the list and print each object
        for (int i = 0; i < raws.size(); i++) {
            System.out.println("Object " + (i+1) + ": " + raws.get(i)); // This will call the overridden toString method
        }
    }
}