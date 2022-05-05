public class TimeDepositAccount extends SavingsAccount {
    private int elapsedPeriods;           
    private int maturityPeriods;         
    private double interestPenaltyRate;  
    public TimeDepositAccount(double rate, double initialAmount, int maturity,
        double penalty) {
      super(rate, initialAmount);
      elapsedPeriods = 0;
      maturityPeriods = maturity;
      interestPenaltyRate = penalty;
    }
    public void addPeriodicInterest() {
      elapsedPeriods++;
      super.addPeriodicInterest();
    }
    public void withdraw(double amount) {
      if (elapsedPeriods < maturityPeriods)
        super.withdraw((interestPenaltyRate / 100) * elapsedPeriods * getBalance());
      super.withdraw(amount);
    }
  }