package Address_Book_Package;

//usecase5: adding multiple contacts in address book
public class Address_Book {
    public static void main(String[] args) {
        System.out.println("Hii and Welcome to MY ADDRESS BOOK !!!");
        Add_Contact add = new Add_Contact();
        add.addContact();
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

