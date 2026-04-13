class CurrentAccount extends BankAccount{        //Child Class 2
    private double overDraftLimit;
    CurrentAccount(String accountHolder,double balance,double overDraftLimit)
    {
        super(accountHolder, balance);
        this.overDraftLimit=overDraftLimit;
    }


    void withdraw(double amount)              //to withdraw thre overdraft amount
    {
     if(amount > 0 && (getBalance() + overDraftLimit) >= amount)
         {
            double newBalance = getBalance() - amount;
            updateBalance(newBalance);
            System.out.println("Withdrawn with overdraft. New balance: " + newBalance);
        } 
        else
             {
            System.out.println("Limit exceeded");
        }
    }
}
