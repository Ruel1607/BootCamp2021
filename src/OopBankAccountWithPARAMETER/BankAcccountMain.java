package OopBankAccountWithPARAMETER;

public class BankAcccountMain {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setName("RUEL LACABA");
        acc.setAccountNumber(23112312);
        acc.setEmail("Ruel.lacabaph@gmail.com");
        acc.setTelephoneNumber("099432432432");
        acc.setBalance(20000);

        acc.withdraw(7000);
        acc.deposit(5000);
        acc.withdraw(7000);
        acc.withdraw(7000);
        acc.withdraw(3000);

        System.out.println("NAME: " + acc.getName());
        System.out.println("ACCOUNT NUMBER: " + acc.getAccountNumber());
        System.out.println("EMAIL ADDDRESS: " + acc.getEmail());
        System.out.println("TELEPHONE NUMBER: "+ acc.getTelephoneNumber());
        System.out.println("BALANCE: " + acc.getBalance());

        System.out.println("###################################################################");

        Account ruel = new Account("Ruel Lacaba", 20000);


        System.out.println("NAME : " + ruel.getName());
        ruel.withdraw(5000);
        System.out.println("BALANCE: " + ruel.getBalance());







    }
}
