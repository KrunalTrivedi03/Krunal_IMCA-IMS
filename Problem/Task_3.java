package Problem;

class BankCustomer {
	  String firstName;
	  String lastName;

	  BankCustomer (String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	@Override
	public String toString() {
		return "BankCustomer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	  
	  
	}


class BankAccount {
	  BankCustomer forCust;
	  double balance;
	  
	  BankAccount (BankCustomer forCust, double balance) {
	    this.forCust = forCust;
	    this.balance = balance;
	  }

	@Override
	public String toString() {
		return "BankAccount [forCust=" + forCust + ", balance=" + balance + "]";
	}
	  
	  
	  
	}

public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankCustomer sc = new BankCustomer("Krunal","Trivedi");
		BankAccount ac = new BankAccount(sc,350000);
		
		System.out.println(ac);
	}

}
