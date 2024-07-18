package firstproject;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private String name,designation,email,salary,address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", email=" + email + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	
	

}
