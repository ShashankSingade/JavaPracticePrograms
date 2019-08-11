package testPrograms;

import java.util.Scanner;

public class ScannerClass_InputCheck {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Please enter your name, age and Salary:");
		
		String name=obj1.nextLine();
		int age = obj1.nextInt();
		double salary = obj1.nextDouble();
		
		System.out.println("Your name is: " + name);
		System.out.println("Your age is: " + age);
		System.out.println("Your salary is: "+ salary);

	}

}
