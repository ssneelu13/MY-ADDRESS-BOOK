package Address_Book_Package;

import java.util.Scanner;

//usecase5: adding multiple contacts in address book
//usecase6: using switch case for providing options[add,edit,delete] for the user
public class Address_Book {
    public static void main(String[] args) {
        System.out.println("Hii and Welcome to MY ADDRESS BOOK !!!");
        Add_Contact add = new Add_Contact();
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu: enter 1 - adding contact"+" "+"enter 2 - editing contact"+" "+"enter 3 - deleting contact");
        int options=scan.nextInt();
        switch(options){
            case 1:
                add.addContact();
                add.displayData();
                break;

            case 2:
                add.editContact();
                add.displayData();
                break;

            case 3:
                add.deleteContact();
                add.displayData();
                break;

            default:
                System.out.println("sorry, invalid option");
        }

    }


}

