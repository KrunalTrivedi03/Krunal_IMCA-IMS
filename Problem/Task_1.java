package Problem;

class Student{
	
	String firstname;
	String lastname;
	int classyear;
	String major;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getClassyear() {
		return classyear;
	}
	public void setClassyear(int classyear) {
		this.classyear = classyear;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student sc= new Student();
		
		sc.setClassyear(2026);
		sc.setFirstname("Krunal");
		sc.setLastname("Trivedi");
		sc.setMajor("Java");
		
		System.out.println(sc.getFirstname());
		System.out.println(sc.getLastname());
		System.out.println(sc.getClassyear());
		System.out.println(sc.getMajor());
	}

}
