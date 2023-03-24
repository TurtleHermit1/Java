import java.util.*;

public class Address {


    public String street;
    public String city;
    public int pincode;
    public String country;

    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }



    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    void displayAddress(){
        System.out.println("Street: "+street);
        System.out.println("City: "+city);
        System.out.println("Pincode: "+pincode);
        System.out.println("Country: "+country);

    }
}


class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        String street=sc.nextLine();
        System.out.println("Enter the city");
        String city=sc.nextLine();
        System.out.println("Enter the pincode");
        int pincode=sc.nextInt();
        System.out.println("Enter the country");
        String country=sc.next();
        Address a=new Address();
        a.setStreet(street);
        a.setCity(city);
        a.setPincode(pincode);
        a.setCountry(country);
        a.displayAddress();
    }
    






}


    