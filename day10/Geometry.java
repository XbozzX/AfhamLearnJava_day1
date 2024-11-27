package day10;

public class Geometry {
    static double radius;


    static double length;
    static double width;


    static double base;
    static double height;
    static boolean isTriangle;

    public static void circleBro(double radius) {
        int power = 2;
        double data = Math.pow((Math.PI * radius), power);
        System.out.println("cirle Bro: " + data);
    }

    public static void heightHawau(double length, double width) {
        double data = length*width;
        System.out.println("height Bro: " + data);
    }   

    public static void triagleNatang(double base, double height, boolean isTriangle) {
        if (!isTriangle) {
            System.out.println("Natang mu,,, bagi la triangle");
        } else {
            double data = 0.5 * base * height;
            System.out.println(" triagle: " + data);
        }
    }   





    public static void main(String[] args) {
       circleBro(2); // : π*radius^2
       heightHawau(4, 6); // : length*width
       triagleNatang(10, 5.2, true); // : 0.5*base*height
       triagleNatang(10, 5.2, false); // : 0.5*base*height
    }
}