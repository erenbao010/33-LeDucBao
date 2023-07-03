package OOP_java.ATM;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("123456789", 1000.0);
        ATM atm = new ATM(500.000, "VCB");

        // Kiểm tra số dư tài khoản
        atm.checkBalance(account);

        // Rút tiền
        double withdrawAmount = 500.0;
        Transaction withdrawwithdrawMoney = new withdrawMoney(1, account, withdrawAmount);
        withdrawwithdrawMoney.execute();

        // Gửi tiền
        double depositAmount = 200.0;
        Transaction depositTransaction = new depositTransaction(2, account, depositAmount);
        depositTransaction.execute();

        // Kiểm tra số dư sau khi rút và gửi tiền
        atm.checkBalance(account);
    }
}