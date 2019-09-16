package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 09-Jul-2019
*/
public class HollowRhombus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int space = n - 1;

		while (row <= n) {

			if (row == 1) {
				for (int j = 1; j <= n - 1; j++) {
					System.out.print(" ");
				}
				for (int i = 2; i <= n; i++) {
					System.out.print("*");
				}
			} else if (row == n) {
				for (int k = 2; k <= n; k++) {
					System.out.print("*");
				}
			}

			else {
				for (int csp = 1; csp <= space; csp++) {
					System.out.print(" ");

				}
				System.out.print("*");

				int innspace = 1;
				while (innspace <= n - 2) {
					System.out.print(" ");
					innspace++;
				}
			}
			System.out.println("*");
			row++;
			space--;
		}

	}

}
