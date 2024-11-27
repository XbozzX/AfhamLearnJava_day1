
import java.util.ArrayList;

public class Assigment1 {


    public static void main(String[] args) {
        ArrayList<Object> rawss = new ArrayList<>();
        
        rawss.add("Dead soul");
        rawss.add(1233);
        rawss.add(12.20);

        for (int i = 0 ; i < rawss.size(); i++) {
            System.out.print("pak mir:"+ rawss.get(i) + " ");
        }

    }
}
