package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 21-Jun-2019
*/
public class Pattern22 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int j = 1; j <= 2 * n - 1; j++) {
			System.out.print("*");
		}
		System.out.println("");
		int star = n - 1;
		int space = 1;

		int row = 1;
		while (row <= n) {

			for (int cst = 1; cst <= star; cst++) {
				System.out.print("*");
			}

			for (int csp = 1; csp <= space; csp++) {
				System.out.print(" ");
			}

			for (int cstt = 1; cstt <= star; cstt++) {
				System.out.print("*");
			}

			System.out.println("");
			star--;
			space = space + 2;
			row++;
		}
	}

}
