import java.util.Scanner;
public class Account {
   protected String accName;
   protected String accNo;
   protected String bankName;

public String getAccName() {
    return accName;
}

public void setAccName(String accName) {
    this.accName = accName;
}

public String getAccNo() {
    return accNo;
}

public void setAccNo(String accNo) {
    this.accNo = accNo;
}

public String getBankName() {
    return bankName;
}

public void setBankName(String bankName) {
    this.bankName = bankName;
}

void display(){
    System.out.println("Account Name:"+getAccName());
    System.out.println("Account Number:"+getAccNo());
    System.out.println("Bank Name:"+getBankName());
   }
}


class CurrentAccount extends Account{

    private String tinNumber;

    CurrentAccount(String accNamString,String accNoString,String bankName,String tinNumber){
        
        super.setAccName(accNamString);
        super.setAccNo(accNoString);
        super.setBankName(bankName);
        this.tinNumber=tinNumber;
        
    }
    

    

    String getTinNumber(){
        return tinNumber;
    }

    void display(){
        
        super.display();
        System.out.println("TIN Number:"+getTinNumber());
    }


}

class SavingsAccount extends Account{

    private String orgName;

    SavingsAccount(String accName,String accNo,String bankName,String orgName){
        super.setAccName(accName);
        super.setAccNo(accNo);
        super.setBankName(bankName);
        this.orgName=orgName;
    }

    String getOrgName(){
        return orgName;
    }

    void display(){

        super.display();
        System.out.println("Organisation Name:"+orgName);

    }




}

class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useDelimiter("\\D");
        System.out.println("Choose Account Type");
        System.out.println("1.Saving Account");
        System.out.println("2.Current Account");
        
        int input =Integer.parseInt(sc.nextLine());
        // sc.nextLine();
        switch(input){
            case 1:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
              
                String str=sc.nextLine();
                String []arr=str.split(",");
            
                SavingsAccount sav=new SavingsAccount(arr[0],arr[1],arr[2],arr[3]);
                sav.display();
               
                break;

                default:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
                String st1=sc.nextLine();
                String []arr1=st1.split(",");
                

                CurrentAccount cu=new CurrentAccount(arr1[0],arr1[1],arr1[2],arr1[3]);
                cu.display();

        }

    
    
    
    }
    




}