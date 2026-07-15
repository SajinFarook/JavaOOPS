package Constructor;

public class Account {
    String accountNumber;
    float balanceAmount;

    public Account (String accountnumber, float balance){
        if(accountnumber ==null || accountnumber.trim().isEmpty()){
            System.out.println("Error: Account number cant be null or be empty.");
            return;
        }
        else{
            System.out.println("AcoountNumber:"+accountnumber+", Balance:"+balance);
        }
        if(balance<0){
            System.out.println("Error: Balance cant be non-negative.");
            return;
        }
        accountnumber=accountNumber;
        balance=balanceAmount;
    }
}
class Main{
    static void main(String[] args) {
        Account ac=new Account("Sajin",500);
        Account a1=new Account("Misba",450);
        Account a2=new Account("",50);
        Account a3=new Account("Adhil",-150);
    }
}