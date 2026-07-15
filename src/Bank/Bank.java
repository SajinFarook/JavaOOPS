package Bank;

import java.util.Scanner;
import java.util.SortedMap;

public class Bank {
    private String Account_no;
    String Name;
    private double Balance;

    public Bank(String Account_no,String Name,double Balance){
        this.Account_no=Account_no;
        this.Name=Name;
        this.Balance=Balance;
    }

    double getbalance(){
        return Balance;
    }

    public void Deposit(double amount){
        Balance+=amount;
    }

    public void Withdraw(double amt){
        if(amt>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Money withdrew:"+amt);
            Balance-=amt;
        }
    }

    static void main(String[] args) {
        System.out.println("Enter balance amount:");
        Scanner sc=new Scanner(System.in);
        double bal=sc.nextInt();
        boolean loop=true;
        Bank b1=new Bank("1010101","sajin",bal);
        while (loop){
            System.out.println("Choose number of option\n 1)Deposit\n 2)Withdraw\n 3)ViewBalance\n 4)Exit");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter amount to be deposited:");
                    double deposit= sc.nextDouble();
                    if (deposit%100!=0){
                        System.out.println("Enter valid Amount to deposit");
                    }
                    else{
                        b1.Deposit(deposit);
                        break;
                    }
                case 2:
                    System.out.println("Enter amount to be withdrawed:");
                    double withdrew= sc.nextDouble();
                    b1.Withdraw(withdrew);
                    break;
                case 3:
                    System.out.println("Current Balance:"+b1.getbalance());
                    break;
                case 4:
                    System.out.println("Thanks for using the bank");
                    loop=false;
                    break;
            }
        }
    }
}
