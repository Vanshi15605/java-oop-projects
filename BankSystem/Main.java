public class Main              //Main Class
{                    
    public static void main(String[] args) {
 
        System.out.println("-- Savings Account --");
SavingsAccount s1=new SavingsAccount("Nidhi", 10000, 5);
s1.displayAccountDetails();
s1.deposit(1200);
s1.addInterest();
System.out.println("Your Current Balance is "+s1.getBalance());


System.out.println("-- Current Account --");
CurrentAccount c1=new CurrentAccount("Rohini", 700, 1000);
c1.displayAccountDetails();
c1.withdraw(1500);
   }
}
