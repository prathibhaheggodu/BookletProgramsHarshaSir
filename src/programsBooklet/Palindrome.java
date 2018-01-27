package programsBooklet;

import java.util.Scanner;

// program to find the string is palindrome or not without using StringBuffer

public class Palindrome {

	public static void main(String[] args) {

		// varaiables 3---string reverse, length

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		} 
		System.out.println("Reverse of string is: " + rev);
	
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("String " + str + "is palindrome");

		} 
		else
			System.out.println("String " + str + " is not palindrome");
		sc.close();
	}
}