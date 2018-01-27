
/**  Program to reverse no using buidin function
 *   StringBuffer is mutable whereas String is immutable
 *   StringBuffer has reverse function where as String is not having reverse ()
 */

package programsMockImporatant;

import java.util.Scanner;




public class ReverseNumberUIBF {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to reverse");
		int n = sc.nextInt();

		StringBuffer rev = new StringBuffer();
		String st = Integer.toString(n);

		int length = st.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev.append(st.charAt(i));
			/**
			 * Appends the string representation of the char argument to this sequence.
			 * 
			 * The argument is appended to the contents of this sequence. The length of this
			 * sequence increases by 1.
			 * 
			 * The overall effect is exactly as if the argument were converted to a string
			 * by the method String.valueOf(char), and the character in that string were
			 * then appended to this character sequence.
			 * 
			 */

		}
		System.out.println("The reverse of given no " + n + " is :  " + rev);

		sc.close();
	}

}
