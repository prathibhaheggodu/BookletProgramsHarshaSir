package programsMockImporatant;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate Factorial");
		num = sc.nextInt();

		System.out.println("The factorial of  number " + num + " is :" + fact(num));
		sc.close();
	}

	public static int fact(int n)

	{
		if (n == 1)
			return 1;
		
		else
			return n * (fact(n - 1));
	}
}
