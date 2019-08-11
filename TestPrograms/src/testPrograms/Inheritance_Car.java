package testPrograms;

class Vehicle{
	protected String brand = "Honda";
	
	public void honk(){
		
		System.out.println("My car honks huut huut");
	}
	
}


public class Inheritance_Car extends Vehicle {

	private String modelname = "Accord";
	
	public static void main(String[] args) {
		
		Inheritance_Car obj1 = new Inheritance_Car();
	
		System.out.println("My car brand name is: " + obj1.brand);
		System.out.println("My car model name is: "+ obj1.modelname);
		obj1.honk();
	}

}
