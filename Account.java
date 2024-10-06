package BankJava;

public class Account extends BankAccount {
    private int bonusValue;
    private AccountType type;

    public Account(String name, int num, int amt, AccountType type){
        super(name, num, amt);
        this.bonusValue = calculateBonusValue(amt);
        this.type = type;
    }

    private int calculateBonusValue(int amt){
        return amt / 10;
    }

    public AccountType getType() {
        return type;
    }

    public void print(){
        super.print();

        System.out.print("Account Type: " + getType() + ", Account Code: " + type.getCode());
    }

    @Override
    public String toString() {
        return "Account: " + accountName + ", Number: " + accountNum + ", Balance: " + balance;
    }

    public static void main(String[] args) {
        Account account = new Account("Najah", 7213, 2000, AccountType.SAVINGS);
        account.print();
    }

}
