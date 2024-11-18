//Assignment 1
public class Car {
    private String Model;
    private String Make;
    private double Price;

    public Car(String Model, String Make, double Price) {
        this.Model = Model;
        this.Make = Make;
        this.Price = Price;
    }

    public void displayData(){
        System.out.println("Model:" + Model);
        System.out.println("Year:" + Make);
        System.out.println("RM: " + Price);
    }

    public static void main(String[] args) {
        Car Peugout = new Car("5008", "2014", 300000.70);
        Peugout.displayData();

        System.out.println("**********************************");
      
        Car Tesla = new Car("model Y", "2014", 200000.20 );
        Tesla.displayData();

    }


}