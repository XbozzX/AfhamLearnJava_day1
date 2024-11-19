//Assignment 1.1
import java.util.Scanner;

public class CarAssignment1point1 {
    private String Model;
    private String Make;
    private double Price;

    public CarAssignment1point1(String Model, String Make, double  Price) {
        this.Model = Model;
        this.Make = Make;
        this.Price = Price;
    }


    public void displayCarDetails () {
        System.out.println( "Model: " + Model);
        System.out.println( "Year Make: " + Make);
        System.out.println("Price: " + Price);
    }

    

    public static void main(String[] args) {

        // for (int count=0; count < 3; count++) {
            
        // }
        
        //car1 
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Car Name");
        // String carCompany = scanner.nextLine(); 
        System.out.println("Model");
        String carModel = scanner.nextLine();
        System.out.println("What year is make");
        String carMake= scanner.nextLine();
        System.out.println("Car Price");
        double carPrice= scanner.nextDouble();
        System.out.println("");
        

        CarAssignment1point1 car1 = new CarAssignment1point1(carModel, carMake, carPrice);

        //car 2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Model");
        String carModel2 = scanner2.nextLine();
        System.out.println("What year is make");
        String carMake2= scanner2.nextLine();
        System.out.println("Car Price");
        double carPrice2= scanner2.nextDouble();
        System.out.println("");

        CarAssignment1point1 car2 = new CarAssignment1point1(carModel2, carMake2, carPrice2);

        // car3
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Model");
        String carModel3 = scanner3.nextLine();
        System.out.println("What year is make");
        String carMake3 = scanner3.nextLine();
        System.out.println("Car Price");
        double carPrice3 = scanner3.nextDouble();

        CarAssignment1point1 car3 = new CarAssignment1point1(carModel3, carMake3, carPrice3);
        
        // display the car list
        System.out.println("***********************************");
        car1.displayCarDetails();
        System.out.println("***********************************");
        car2.displayCarDetails();
        System.out.println("***********************************");
        car3.displayCarDetails();

        //calculate average
        double totalAverage = (car1.Price + car2.Price + car3.Price) / 3;
        //display the output
        System.out.print("average: " + totalAverage);
    }



}