public class Assignment1 {
    

    public static void getMatrix() {
        String carModel[][] = {{"BWM", "FERRARI"}, {"TESLA"}, {"PEUGOUT"}};
        double carPrice[][] = {{300000, 100000}, {45000}, {150000}};

        //         System.out.println("test: " + carModel[rowModel][colomModel]);
                for (int rowPrice = 0; rowPrice<carPrice.length; rowPrice++)
                    for (int colomPrice = 0; colomPrice< carPrice[rowPrice].length; colomPrice++)
                        // System.out.println("test: " + carPrice[rowPrice][colomPrice]);
                        if (carPrice[rowPrice][colomPrice] < 50000) {
                            System.out.println("**************************************************");                  
                        } else {
                                    System.out.println("Model: " + carModel[rowPrice][colomPrice]);
                                    System.out.println("Price: " + carPrice[rowPrice][colomPrice]);
                                    System.out.println("**************************************************");   
                        }

                    // enchaced loop
                    // for or (double value : carIndex)
                    //       (double[] carIndex : carPrice)
                    //     f  if (value < 50000) {
                    //             System.out.println("**************************************************");                  
                    //         } else {
                    //                 System.out.println("Model: " + carModel[0][1]);
                    //                 System.out.println("Price: " + value + carIndex);
                    //                 System.out.println("**************************************************");   
                    //          }
    }

    public static void main(String[] args) {
        getMatrix();
    }
}