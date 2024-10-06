package BankJava;

public class BankAccount {

    protected String accountName;
    protected int accountNum;
    protected int balance;

    public BankAccount() {
        this.accountName = "EMPTY";
        this.accountNum = 0;
        this.balance = 0;
    }

    public BankAccount(String name, int num, int amt) {
        this.accountName = name;
        this.accountNum = num;
        this.balance = amt;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        if (amt <= balance) {  // Cek jika cukup saldo
            balance -= amt;
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan penarikan.");
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void print() {
        System.out.println("Account: " + accountName + ", Number: " + accountNum + ", Balance: " + balance);
    }




}

