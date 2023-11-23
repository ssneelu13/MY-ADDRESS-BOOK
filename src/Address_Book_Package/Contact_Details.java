package Address_Book_Package;
//usecase1: defining all the properties of a class
public class Contact_Details {
        //declare variables
        private String first_name;
        private String last_name;
        private String address;
        private String city;
        private String state;
        private String zip_code;
        private String phone_number;
        private String email_id;



        //use setters and getters method to access the private variables
        public void setfirst_name(String first_name) {

            this.first_name = first_name;
        }
        public String getfirst_name() {

            return first_name;
        }
        public void setlast_name(String last_name) {

            this.last_name = last_name;
        }
        public String getlast_name() {

            return last_name;
        }
        public void setaddress(String address) {

            this.address = address;
        }
        public String getaddress() {

            return address;
        }
        public void setcity(String city) {

            this.city = city;
        }
        public String getcity() {

            return city;
        }
        public void setstate(String state) {
            this.state = state;
        }
        public String getstate() {

            return state;
        }
        public void setzip_code(String zip_code) {

            this.zip_code = zip_code;
        }
        public String getzip_code() {

            return zip_code;
        }
        public void setphone_number(String phone_number) {
            this.phone_number = phone_number;
        }
        public String getphone_number() {

            return phone_number;
        }
        public void setemail_id(String email_id) {

            this.email_id = email_id;
        }
        public String getemail_id() {

            return email_id;
        }
   @Override
        public String toString() {
            return "Contact_details [FIRST_NAME=" + first_name + ", LAST_NAME=" + last_name + ", ADDRESS=" + address + ", CITY=" + city + ", STATE=" + state + ", ZIP_CODE=" + zip_code + ", PHONE_NUMBER=" + phone_number + ", EMAIL_ID=" + email_id + "]";
    }
    }

