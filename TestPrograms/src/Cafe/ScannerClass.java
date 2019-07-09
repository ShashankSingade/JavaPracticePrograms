package Cafe;


import java.util.Scanner;

public class ScannerClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the username");
		
	    String username = obj1.nextLine();	
		System.out.println("The username is: " + username);
	
	}
}
