class BankAccount             //Parent Class
{
    private String accountHolder;
    private double balance;
    BankAccount(String accountHolder,double balance)
    {
        this.accountHolder=accountHolder;

        if(balance>=0)
        this.balance=balance;
    
        else
        {
            this.balance=0;
            System.out.println("Invalid balance entered");
        }
    }


    void deposit(double amount)      //to deposite the given amount
    {
        if(amount>0)
        {
     this.balance=this.balance+amount;
    System.out.println("Amount deposited successfully");    
    }

       else
        System.out.println("Invalid amount");
    }


    void withdraw(double amount)       //to withdraw the given amount
    {
        if(amount<=this.balance && amount>0)
            {
        this.balance=this.balance-amount;
    System.out.println("Amount withdrawn successfully");    
    }

    else
        System.out.println("Invalid withdraw amount");
    }


    double getBalance()              //to get the balance
    {
        return this.balance;
    }


    void displayAccountDetails()         //to display account details
    {
        System.out.println("Account holder :"+accountHolder);
        System.out.println("Account balance :"+getBalance());
    }


    protected void updateBalance(double newBalance)       //to update new balance
    {
        this.balance=newBalance;
    }
}

