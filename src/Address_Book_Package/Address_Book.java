package Address_Book_Package;
import java.util.Scanner;
import java.util.ArrayList;


public class Address_Book {
    public static void main(String[] args) {

        //greeting to the program
        System.out.println("Welcome to adrress book program");
        Add_Contact add = new Add_Contact();
        add.add_Contact();
        add.display_Data();
    }


}

