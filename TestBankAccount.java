public class TestBankAccount {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount();

        acc1.transaction("deposit", "checking", 500);
        acc1.transaction("deposit", "savings", 500);
        acc1.transaction("withdrawal", "checking", 150);
        acc1.transaction("withdrawal", "savings", 50);

        acc1.allBal();


        BankAccount acc2 = new BankAccount();

        acc2.transaction("deposit", "checking", 2);
        acc2.transaction("deposit", "savings", 5);
        acc2.transaction("withdrawal", "checking", 15);
        acc2.transaction("withdrawal", "savings", 6);
        acc2.transaction("withdrawal", "savings", 6);
        

        acc2.allBal();
        
        System.out.println(BankAccount.numberOfAcct());
        System.out.println(BankAccount.totalMoney());

    }
}
