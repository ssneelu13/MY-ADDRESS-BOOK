package Address_Book_Package;
import java.util.ArrayList;
import java.util.Scanner;
public class Add_Contact {

    ArrayList<Contact_Details> list = new ArrayList<>();
    //method for adding contacts using add function
    void addContact() {
        Contact_Details contact = new Contact_Details();
        Scanner scan = new Scanner(System.in);

            System.out.println("Enter the first name:");
            contact.setfirst_name(scan.next());
            System.out.println("Enter the last name:");
            contact.setlast_name(scan.next());
            System.out.println("Enter the address:");
            contact.setaddress(scan.next());
            System.out.println("Enter the city:");
            contact.setcity(scan.next());
            System.out.println("Enter the state:");
            contact.setstate(scan.next());
            System.out.println("Enter the zip code:");
            contact.setzip_code(scan.next());
            System.out.println("Enter the phone number:");
            contact.setphone_number(scan.next());
            System.out.println("Enter the email_id:");
            contact.setemail_id(scan.next());
            list.add(contact);

   }

    //method for displaying data using for each loop
    void displayData() {
        for (Contact_Details Contacts : list) {
            System.out.println(Contacts);
        }
    }


    //method for editing the existing contact
    void editContact() {
        boolean is_person_found=false;
        int index_of_person=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name for editing an existing contact:");
        String first_name1 = scan.next();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getfirst_name().equals(first_name1)) {
                is_person_found=true;
                index_of_person=i;
                break;
            }
        }
        if(is_person_found ) {
            System.out.println("Update the first name:");
            list.get(index_of_person).setfirst_name(scan.next());
            System.out.println("Update Last Name: ");
            list.get(index_of_person).setlast_name(scan.next());
            System.out.println("Update address: ");
            list.get(index_of_person).setaddress(scan.next());
            System.out.println("Update city: ");
            list.get(index_of_person).setcity(scan.next());
            System.out.println("Update state: ");
            list.get(index_of_person).setstate(scan.next());
            System.out.println("Update zip code: ");
            list.get(index_of_person).setzip_code(scan.next());
            System.out.println("Update phone number: ");
            list.get(index_of_person).setphone_number(scan.next());
            System.out.println("Update email_id: ");
            list.get(index_of_person).setemail_id(scan.next());
        }
        else {
            System.out.println("Sorry,name does not exist");
        }
    }



    //method for deleting the data using remove function
    void deleteContact() {
        boolean is_person_found=false;
        int index_of_person=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name for deleting an existing contact:");
        String first_name1 = scan.next();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getfirst_name().equals(first_name1)) {
                is_person_found=true;
                index_of_person=i;
                break;
            }
        }

        if(is_person_found ) {
            list.removeIf(list->list.getfirst_name().equals(first_name1));
        }
    }

        }


