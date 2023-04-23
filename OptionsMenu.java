package atmapp;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionsMenu extends Account
{
    Scanner menuinput= new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();

    public void getLogin() throws IOException
    {
        int x =1;
        do {
            try {
                data.put(778077,7728);   // giving option choose customer his account id and pin
                data.put(287728,2877);
                System.out.println("Welcome to the Atm service");
                System.out.println("Enter your customer Number");
                setCustomerNumber(menuinput.nextInt());

                System.out.print("Enter your PIN number : ");   // if the given values matched then it will enter to getAccountType()
                setPinNumber(menuinput.nextInt());              //or else it will print catch method
            }
            catch (Exception e)
            {
                System.out.println("Invalid Characters. only numbers, ");
                x=2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn)
            {
                getAccountType();
            }else
                System.out.println("Wrong Customer Number or Pin");
        }
        while(x==1);
    }
    public void getAccountType()
    {
        System.out.println("Select The Account You Want To Access : ");
        System.out.println("Checking Account Enter (1)");
        System.out.println("Savings Account Enter  (2)");
        System.out.println("For Exit Enter         (3)");

        int selection = menuinput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using atm, bye..");
                getAccountType();
        }
    }
    public void getChecking()
    {
        System.out.println("Checking Account : ");
        System.out.println("View Balance Type   (1)");
        System.out.println("Withdraw Money Type (2)");
        System.out.println("Deposit Money Type  (3)");
        System.out.println("Exit Type           (4)");
        System.out.println("Enter..");

        int selection =menuinput.nextInt();

        switch (selection)
        {
            case 1:
                System.out.println("Checking Account Balance : "+ moneyFormat.format(getSavingsBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM.. bye..");
                break;
            default:
                System.out.println("Entered Value Invalid");
                getChecking();
        }
    }
    public void getSaving()
    {
        System.out.println("Saving Account : ");
        System.out.println("View Balance Enter  (1)");
        System.out.println("Withdra money Enter (2)");
        System.out.println("Deposit Money Enter (3)");
        System.out.println("For Exit Enter      (4)");

        int selection= menuinput.nextInt();
        switch (selection)
        {
            case 1:
                System.out.println("savings account balance : "+moneyformat.format(getSavingsBalance()));
                getAccountType();
                break;
            case 2:
                getSavingsWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingsDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using This Atm..");
                break;
            default:
                System.out.println("invalid choice");
                getChecking();
        }
    }
}
