package programsBooklet;

import java.util.Scanner;

// program to find the string is palindrome  using StringBuffer

public class Palindrome2 {

	public static void main(String[] args) {

		// varaiables 3---string reverse, length

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String rev=new StringBuffer(str).reverse().toString();
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("String " + str + "is palindrome");

		} 
		else
			System.out.println("String " + str + " is not palindrome");
		sc.close();
	}
}