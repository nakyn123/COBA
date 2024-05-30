public class account {
    String accountNumber;
    double balance;
    String customerName;
    String email;
    String phoneNumber;

    account (String accountNumber, double balance, 
    String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    account (String accountNumber, double balance, String customerName, String email){
        this(accountNumber, balance, customerName, email, null);
    }

    account (String accountNumber, double balance, String customerName){
        this(accountNumber, balance, customerName, null);
    }

    account (String accountNumber, double balance){
        this(accountNumber, balance, null);
    }
    account (String accountNumber){
        this(accountNumber, 0);
    }
    account(){
        this(null);
    }
    void deposit(double amount){

    }
    void withdraw(double amount){

    }
    double getBalance(){
        return balance;
    }
}   
