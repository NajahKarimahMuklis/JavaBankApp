package BankJava;

public enum AccountType {
    SAVINGS("SA", 3.0),
    CREDIT("CR",4.5),
    DEPOSIT("DP",2.5);

    private String code;
    private double rate;

    AccountType(String code, double rate){
        this.code = code;
        this.rate = rate;
    }
    public String getCode(){
        return code;
    }
    public double getRate(){
        return rate;
    }

    public static void main(String[] args) {
        AccountType account = AccountType.DEPOSIT;
        System.out.println("Type: " + account.name() +"\nCode: " + account.getCode() +"\nRate: " + account.getRate());
    }

}
