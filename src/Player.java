import java.util.Scanner;

public class Player {

    private String name;
    private Integer age;
    private String country;

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return name;
    }

    void setAge(Integer age){
        this.age=age;
    }
    Integer getAge(){
        return age;
    }

    void setCountry(String country){
        this.country=country;
    }

    String getCountry(){
        return country;
    }

    void display(){
        System.out.println("Player Details:");
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Country:"+getCountry());
    }

}




class Maines{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name:");
    String name=sc.nextLine();
    System.out.println("Enter Age:");
    Integer age=sc.nextInt();
    System.out.println("Enter Country:");
    String country=sc.next();
    Player player=new Player();
    player.setName(name);
    player.setAge(age);
    player.setCountry(country);

    player.display();
}


}