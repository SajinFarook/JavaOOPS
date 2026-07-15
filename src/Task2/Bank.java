package Task2;
import java.util.Scanner;
public class Bank {
    private int balance;

    Bank(int balance){
        this.balance=balance;
    }

    void deposit(int dep){
        balance=balance+dep;
    }

    void withdraw(int wd){
        if(wd>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance=balance-wd;
        }
    }

     void getBalance(){
         System.out.println("AccountBalance= "+balance);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Bank acc1=new Bank(1000);
        System.out.println("Enter an option");
        System.out.println("1:Deposit\n2:Withdraw\n3:View Balance");
        int opt=sc.nextInt();
        if(opt==1){
            System.out.println("Enter amount to deposit:");
            int dep=sc.nextInt();
            acc1.deposit(dep);
            acc1.getBalance();
        }
        else if (opt==2) {
            System.out.println("Enter amount to withdraw:");
            int wd=sc.nextInt();
            acc1.withdraw(wd);
            acc1.getBalance();
        }
        else if (opt==3) {
            acc1.getBalance();
        }
        else{
            System.out.println("Enter valid option");
        }
    }

}
