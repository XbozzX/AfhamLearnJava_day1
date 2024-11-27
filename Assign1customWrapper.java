public class Assign1customWrapper {
    String stringData;
    Integer intData;
    Double flotData;


    public Assign1customWrapper (String stringData, Integer intData, Double flotData) {
        this.stringData = stringData;
        this.intData = intData;
        this.flotData = flotData;
    }

    public void setString( String stringData) {
        this.stringData = stringData;
    }

    public String getString() {
       return  this.stringData;
    }
}   
