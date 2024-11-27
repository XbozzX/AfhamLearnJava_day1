package day9;

public class exerise2 {
    static int num = 10;

    public static void demonstart() {
        int num = 50;
        System.out.println("value global variable: " + exerise2.num);
        System.out.println("value local variable: " + num);
    }

    public static void main(String[] hehehe) {
        demonstart();
        System.out.println(exerise2.num);
    }
}
