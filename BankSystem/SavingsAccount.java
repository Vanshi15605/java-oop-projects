class SavingsAccount extends BankAccount      //Child Class 1
{
  private double interestRate;
  SavingsAccount(String accountHolder,double balance,double interestRate)
  {
    super(accountHolder, balance);
    this.interestRate=interestRate;
  }


  void addInterest()                  //to add the interest amount
  {
    if(interestRate>0)
 {
    double interest=getBalance()*interestRate/100;
deposit(interest);   
}  

else
    System.out.println("Invalid interest rate");
  }
}
