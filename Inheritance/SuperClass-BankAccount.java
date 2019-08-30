import java.util.Scanner;

public class BankAccount {
    String accountno;
    double balance;

    public static void main(String [] args){
        CheckingAccount cust1_check=new CheckingAccount();
        SavingAccount cust1_save=new SavingAccount();
        COD cust1_cod=new COD();
        BankAccount cust1 = new BankAccount();
        cust1.accountno="Acoount1";
        cust1.balance=2560.1;



    }

}
