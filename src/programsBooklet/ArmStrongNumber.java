package programsBooklet;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		// armstrong number n=371
		// 3cube+7cube+1cube=371

		int n, sum = 0, temp, r;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for armstrong number");
		n = sc.nextInt();
		temp = n;
		while (temp > 0) {
			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}

		if (n == sum)
			System.out.println("The given number is armstrong number");
		else
			System.out.println("The given number is not an armstrong number");
     
		 // closing object
		sc.close();
	} 
}