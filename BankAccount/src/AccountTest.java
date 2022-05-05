public class AccountTest {
    public static void main(String[] args) {
      SavingsAccount momsSavings = new SavingsAccount(0.5);
      TimeDepositAccount collegeFund = new TimeDepositAccount(1.0, 10000.00, 3, 0.5);
      CheckingAccount harrysChecking = new CheckingAccount();
  
      momsSavings.deposit(10000.00);
  
      momsSavings.transfer(harrysChecking, 2000);
  
      harrysChecking.withdraw(200);
      harrysChecking.withdraw(300);
      harrysChecking.withdraw(80);
      harrysChecking.withdraw(400);
  
      endOfMonth(momsSavings);
      endOfMonth(collegeFund);
      endOfMonth(harrysChecking);
  
      collegeFund.transfer(harrysChecking, 980);
  
      System.out.println("Mom's savings. " + momsSavings);
      System.out.println("The college fund. " + collegeFund);
      System.out.println("Harry's checking. " + harrysChecking);
    }
    public static void endOfMonth(SavingsAccount savings) {
      savings.addPeriodicInterest();
    }
    public static void endOfMonth(CheckingAccount checking) {
      checking.deductFees();
    }
  }