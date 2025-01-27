import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Boolean infiniteLoop=true;
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
                System.out.println("\nAdd customer \nMenu->");
                sc.nextLine();

                System.out.print("\nEnter customer name:");
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

                size=size + 1;

            }else if (option == 2) {

                System.out.println("\nChange Customer Name Menu");
                System.out.println("\nEnter your account number: ");

                //this is infact the logic of  swapping
                int accountIndex;
                String temp;

                accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    temp = accountName[accountIndex];
                    System.out.print("Enter the new name: ");
                    String name = sc.nextLine();
                    accountName[accountIndex] = name;
                    System.out.println("Name is successfully updated from " + temp + " to " + name + ". \n");
                }
			System.out.println("=================================");
            } else if (option == 3) {

                System.out.println("\nCheck Account Balance Menu");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.println(
                            accountName[accountIndex] + " your balance is " + accountBalance[accountIndex] + "Rs.");
                }
			System.out.println("=================================");
            } else if (option == 4) {

                System.out.println("\nUpdate Account Balance Menu ");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.print("Enter the amount to be deposited: ");
                    double amt = sc.nextDouble();

                    accountBalance[accountIndex] += amt;
                    System.out.println(accountName[accountIndex] + " your updated balance is : "
                            + accountBalance[accountIndex] + " NGN. \n ");
                }
			System.out.println("=================================");
            } else if (option == 5) {
				System.out.println("Accounts registered\n");

                for (int i = 100; i < size; i++) {
                    System.out.println("Account Number: " + i + ", Name: " + accountName[i] + ", Balance: "
                            + accountBalance[i] + "NGN. \n ");
                }
			System.out.println("=================================");
            } else if (option == 6) {

                System.out.println("Terminating...");
				System.out.println("Developed & Managed by Joseph@Codingal");
				System.out.println("Built with ❤ in Nigeria");
                infiniteLoop=false; //instead of this "System.exit(0);" can also be used
            } else {

                System.out.println("\n Invalid input.");
                System.out.println("Terminating...");
				System.out.println("Developed & Managed by Joseph@Codingal");
				System.out.println("Built with ❤ in Nigeria");
                System.exit(0);
            }
        }
    }
}