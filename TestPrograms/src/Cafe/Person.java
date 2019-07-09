package Cafe;

abstract class Person {
	String fname= "Shashank Singade";
	int age=32;
	
	abstract void study();

}

class Student extends Person{

	int graduationYear = 2009;
	
	public void study() {
		System.out.println("Shashank is attending selenium classes at MindQ institute in DSNR");
			}
	
}