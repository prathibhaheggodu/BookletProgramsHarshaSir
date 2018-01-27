/**
 * Reversing string without using in build function
 * Using for loop
 * 
 */


package programsMockImporatant;

import java.util.Scanner;

public class ReverseStringWUIF {

	public static void main(String[] args) {
		String str, rev = "";
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();

		length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("Reverse of give string " + str + " is " + rev);
		sc.close();
	}

}
