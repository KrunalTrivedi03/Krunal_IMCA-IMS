package firstproject;

public class CarRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int CarId;
	private String CarType;
	private float Rent;
	public int getCarId() {
		return CarId;
	}
	public void setCarId(int carId) {
		CarId = carId;	
	}
	
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	public float getRent() {
		return Rent;
	}
	public void setRent(float rent) {
		Rent = rent;
	}
	
	public float ShowCar(String Type) {
		if(Type.equals("SUV"))
		{
			Rent = (float) 2500.00;
		}
		else if(Type.equals("Hatchback")) {
			Rent  = (float) 1000.00;
		}
		else if(Type.equals("Van"))
		{
			Rent = (float) 800.00;
		}
		return Rent;
	}
	
	public float GetcarRent() {
		ShowCar(CarType);
		return Rent;
	}
	

}
