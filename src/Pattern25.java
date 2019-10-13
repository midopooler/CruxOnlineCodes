package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 21-Jun-2019
*/
public class Pattern25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int space = n - 1;
		int star = 1;
		int var = 1;
		int row = 1;
		while (row <= n) {

			int csp = 1;
			while (csp <= space) {
				System.out.print("\t");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= star) {
				System.out.print(var + "\t");
				var++;
				cst = cst + 1;
			}
			System.out.println();
			star = star + 2;
			space = space - 1;
			
			row = row + 1;
		}

	}

}