package firstproject;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int rollno;
	private String name;
	
	
//	public void getdata() {
//		rollno = 56;
//		name = "Krunal";
//	}
//	
//	public void display() {
//		System.out.println(rollno + " " + name);
//	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + "]";
	}

	
	

}
