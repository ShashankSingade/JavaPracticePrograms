package testPrograms;

abstract class Animal {
	public abstract void animal_sound();
	
	public void sleep()
	{
		System.out.println("The animal sleeps as Zzzz");
	}
	
}


class Pig extends Animal {
	
	public void animal_sound()
	{
		System.out.println("The pig cries : Wee wee");
		
	}
	
}

public class Abstraction_MyMainClass {

	public static void main(String[] args) {
		
		Pig myPig = new Pig();
		myPig.animal_sound();
		myPig.sleep();

	}

}
