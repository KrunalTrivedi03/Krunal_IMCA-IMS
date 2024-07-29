package home;

public class BookDemo {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author name = new Author("Vijay","Lokapally");
		Book detail = new Book("The Hitman: The Rohit Sharma Story",name,250.00);
		System.out.println(detail);
	
	}
}