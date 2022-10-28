import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

// Main class

public class atmuse extends Account{
    Scanner MainInput=new Scanner(System.in);
    DecimalFormat MoneyFormat=new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();

    // Validate customer login information like account number and pin code

    public void getLogin() throws IOException{
        int x=1;
        do{
            try{
                data.put(29292992,8585);
                data.put(29292923,8586);
                System.out.println("Welcome to the ATM Machine");
                System.out.println("Enter Your customer number: ");
                setCustomerNumber(MainInput.nextInt());
                System.out.println("Enter Your Pin Number: ");
                setPinNumber(MainInput.nextInt());
            }
            catch (Exception e){
                System.out.println("\n"+ "Invalid characters. Enter only numbers" +"\n");
                x=2;
            }
            for(Entry<Integer, Integer>entry: data.entrySet()){
                if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()){
                    getAccountType();
                }
            
            }
            System.out.println("\n"+"Wrong customer number or pin number"+"\n");
            
        }
        while(x==1);
    }

    // Display Account type menu with selection

    public void getAccountType(){
        System.out.println("Select the account you want to access");
        System.out.println("Type 1- Checking Account");
        System.out.println("Type 2- Saving Account");
        System.out.println("Type 3- Exit");
        System.out.print("Choice: ");


        selection=MainInput.nextInt();

        switch(selection){
            case 1:
            getChecking();
            break;

            case 2:
            getSaving();
            break;

            case 3:
            System.out.println("Thank you for using this ATM....Bye");
            break;

            default:
            System.out.println("\n"+"Invalid Choice"+"\n");
            getAccountType();
        }
        
    }
// Display checking Account menu with selection

    public double getChecking(){
        System.out.println("Checking Account...");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2- Withdraw Funds ");
        System.out.println("Type 3- Deposit Funds ");
        System.out.println("Type 4- Exit ");
        System.out.print("Chice: ");
      
        selection=MainInput.nextInt();

        switch(selection){
            case 1:
            System.out.println("Checking Account Balance: "+ MoneyFormat.format(getCheckingBalance()));
            getAccountType();
            break;

            case 2:
            getCheckingWithdraw();
            getAccountType();
            break;

            case 3:
            getCheckingDeposit();
            getAccountType();
            break;

            case 4:
            System.out.println("Thank you for using this ATM, Bye ");
            break;

            default:
            System.out.println("\n"+"Invalid Choice "+"\n");
            getChecking();
        }
        return selection;

    }

    // Similarly for Saving Account with selection

    public double getSaving(){
        System.out.println("Saving Account...");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2- Withdraw Balance");
        System.out.println("Type 3- Deposit Balance");
        System.out.println("Type 4- Exit");
        System.out.print("Choice: ");

        selection=MainInput.nextInt();

        switch(selection){
            case 1:
            System.out.println("Saving Account Balance: "+ MoneyFormat.format(getSavingBalance()));
            getAccountType();
            break;

            case 2:
            getSavingWithdraw();
            getAccountType();
            break;

            case 3:
            getSavingDeposit();
            getAccountType();
            break;

            case 4:
            System.out.println("Thank You for using this ATM, Bye");
            break;

            default:
            System.out.println("\n"+ "Invalid choice"+"\n");
            getSaving();

        }
        return selection;
    }
    int selection;
}
