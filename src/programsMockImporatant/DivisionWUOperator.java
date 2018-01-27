package programsMockImporatant;

import java.util.Scanner;

public class DivisionWUOperator {
	public static void main(String[] args) {
		int num, divisor;
		int result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();

		System.out.println("Enter the divisor");
		divisor = sc.nextInt();

		while ((num - divisor) >= 0) {
			result++;
			num = num - divisor;
		}
		System.out.println(result);
		sc.close();
	}

}
