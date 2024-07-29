package Problem;

public class StudentName {
	
	public String firstname, lastname;	

	public StudentName(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

    public StudentName() {
        this.firstname = "Unknown";
        this.lastname = "Unknown";
    }

	@Override
	public String toString() {
		return "StudentName [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
