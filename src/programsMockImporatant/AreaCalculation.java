package programsMockImporatant;

import java.util.Scanner;

public class AreaCalculation {

	public static void main(String[] args) {

		// variable for circle
		double r;
		// variable for square
		double s;
		// variable for rectangle
		double l, b;
		// variable for triangle
		double base, h;
		Scanner sc = new Scanner(System.in);
		// circle
		System.out.println("Enter the radius ");
		r = sc.nextDouble();
		System.out.println("The area of circle is: " + areaCircle(r));
		System.out.println("=========================");

		// square

		System.out.println("Enter the side value to find area of sqaure");
		s = sc.nextDouble();
		System.out.println("The are of square is: " + areaSquare(s));
		System.out.println("=============================");

		// rectangle
		System.out.println("Enter the value of lenght and beadth to find the value of rectangle");
		l = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Area of Rectangle is: " + areaRectangle(l, b));
		System.out.println("============================");

		// Triangle

		System.out.println("Enter the value of base and height to find the value of triangle");
		base = sc.nextDouble();
		h = sc.nextDouble();
		System.out.println("Area of triangle is: " + areaTriangle(base, h));

		// closing object
		sc.close();
	}

	static double areaCircle(double rad) {
		final double pi = 3.14;
		double area = pi * rad * rad;
		return area;
	}

	static double areaSquare(double side) {
		double area = side * side;
		return area;

	}

	static double areaRectangle(double length, double breadth) {
		double area = length * breadth;
		return area;

	}

	static double areaTriangle(double base, double height) {
		double area = base * height*1/2;
		return area;
	}
}
