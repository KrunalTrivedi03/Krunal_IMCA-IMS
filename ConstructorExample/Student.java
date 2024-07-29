package ConstructorExample;

public class Student {
	
	String name;
	int rollno;
	
	public Student(){
		
		this.name="Krunal Trivedi";
		this.rollno=56;
	}

	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}