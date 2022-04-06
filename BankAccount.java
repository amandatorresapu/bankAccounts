public class BankAccount {

        private double checkingBal; 
        private double savingsBal;
        static int numOfAccounts;
        static double totalMonies;
        public static int numberOfAccounts =0;

    public BankAccount(){
        numberOfAccounts++;
        
    }


    public BankAccount(int numOfAccountsParam, double totalMoniesParam){
        numOfAccounts = numOfAccountsParam;
        totalMonies = totalMoniesParam;
        numberOfAccounts++;



    }

public static int numberOfAcct(){
    return numberOfAccounts;
}

public static double totalMoney(){
    return totalMonies;
}

public void transaction(String type, String account, int amt) {
        if(type == "deposit") {

            if(account == "checking") {
                this.checkingBal += amt;
                System.out.println("You have made a deposit to your checking account in the amount of " + amt + ". Your current checking balance is now " + this.checkingBal);
            }
            else if (account == "savings") {
                this.savingsBal += amt;
                System.out.println("You have made a deposit to your savings account in the amount of " + amt + ". Your current savings balance is now " + this.savingsBal);
            }
            else {
                System.out.println("Must enter either checking or savings to make a deposit!");
            }
            totalMonies+=amt;

        }
        else if(type == "withdrawal") {
            if(account == "checking") {
                if(this.checkingBal < amt) {
                    System.out.println("Ah ah ah!! You don't get thee monies that you don't have!");
                    return;
                }
                this.checkingBal -= amt;
                System.out.println("You have taken monies from your checking account in the amount of " + amt + ". Your current checking balance is now " + this.checkingBal);
            }
            else if (account == "savings") {
                if(this.savingsBal < amt) {
                    System.out.println("Ah ah ah!! You don't get thee monies that you don't have!");
                    return;
                }
                this.savingsBal -= amt;
                System.out.println("You have taken monies from your savings account in the amount of " + amt + ". Your current savings balance is now " + this.savingsBal);
            }
            else {
                System.out.println("Must enter either checking or savings to make a taking monies out!");
            }
            totalMonies-=amt;
        }
        else {
            System.out.println("Must enter deposit or withdrawal in order to complete transaction");
        }
    }

// deposit
    public void deposit(String account, int amt){
        if(account == "checking"){
        this.checkingBal += amt;
        System.out.println("You have made a deposit to your checing accoutn in the about of" + amt + ". your current checking balance is now" + this.checkingBal);
        }
        else if (account == "savings"){
        this.savingsBal += amt;
        System.out.println("You have made a deposit to your checing accoutn in the about of" + amt + ". your current checking balance is now" + this.savingsBal);
        }
        else {
            System.out.println("Must enter either check or saving to make a depsisit");
        }
        
    }

// withdraw
    public void withdraw(String account, int amt){
        if(account == "checking"){
        this.checkingBal -= amt;
        System.out.println("You have made a wtihdraw to your checing accoutn in the about of" + amt + ". your current checking balance is now" + this.checkingBal);
        }
        else if (account == "savings"){
        this.savingsBal -= amt;
        System.out.println("You have made a wtihdrawr to your checing accoutn in the about of" + amt + ". your current checking balance is now" + this.savingsBal);
        }
        else {
            System.out.println("Must enter either check or saving to make a depsisit");
        }
        
    }

    // See both checing and saving balances
    public void allBal(){
        double all = this.checkingBal + this.savingsBal;
        System.out.println("Total Balance from both checkings and savings: " + all);

    }

    // ---------------------getters and setters-------------------------------

    // setter for checking balance
    public void setCheckingBal(double amt){
        this.checkingBal = amt;
    }

    public void setSavingsBal(double amt ) {
        this.savingsBal = amt;
    }

    // setter for savings balance
    public double getCheckingBal(){
        System.out.println("Total Balance from both checkings  " + this.checkingBal);
        return this.checkingBal;
    }

    public double getSavingsBal(){
        System.out.println("Total Balance from  savings: " + this.savingsBal);
        return this.savingsBal;
    }


}