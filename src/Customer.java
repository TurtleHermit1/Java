import java.util.*;

public class Customer {

    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;

    public String getCustomerName() {
        return customerName;
    }


    public String getCustomerEmail() {
        return customerEmail;
    }


    public String getCustomerType() {
        return customerType;
    }


    public String getCustomerLocation() {
        return customerLocation;
    }


    Customer(String name,String email,String type,String location ){
        this.customerName=name;
        this.customerEmail=email;
        this.customerType=type;
        this.customerLocation=location;

    }


    void showDetails(){
        System.out.println("Customer Details");
        System.out.println("Name "+getCustomerName());
        System.out.println("E-mail "+getCustomerEmail());
        System.out.println("Type "+getCustomerType());
        System.out.println("Location "+getCustomerLocation());
    }

    
}

class Maine{                                                // Main is already present in the directory
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer Details");
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the email");
        String email=sc.nextLine();
        System.out.println("Enter the type");
        String type=sc.nextLine();
        System.out.println("Enter the location");
        String location=sc.nextLine();

        Customer customer=new Customer(name,email,type,location);
        customer.showDetails();
        
    }
}


