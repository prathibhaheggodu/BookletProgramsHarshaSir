package programsMockImporatant;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int first = 0, second = 1, next = 1;
		int maxnum;

		System.out.println("The first and second no are " + first + " and " + second);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maxnumber");
		maxnum = sc.nextInt();
		while( (first + second) <= maxnum) {
			next = first + second;
			first = second;
			second= next;
			System.out.println(next);

		}

		sc.close();
	}
}