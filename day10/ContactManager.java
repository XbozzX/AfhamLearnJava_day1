package day10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ContactManager {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    static int limitAddContact = 100;
    static ArrayList<ContactManager> contactList = new ArrayList<>();
    
    public ContactManager() {}

    public ContactManager (String name, String phoneNumber, String emailAddress)  {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }   

    @Override
    public String toString() {
        return "Name:" + this.name + " " +"Phone Number:" + this.phoneNumber + " " + "Email:" + this.emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public static void initialize() {
         new ContactManager();
    }

    public static void addContact(String name, String phoneNumber, String emailAddres) {
        new ContactManager(name, phoneNumber, emailAddres);
    } 

    public static void searchContact(String name) {
        boolean flagFound = false;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(name)) {
                System.out.println("contact detail: " + contactList.get(i));
                flagFound = true;
                break;
            } 
        }
        if (!flagFound) {
            System.out.println("404 not found");
        }
    }

    public static void displayContacts() {
        ArrayList<String> sortData = new ArrayList<>();
        
        for (int i = 0; i < contactList.size(); i++) {
            String origNames = contactList.get(i).getName();
            sortData.add(origNames);
        }

        Collections.sort(sortData);
        System.out.println("Display data");
        for (String name : sortData) {
            System.out.println("Name: " + name);
        }


    }

    public static void main(String[] args) {

        // num 1
        System.out.println("1++++++++++++++++++++");
        contactList.add(new ContactManager("kamil", "+60123", "example@com"));
        contactList.add(new ContactManager("abu", "++50264", "example123@com"));
        contactList.add(new ContactManager("ifrad", "+65321", "example1223@com"));

        System.out.println("++++++++++++++++++++");
        initialize();
        System.out.println("++++++++++++++++++++");
        searchContact("ifrad");
        System.out.println("++++++++++++++++++++");
        displayContacts();
        System.out.println("++++++++++++++++++++");
        searchContact("Larry");
        System.out.println("++++++++++++++++++++");
        

        // num 2
        System.out.println("2++++++++++++++++++++");
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("Oak");
        strBuild.reverse();
        System.out.println("Store " + strBuild.toString());
        

        // num 3
        System.out.println("3++++++++++++++++++++");
        String mydata = "I hated my life, so i want to kill myself.";
        String regex = "[,\\.]";
        String[] strArray = mydata.split(regex);

        for (String data : strArray) {
            System.out.println(data);
        }


        //num 4
        int row = 4;
        int colom = 4;

        int[][] multiDemisi = new int[row][colom];

        
        String printData = "data[%d][%d]: ";
        int count = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colom; j++) {
                multiDemisi[i][j] = count;
                String finalPrint = String.format(printData, i, j);
                System.out.println(finalPrint + multiDemisi[i][j]);
                System.out.println("++++++++++++++++++++++++++++");
                count++;
            }
        }




        // num 5
        System.out.println("5++++++++++++++++++++");
        String data = "Test1 %s! mark is %d sad";
        String result = String.format(data, "gg", 2031);
        System.out.println(result);



    }
}   
