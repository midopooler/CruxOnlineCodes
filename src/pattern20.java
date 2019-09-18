package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 21-Jun-2019
*/
public class pattern20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int space = n / 2;
		int star = 0;

		int row = 1;
		while (row <= n) {

			int csp = 1;
			while (csp <= space) {
				System.out.print(" ");
				csp++;
			}
			System.out.print("*");

			int cspp = 2;
			while (cspp <= star) {
				System.out.print(" ");
				cspp++;
			}
			if (row == 1 || row == n) {
				System.out.print("");
			} else {
				System.out.print("*");
			}
			System.out.println();
			if (row <= n / 2) {
				space--;
				star = star + 2;
			} else {
				space++;
				star = star - 2;
			}
			row++;
		}
	}

}
