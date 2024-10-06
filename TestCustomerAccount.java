package BankJava;

public class TestCustomerAccount {
    public static void main(String[] args) {
        Account[] bankAccount = new Account[3];

        bankAccount[0] = new Account("Najib", 12345, 3000, AccountType.SAVINGS);
        bankAccount[1] = new Account("Najah", 12346, 4000, AccountType.CREDIT);
        bankAccount[2] = new Account("Najib", 12347, 5000, AccountType.DEPOSIT);

        System.out.println(bankAccount[0].getAccountName());
        System.out.println(bankAccount[0].getAccountNum());
        System.out.println(bankAccount[0].getBalance());
        System.out.println(bankAccount[0].getType());

    }

}
