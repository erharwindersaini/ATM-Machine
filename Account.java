
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input= new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

    // set the customer number

    public int setCustomerNumber(int customerNumber){
        this.customerNumber= customerNumber;
        return customerNumber;
    }

    // Get the customer Number

    public int getCustomerNumber(){
        return customerNumber;
    }

    // set Pin Number

    public int setPinNumber(int pinNumber){
        this.pinNumber= pinNumber;
        return pinNumber;
    }

    // Get the Pin Number

    public int getPinNumber(){
        return pinNumber;
    }
    
    // Get checking Account Balance

    public double getCheckingBalance(){
        return checking;
    }

    // Get Saving Account Balance
    public double getSavingBalance(){
        return saving;
    }

    // Calculate the checking Account Withdraw Balance

    public double calCheckingWithdraw(double amount){
        checking=checking-amount;    
        return checking;
    }
     
    // Calculate the Saving Account Withdraw Balance

    public double calSavingWithdraw(double amount){
        saving=saving-amount;     
        return saving;
    }

    // Calculate the Checking Account Deposit Balance

    public double calCheckingDeposit(double amount){
        checking=checking+amount;
        return checking;
    }

    // Calculate the Saving Account Deposit Balance

    public double calSavingDeposit(double amount){
        saving=saving+amount;
        return saving;
    }

    // Customer Checking Account Withdraw Input

    public void getCheckingWithdraw(){
        System.out.println("Checking Account Balance"+ moneyFormat.format(checking));
        System.out.println("Amount you want to withdraw: ");
        double amount=input.nextDouble();

        if((checking-amount)>=0){
            calCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance "+ moneyFormat.format(checking));
        }
        else{
            System.out.println("Balance cannot be negative"+"\n");
        }
    }

    // Customer Saving Account Withdraw Input

    public void getSavingWithdraw(){
        System.out.println("Saving Account Balance"+ moneyFormat.format(saving));
        System.out.println("Amount you want to withdraw: ");
        double amount=input.nextDouble();

        if((saving-amount)>=0){
            calSavingWithdraw(amount);
            System.out.println("New Saving Account Balance "+ moneyFormat.format(saving));
        }
        else{
            System.out.println("Balance cannot be negative"+"\n");
        }
    }

    // Customer Checking Account Deposit Input

    public void getCheckingDeposit(){
        System.out.println("Checking Account balance"+ moneyFormat.format(checking));
        System.out.println("Amount You want to Deposit: ");
        double amount= input.nextDouble();

        if((checking+amount)>=0){
            calCheckingDeposit(amount);
            System.out.println("New checking Account balance"+ moneyFormat.format(checking));
        
        }
        else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }

    // Customer Saving Account Deposit Input

    public void getSavingDeposit(){
        System.out.println("Checking Account balance"+ moneyFormat.format(saving));
        System.out.println("Amount You want to Deposit: ");
        double amount= input.nextDouble();

        if((saving+amount)>=0){
            calSavingDeposit(amount);
            System.out.println("New Saving Account balance"+ moneyFormat.format(saving));
        
        }
        else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }
    private int customerNumber;
    private int pinNumber;
    private double checking=0;
    private double saving=0;
}
