package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 21-Jun-2019
*/
public class patternmountain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = 1;
		int starr = 1;
		int space = 2 * n - 3;
		int row = 1;
		int var;

		while (row <= n) {
			var = 1;
			for (int cst = 1; cst <= star; cst++) {
				System.out.print(var + "\t");
				var++;
			}
			for (int csp = 1; csp <= space; csp++) {
				System.out.print(" "+"\t");
			}
			int cstt = 1;
			if (row == n) {
				for (int x = n - 1; x >= 1; x--) {
					System.out.print(x+ "\t");
				}
			} else {
				int varr = row;
				for (; cstt <= starr; cstt++) {
					System.out.print(varr + "\t");
					varr--;
				}
			}

			System.out.println("");

			star++;
			starr++;
			space = space - 2;
			row++;
		}
	}
}
