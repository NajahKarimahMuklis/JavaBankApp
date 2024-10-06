package BankJava;

public class AbstractBankAccount extends Account {
    AbstractBankAccount(String name, int num, int amt, AccountType type){
        super(name, num, amt, type);
    }
    
    public static void main(String[] args) {
        AbstractBankAccount A1 = new AbstractBankAccount("Najah", 700, 7345, AccountType.CREDIT);
        System.out.println(A1);
    }
}
