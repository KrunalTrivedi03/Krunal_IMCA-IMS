package constructor_inheritance;

public class Vehicle {
	
	private String comp;

	public Vehicle() {
		this.comp = "Toyota";
	}

	@Override
	public String toString() {
		return "Vehicle [comp=" + comp + "]";
	}
	
	

}
