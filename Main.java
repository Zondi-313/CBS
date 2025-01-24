import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        booleen infiniteLoop=true;
        double[] accountBalance=new double[1000]; //This array will contain the account balance
        String[] accountName=new String[1000]; //This array will contain the holder's name
        int option, size=100; //Size will be the first account we want to begin from
        //Infinite loopto keep our program running until we wish to end it
        while(infiniteLoop){
            System.out.println("Welcome to codingal banking services");
            System.out.println("Banking menu:");
            System.out.println("Select any one option from below");
            System.out.println("1-> Add customer");
            System.out.println("2-> Change customer name");
            System.out.println("3-> Check account balance");
            System.out.println("4-> Update account balance");
            System.out.println("5-> Summary of all accounts");
            System.out.println("6-> Quit");
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter you option to proceed ahead:");
            option=sc.nextInt();
            //Instead of if, we can use switch case hear`
            if(option == 1){
                System.out.println("\n Add customer \n Menu->");
                sc.nextLine();

                System.out.print("\n Enter customer name:");
                String name=sc.nextLine();
                accountName[size]=name;
                System.out.print("Enter opening balance amount:"); 
                double amt=sc.nextDouble();
                accountBalance[size]=amt;

                System.out.println("Account created successfully. \n");
                System.out.println("Account details:- \n");
                System.out.println("Account number"+ (size));
                System.out.println("Account name:"+ (accountName[size]));
                System.out.println("Account balance:"+ accountBalance[size] +"NGN \n");
                System.out.println("===============");
                
            }
        }
    }
}