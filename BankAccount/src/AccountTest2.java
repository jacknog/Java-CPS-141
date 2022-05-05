public class AccountTest2 {
    public static void main(String[] args) {
      BankAccount momsSavings = new SavingsAccount(0.5);
      BankAccount collegeFund = new TimeDepositAccount(1.0, 10000.00, 3, 0.5);
      BankAccount harrysChecking = new CheckingAccount();
  
      momsSavings.deposit(10000.00);
  
      momsSavings.transfer(harrysChecking, 2000);
  
      harrysChecking.withdraw(200);
      harrysChecking.withdraw(300);
      harrysChecking.withdraw(80);
      harrysChecking.withdraw(400);
  
      endOfMonth((SavingsAccount) momsSavings);
      endOfMonth((TimeDepositAccount) collegeFund);
      endOfMonth((CheckingAccount) harrysChecking);
  
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