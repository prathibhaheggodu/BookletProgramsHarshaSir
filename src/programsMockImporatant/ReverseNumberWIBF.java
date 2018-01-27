package programsMockImporatant;

import java.util.Scanner;

public class ReverseNumberWIBF {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to reverse");
		n = sc.nextInt();

		System.out.println("Reverse of given number " + n + " is: " + reverseNO(n));

		sc.close();
	}

	public static int reverseNO(int n) {
		int rem = 0, rev = 0;
		while (n > 0) {
			rem = n % 10;
			rev = rem + rev * 10;
			n /= 10;
		}
		return rev;
	}

}
