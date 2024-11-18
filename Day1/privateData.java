public class privateData {
    private String name;
    private int age;
    

    public privateData (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public void displaydata() {
    //     Str
    // }

    public static void main(String[] args) {
        privateData test1 = new privateData("Abu", 1000000);
        System.out.println(test1.name);
        System.out.println(test1.age);
    }

    

}
