package programsMockImporatant;

import java.util.Scanner;

public class MultiplicationWUOperator {
	public static void main(String[] args) {
		int n1, n2;
		int result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n1 = sc.nextInt();

		System.out.println("Enter the divisor");
		n2 = sc.nextInt();

		for (int i = 1; i <= n2; i++) {
			result = result + n1;

		}
		System.out.println(result);
		sc.close();
	}

}
