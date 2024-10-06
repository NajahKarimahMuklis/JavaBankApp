package BankJava;

public class TestCreditAccount {
    public static void main(String[] args) {
        AbstractBankAccount a1 = new AbstractBankAccount("Sanjay Gupta",11556,300, AccountType.SAVINGS);
        AbstractBankAccount a2 = new AbstractBankAccount("He Xai",22338,500, AccountType.SAVINGS);
        AbstractBankAccount a3 = new AbstractBankAccount("Ilya Mustafana",44559,1000, AccountType.SAVINGS);

        CreditAccount C1 = new CreditAccount("Nana", 7777, 15000, AccountType.CREDIT, 3000);
        CreditAccount C2 = new CreditAccount("Another",66778,1000, AccountType.CREDIT,500);

        a1.print();
        System.out.println("\n");
        a2.print();
        System.out.println("\n");
        a3.print();
        System.out.println("\n");
        C1.print();
        System.out.println("\n");
        C2.print();
        System.out.println("\n");

        for (AccountType act : AccountType.values()) {
            System.out.println("Value: " + act.name() + ", position: " + act.ordinal());
        }
    }
}
