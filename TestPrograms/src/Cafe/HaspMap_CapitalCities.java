package Cafe;

import java.util.HashMap;

public class HaspMap_CapitalCities {

	public static void main(String[] args) {

		HashMap<String,String> CapitalCities = new HashMap<String,String>();
		CapitalCities.put("India", "New Delhi");
		CapitalCities.put("Andhra Pradesh", "Amaravathi");
		CapitalCities.put("Telangana","Hyderabad");
		CapitalCities.put("Maharashtra", "Mumbai");
		CapitalCities.put("Karnataka", "Bengaluru");
		CapitalCities.put("TamilNadu", "Chennai");
		
		System.out.println(CapitalCities);
		System.out.println(CapitalCities.get("Telangana"));
		
		
	//	for (String i: CapitalCities.keySet())
	//		System.out.println(i);
		
	//	for (String j: CapitalCities.values())
	//		System.out.println(j);

		for (String k: CapitalCities.keySet())
			System.out.println( k + " " + CapitalCities.get(k));
		
	}

}
