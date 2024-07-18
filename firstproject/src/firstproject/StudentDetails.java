package firstproject;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		stu.getdata();
		stu.display();
		
		Student1 s11 = new Student1();
		s11.setRollno(56);
		System.out.println(s11.getRollno());
		s11.setName("Krunal S Trivedi");
		System.out.println(s11.getName());
		
		System.out.println(s11);
	}

}
