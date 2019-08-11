package testPrograms;

interface FirstInterface
{
	public void firstMethod();
	
}

interface secondInterface
{
	public void secondMethod();
}


class DemoClass implements FirstInterface, secondInterface{
	
	public void firstMethod()
	{
		System.out.println("First method text");
	}
	
	public void secondMethod()
	{
		System.out.println("Second method text");
	}
}

public class Interface_MyMainClass2 {

	public static void main(String[] args) {
		
		DemoClass obj1 = new DemoClass();
		obj1.firstMethod();
		obj1.secondMethod();
		
		System.out.println("Both the methods have been executed successfully");

	}

}
