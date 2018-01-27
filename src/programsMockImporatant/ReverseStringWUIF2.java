/**
 * Reversing string without using in build function
 * Using for loop
 * 
 */

package programsMockImporatant;

import java.util.Scanner;

public class ReverseStringWUIF2 {

	public static void main(String[] args) {
		String str;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		// 1. Using StringBuffer
		String rev = new StringBuffer(str).reverse().toString();

		System.out.println("Reverse of given string " + str + " is " + rev);

		// 2.Using reverseIterative

		System.out.println("Reverse of string using Iterative method is " + reverseIterativeMethod(str));

		// 3.Using Recursion METHOD
		System.out.println("Reverse of string using Recursion method is " + reverseRecursion(str));
		sc.close();
	}

	public static String reverseIterativeMethod(String str) {
		StringBuilder sb = new StringBuilder();
		char[] charArray = str.toCharArray();
		int charLength = charArray.length;
		for (int i = charLength - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		return sb.toString();

	}

	public static String reverseRecursion(String str) {
		if (str.length() < 2) {
			return str;
		}

		return reverseRecursion(str.substring(1)) + str.charAt(0);

	}

}
