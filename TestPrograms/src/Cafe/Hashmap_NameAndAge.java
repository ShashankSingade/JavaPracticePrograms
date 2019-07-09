package Cafe;

import java.util.HashMap;

public class Hashmap_NameAndAge {

	public static void main(String[] args) {

	HashMap<String,Integer> NameAndAge= new HashMap<String,Integer>();
		NameAndAge.put("Shashank",32);
		NameAndAge.put("Deepika", 30);
		NameAndAge.put("Arun", 30);
		
		
		for( String i : NameAndAge.keySet())
			System.out.println("Name:" + i + " " + "Age: " + NameAndAge.get(i));
		
	}

}
