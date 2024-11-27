package day10;
import java.util.Date;

public class StringBuilderDemo {
    public static void main(String[] args) {
        int n = 100000;
        
        // Using String concatenation
        long startTime = new Date().getTime();
        String stringResult = "";
        for (int i = 0; i < n; i++) {
            stringResult += "Hello, World!";
        }
        long endTime = new Date().getTime();
        long stringTime = endTime - startTime;
        
        // Using StringBuilder
        startTime = new Date().getTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("Hello, World!");
        }
        String stringBuilderResult = sb.toString();
        endTime = new Date().getTime();
        long stringBuilderTime = endTime - startTime;
        
        System.out.println("String concatenation time: " + stringTime + " ms");
        System.out.println("StringBuilder time: " + stringBuilderTime + " ms");
    }
}