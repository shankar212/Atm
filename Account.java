package atmapp;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account
{
    private int customerNumber;
    private int PinNumber;
    private double checkingBalance = 0;
    private double savingsBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber)
    {
        this.customerNumber=customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber()
    {
        return customerNumber;
    }
    public int setPinNumber(int PinNumber)
    {
        this.PinNumber=PinNumber;
        return PinNumber;
    }
    public int getPinNumber()
    {
        return PinNumber;
    }
    public double getCheckingBalance()
    {
        return checkingBalance;
    }
    public double getSavingsBalance()
    {
        return savingsBalance;
    }
    public double calcCheckingWithdraw(double amount)
    {
        checkingBalance=(checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount)
    {
        savingsBalance = (savingsBalance- amount);
        return  savingsBalance;
    }
    public double calcCheckingDeposit(double amount)
    {
        checkingBalance =(checkingBalance+amount);
        return checkingBalance;
    }
    public double calcSavingsDeposit(double amount)
    {
        savingsBalance=(savingsBalance+amount);
        return savingsBalance;
    }
    public void getCheckingWithdrawInput()
    {
        System.out.println("checking Account balance : "+moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking account : ");
        double amount=input.nextDouble();
        if ((checkingBalance - amount) >=0)
        {
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account balance : "+moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot be Negative..");
        }
    }
    public void getSavingsWithdrawInput()
    {
        System.out.println("savings account balance : "+moneyFormat.format(savingsBalance));
        System.out.print("amount you want to withdraw from savings account : ");
        double amount = input.nextDouble();

        if ((savingsBalance-amount)>=0)
        {
            calcSavingWithdraw(amount);
            System.out.println("New savings account balance : "+moneyFormat.format(savingsBalance));
        }else {
            System.out.println("balance can't be negative");
        }
    }
    public void getCheckingDepositInput()
    {
        System.out.println("checking amount balance : "+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit from checking account : ");
        double amount = input.nextDouble();
        if ((checkingBalance+amount)>=0)
        {
            calcCheckingDeposit(amount);
            System.out.println("New checking account balance : "+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance Can't be negative..");
        }
    }
    public void getSavingsDepositInput()
    {
        System.out.println("checking account Balance : "+moneyFormat.format(savingsBalance));
        System.out.println("Amount you want to deposit from savings account");
        double amount=input.nextDouble();
        if ((savingsBalance+amount)>=0)
        {
            calcSavingsDeposit(amount);
            System.out.println("new savings Account Balance : "+moneyFormat.format(savingsBalance));
        }else
        {
            System.out.println("Balance can't be negative");
        }
    }
}
