import java.util.Scanner;

public class ItemType {
    private String name;
    private Double costPerDay;
    private Double deposite;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getCostPerDay() {
        return costPerDay;
    }
    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }
    public Double getDeposite() {
        return deposite;
    }
    public void setDeposite(Double deposite) {
        this.deposite = deposite;
    }

    void display(){
        System.out.println("Item type details");
        System.out.println("Name : "+getName());
        System.out.println("CostPerDay : "+String.format("%.2f",getCostPerDay()));
        System.out.println("Deposite : "+String.format("%.2f",getDeposite()));
    }


}


class Mainf{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item type name");
        String name=sc.nextLine();
        System.out.println("Enter the cost per day");
        Double cost = sc.nextDouble();
        System.out.println("Enter the deposite");
        Double deposite=sc.nextDouble();
        ItemType type=new ItemType();
        type.setName(name);
        type.setCostPerDay(cost);
        type.setDeposite(deposite);
        type.display();
    }
}