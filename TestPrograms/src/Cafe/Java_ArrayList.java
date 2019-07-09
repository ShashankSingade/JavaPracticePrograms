package Cafe;

import java.util.ArrayList;
import java.util.Collections;

public class Java_ArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> Cars = new ArrayList<String>();
		Cars.add("Honda");
		Cars.add("Volvo");
		Cars.add("Ford");
		Cars.add("Maruti Suzuki");
		Cars.add("Mahindra");
		
		Collections.sort(Cars);	
		
		System.out.println(Cars);
		System.out.println(Cars.get(0));
		System.out.println(Cars.set(2,"Chevy"));
		System.out.println(Cars);
	//	System.out.println(Cars.remove(4));
	//	System.out.println(Cars);
		System.out.println(Cars.size());
		
		
		
		for (int i=0;i<Cars.size();i++)
			System.out.println("This car is from the brand: "+ Cars.get(i));
		
	
		
		}
	
}
