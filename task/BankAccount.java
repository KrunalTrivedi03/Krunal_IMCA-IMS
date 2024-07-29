//Write a java program to create an abstract class BankAccount with abstract methods deposit() and withdraw()

//Create Subclasses: SavingAccount and CuthrrentAccount that extends the BankAccount class and implement the 
//respective methods to handle deposits and withdrawals for each account type.

package task;

public abstract class BankAccount {

	public abstract void deposit(double add);
	
	public abstract void withdraw(double sub);	
	
	
}
