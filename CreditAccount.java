package BankJava;

public class CreditAccount extends Account {
    int CreditLimit;

    CreditAccount(String name, int num, int amt, AccountType type, int credit){
        super(name, num, amt, type);
        this.CreditLimit = credit;
    }

    @Override
    public String toString() {
        return " " + accountName + ", "+ accountNum ;
    }
}
