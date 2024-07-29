package task;

public class Accounthandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount sa = new SavingAccount();
		CurrentAccount ca = new CurrentAccount();
		
		sa.deposit(7000);
		sa.withdraw(18000);
		
		ca.deposit(9000);
		ca.withdraw(27000);
		
	}

}
