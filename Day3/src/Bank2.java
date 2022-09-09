import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;
public class Bank2 {
    private BigDecimal balance=new BigDecimal("0");
    Scanner scanner=new Scanner(System.in);
    public boolean isValid=false;
    Long[] AccountNoCollection = new Long[0];
    int o1;
    public void ask() {
        System.out.println("For opening a new Account in this bank: press 1");
        System.out.println("For login into your account           : press 2");
        System.out.println("For exit                              : press 3");
        o1=scanner.nextInt();
        if(o1==1){
            openAccount();
            loginAccount();
        }else if(o1==2){
            loginAccount();

        }else if(o1==3){
            System.exit(0);
        }else{
            error();
            ask();
        }
    }

    public void openAccount() {
        long min=10000000000L;
        long max=99999999999L;
        long randomValue=(long)(Math.random()*(max-min+1)+min);
        Long[] temp=new Long[AccountNoCollection.length+1];
        temp[0]=(randomValue);
        System.arraycopy(this.AccountNoCollection, 0, temp, 1, AccountNoCollection.length);
         this.AccountNoCollection = temp;
        System.out.println("Account opening process is successfull,your account number is: "+ randomValue);
    }

    public void loginAccount() {
        System.out.print("Please enter Your Account number: ");
        long AccNumber= scanner.nextLong();
        for (Long aLong : this.AccountNoCollection) {
            if (AccNumber == aLong) {
                isValid = true;
                break;
            }
        }
        if(isValid){
            success();
            ask2();
        }else{
            error();
            loginAccount();
        }
    }

    public void ask2() {
        System.out.println("Chose what you want to do");
        System.out.println("1.Deposit Money");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Check Balance");
        int option;
        option=scanner.nextInt();
        switch (option) {
            case 1 -> deposite();
            case 2 -> withdraw();
            case 3 -> view();
            default -> {
                System.out.println("please chose from above options");
                ask2();
            }
        }

    }

    private void view() {
        System.out.println("the Current balance is: "+this.balance);
        again();
    }

    private void withdraw() {
        System.out.println("Please enter how much Amount you want to WithDrawl");
        BigDecimal bg2;
        bg2=scanner.nextBigDecimal();
        if(bg2.compareTo(this.balance)==(-1) || bg2.compareTo(this.balance)==(0)) {
            this.balance = (this.balance).subtract(bg2);
            System.out.println("Rs " + bg2 + " has been withdrawn from account.");
            view();
            again();
        }else{
            System.out.println("insufficient balance");
            ask2();
        }
    }

    private void deposite() {
        System.out.println("Please enter how much Amount you want to Deposite");

        try
        {
            BigDecimal bg1;
        bg1=scanner.nextBigDecimal();
            if(bg1.signum()!=(-1)) {
                this.balance=(this.balance).add(bg1);
                System.out.println("Rs "+this.balance+" has been deposited in the account");
                view();
                again();
            }else{
                System.out.println("your entered value is invalid,try again");
                deposite();
            }
        }
        catch(InputMismatchException e)
        {
            e.printStackTrace();
//            System.out.println("invalid input,try again");
//            deposite();
        }

    }

    public void error() {
        System.out.println("something went Wrong,please try Again");
    }

    public void success() {
        System.out.println("Congratulations,your entered details are Valid");
    }

    public void again() {
        System.out.println("For another task: press 1");
        System.out.println("For main menu   : press 2");
        System.out.println("For exit        : press 3");
        int i;
        i= scanner.nextInt();
        switch (i) {
            case 1 -> ask2();
            case 2 -> ask();
            case 3 -> System.exit(0);
        }
    }
}
