package Address_Book_Package;
import java.util.ArrayList;
import java.util.Scanner;
public class Add_Contact {
    Contact_Details contact = new Contact_Details();
    ArrayList<Contact_Details> list = new ArrayList<Contact_Details>();
    //function for displaying data
    void display_Data() {
        for(Contact_Details Contacts : list) {
            System.out.println(Contacts);
        }

    }
    //function for adding contacts
    void add_Contact(){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of records that need to be added in address book:" );
        int n=scan.nextInt();

        for(int i=0; i<n; i++) {
            System.out.println("enter the first name:");
            contact.setFirst_name(scan.next());
            System.out.println("enter the last name:");
            contact.setLast_name(scan.next());
            System.out.println("enter the address:");
            contact.setAddress(scan.next());
            System.out.println("enter the city:");
            contact.setCity(scan.next());
            System.out.println("enter the state:");
            contact.setState(scan.next());
            System.out.println("enter the zip code of the residency:");
            contact.setZip_code(scan.next());
            System.out.println("enter the phone number:");
            contact.setPhone_number(scan.next());
            System.out.println("enter the email_id:");
            contact.setEmail_id(scan.next());
            list.add(contact);
        }
    }

}
