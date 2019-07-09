package Cafe;

enum Level{
	LOW,
	MEDIUM,
	HIGH	
}

public class Enum_MyClass {

	public static void main(String[] args) {
		
		for(Level obj1 : Level.values())
		{
			System.out.println(obj1);
		}
		
		Level obj1 = Level.HIGH;
		
		switch(obj1) {
			  case LOW:
				System.out.println("The level is too low");
				break;
			  case MEDIUM:
				System.out.println("The level is medium");  
				break;
			  case HIGH:
				System.out.println("The level is HIGH"); 
				break;
			default:
				System.out.println("Not really sure what the level is");
		}
		
		}

}
