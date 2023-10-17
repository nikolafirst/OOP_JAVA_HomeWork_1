public class Bank {
    public static void main(String[] args) {
        Account account = new Account(1000);
        account.put(500);
        account.take(200);
        System.out.println("Текущий баланс: " + account.getAmount());

        System.out.println();

        CreditAccount creditAccount = new CreditAccount(1000);
        creditAccount.put(500);
        creditAccount.take(200);
        System.out.println("Текущий баланс: " + creditAccount.getAmount());

        System.out.println();

        DepositAccount depositAccount = new DepositAccount(1000);
        depositAccount.put(500);
        depositAccount.take(200);
        System.out.println("Текущий баланс: " + depositAccount.getAmount());
    }
}
