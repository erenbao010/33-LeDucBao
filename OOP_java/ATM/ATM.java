package OOP_java.ATM;

public class ATM {
    private double cashInMachine;
    private String bankName;

    public ATM(double cashInMachine, String bankName) {
        this.cashInMachine = cashInMachine;
        this.bankName = bankName;
    }

    public void checkBalance(Account account) {
        System.out.println("Name Account: " + account.getAccountNumber());
        System.out.println("Số dư " + account.getBalance());
    }
}