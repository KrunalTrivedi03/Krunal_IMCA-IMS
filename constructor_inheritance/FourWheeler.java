package constructor_inheritance;

public class FourWheeler extends Vehicle{

	private String fuel_type;

	public FourWheeler() {
		super();
		this.fuel_type = "Diesel";
	}

	
	
	public FourWheeler(String fuel_type, String cm) {
		super();
		this.fuel_type = fuel_type;
	}



	@Override
	public String toString() {
		return "FourWheeler [fuel_type=" + fuel_type + super.toString() + "]";
	}
	
}
