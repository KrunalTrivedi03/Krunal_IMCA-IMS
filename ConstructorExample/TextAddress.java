package ConstructorExample;
import java.io.*;

public class TextAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address ad = new Address();
		
		ad.setSocietyName("Kalasagar Heights");
		System.out.println(ad);
		

		Address ad1 = new Address("New Ranip","Ahmedabad", 382480);
		System.out.println(ad1);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter SocietyName: ");
		String socname;
		
		try {
			socname = br.readLine();
			ad.setSocietyName(socname);
			
			int pin = Integer.parseInt(br.readLine());
			ad.setPincode(pin);
			System.out.println(ad);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}