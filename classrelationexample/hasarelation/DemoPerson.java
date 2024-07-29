package classrelationexample.hasarelation;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address add = new Address();
		add.setFlatno("803");
		add.setSocname("Kalasagar Heights");
		add.setArea("New Ranip");
		add.setpincode(382480);
		
		Person p1 = new Person();
		p1.setPname("Krunal");
		p1.setPemail("krunaltrvd2003@gmail.com");
		p1.setAdd(add);
		
		System.out.println(p1);
	}

}
