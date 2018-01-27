package programsBooklet;

import java.util.Scanner;

public class AdamNumber {

	public static void main(String[] args) {

		// take the number --12===int a
		// find the square of the number--144===int sq
		// take the reverse of number 12, 21====int rev
		// find the square of the reversenumber of 21, 441 int revsq
		// take the reverse of of revsq ie 441 ==int revrsq
		// compare values

		int a, rev, sq, revsq, revrevsq;
		System.out.println("Enter the number to check adam or not: ");

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		AdamNumber an = new AdamNumber();
		sq = an.square(a);
		System.out.println("THE SQUARE OF GIVEN NUMBER" + a + "is: " + sq);

		rev = an.reverse(a);
		System.out.println("Reverse of given number" + a + "is:" + rev);

		revsq = an.square(rev);
		System.out.println("Square of reverse number is: " + revsq);

		revrevsq = an.reverse(revsq);
		System.out.println("Reverse of square of reverse number of " + revsq+ " is: " + revrevsq);

		if (sq == revrevsq)
			System.out.println("The given number is Adam number.....");
		else
			System.out.println("The given number in not a adam number");
        
		// closing object
		sc.close();
	}

	int square(int n) {
		return n * n;
		

	}

	int reverse(int num) {
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

}
