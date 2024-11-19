import java.util.Scanner;

public class Assignment1 {

    private String Model;
    private double Price;

  

    public Assignment1 (String Model, double Price) {
        this.Model = Model;
        this.Price = Price;
    }


    // public void conditionModel(String carModel, double carPrice) {
      
    // }
    

    public static void main (String[] args) {

        Scanner KeyInput = new Scanner(System.in);
        System.out.println("What are the car Model");
        String carModel = KeyInput.nextLine().toUpperCase();
        System.out.println("What are the car PRICE");
        double carPrice = KeyInput.nextDouble();
        System.out.println("");

        Assignment1 car1 = new Assignment1(carModel, carPrice);   
        
        // conditionModel(carModel, carPrice);

        switch (carModel) {
            case "BMW":
                if (carPrice > 100000 || carPrice == 101000){
                    System.out.println("VIP");
                    System.out.println("Price: " + car1.Price);
                } else {
                    System.out.println("Model: " + car1.Model);
                    System.out.println("Price: RM" + car1.Price);
                }
                break;
            case "PROTON":
                if (carPrice > 100000 || carPrice == 101000){
                    System.out.println("VIP");
                    System.out.println("Price: " + car1.Price);
                } else {
                    System.out.println("Model: " + car1.Model);
                    System.out.println("Price: RM" + car1.Price);
                }
                break;
            default:
            if (carPrice > 100000 || carPrice == 101000){
                System.out.println("VIP");
                System.out.println("Price: " + car1.Price);
            } else {
                System.out.println("Model: " + car1.Model);
                System.out.println("Price: RM" + car1.Price);
            }
            break;
        }
    }

}