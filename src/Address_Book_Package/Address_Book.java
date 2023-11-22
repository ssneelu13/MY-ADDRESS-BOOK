package Address_Book_Package;
import java.util.Scanner;
import java.util.ArrayList;


public class Address_Book {
    public static void main(String[] args) {
        System.out.println("Hii and Welcome to MY ADDRESS BOOK !!!");
        Add_Contact add = new Add_Contact();
        add.addContact();
        add.addContact();
        add.addContact();
        add.displayData();
        add.editContact();
        add.displayData();
        add.deleteContact();
        add.displayData();

    }


}

