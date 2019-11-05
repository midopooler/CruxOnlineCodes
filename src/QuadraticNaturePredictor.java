package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 11-Jul-2019
*/
public class QuadraticNaturePredictor {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter a");
		int a = scn.nextInt();
		// System.out.println("enter b");
		int b = scn.nextInt();
		// System.out.println("enter c");
		int c = scn.nextInt();

		int D = (b * b) - 4 * a * c;

		if (D > 0) {
			System.out.println("Real and Distinct");
		} else if (D < 0) {
			System.out.println("Imaginary");
		} else {
			System.out.println("Real and Equal");
		}
		double root1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (4 * a);
		double root2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (4 * a);
		if (D >= 0) {
			System.out.println(root1);
			System.out.println(root2);
		} else {
			System.out.println("");
		}

	}
}
