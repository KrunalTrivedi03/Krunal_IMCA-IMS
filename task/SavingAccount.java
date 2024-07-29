package task;

public class SavingAccount extends BankAccount{
	
	private double bal = 30000;

	@Override
	public void deposit(double add) {
		
		double ad = bal+add;
		System.out.println("Saving a/c Total Balance(deposit): "+ ad);
		
	}

	@Override
	public void withdraw(double sub) {
		
		double sb = bal-sub;
		System.out.println("Saving a/c Total Balance(Withdraw): "+ sb);
		
	}

}
