package OopBankAccountWithPARAMETER;

public class Account {

    private String name;
    private String email;
    private String telephoneNumber;
    private int accountNumber;
    private double balance;


    public Account(){

    }
    public Account(String name , double balance){
        this.balance = balance;
        this.name = name;

    }
    public void deposit(double dep){
        this.balance += dep;
        System.out.println("Deposit of " + dep + " made new Balance " + this.balance);
    }

    public void withdraw(double withdrawAmount){
        this.balance -= withdrawAmount;
        System.out.println("WITHDRAW  of " + withdrawAmount + " made new Balance " + this.balance);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance ;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
