import java.util.Scanner;

public class Country {
    
    public String name;
    public String countryCode;
    public String isdCode;

    Country(String name,String code,String isd){

        this.name=name;
        this.countryCode=code;
        this.isdCode=isd;

    }


    String getName(){
        return name;
    }

    String getCountryCode(){
        return countryCode;
    }

    String getIsdCode(){
        return isdCode;
    }


    void display(){
        System.out.println("Country Name : "+getName());
        System.out.println("Country Code : "+getCountryCode());
        System.out.println("ISD Code : "+getIsdCode());
    }

}


class MainIs{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the country name");
        String cname=sc.nextLine();
        System.out.println("Enter the country code");
        String code=sc.nextLine(); 
        System.out.println("Enter the isd code");
        String isd=sc.nextLine();

        Country country=new Country(cname, code, isd);
        country.display();
    }
}