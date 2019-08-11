package testPrograms;

interface Animal2{
	public void animalSound();
	public void sleep2();
	
}

class Pig2 implements Animal2{
	
	public void animalSound(){
		
		System.out.println("The pig says wee wee");
	}
	
	public void sleep2(){
		System.out.println("The animal sleeps Zzzzz");
	}
	
}

public class Interface_MyMainClass {

	public static void main(String[] args) {
		
		Pig2 myPet = new Pig2();
		
		myPet.animalSound();
		myPet.sleep2();
		}

}
