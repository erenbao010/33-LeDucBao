package OOP_java.ATM;

public abstract class Transaction {
    private int transactionId;
    private Account account;
    private double amount;

    public Transaction(int transactionId, Account account, double amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Account getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void execute();


    // Lớp con DepositTransaction

}
class depositTransaction extends Transaction {
    public depositTransaction(int transactionId, Account account, double amount) {
        super(transactionId, account, amount);
    }

    @Override
    public void execute() {
        Account account = getAccount();
        double amount = getAmount();

        account.deposit(amount);
        System.out.println("Gui thanh cong so tien "+ amount+"\n"+"So du hien tai: " + account.getBalance());
    }
}
class withdrawMoney extends Transaction {
    public withdrawMoney(int transactionId, Account account, double amount) {
        super(transactionId, account, amount);
    }

    @Override
    public void execute() {
        Account account = getAccount();
        double amount = getAmount();

        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println("Rut so tien "+ amount+ " thanh cong" +  " So du hien tai: " + account.getBalance());
        } else {
            System.out.println("Tai khoan khong du so tien");
        }
    }
}

