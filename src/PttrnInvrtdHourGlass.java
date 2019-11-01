package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 17-Jul-2019
*/
public class PttrnInvrtdHourGlass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int star = 1;
		int star2 = 1;
		int space = 2 * n - 1;
		int row = 1;
		int var;

		while (row <= n + 1) {
			var = n;
			for (int cst = 1; cst <= star; cst++) {
				System.out.print(var + " ");
				var--;
			}
			for (int csp = 1; csp <= space; csp++) {
				System.out.print(" " + " ");
			}
			int cstt = 1;
			if (row == n + 1) {
				for (int x = 1; x <= n; x++) {
					System.out.print(x + " ");
				}
			} else {
				int varr = n - row + 1;
				for (; cstt <= star2; cstt++) {
					System.out.print(varr + " ");
					varr++;
				}
			}
			System.out.println("");
			star++;
			star2++;
			space = space - 2;
			row++;
		}

		int starr = n;
		int spacee = 1;

		int roww = 1;
		int par;
		int parr;
		while (roww <= n + 1) {
			par = n;
			for (int pst = 1; pst <= starr; pst++) {
				System.out.print(par + " ");
				par--;
			}

			for (int psp = 1; psp <= spacee; psp++) {
				System.out.print(" " + " ");
			}
			parr = roww;
			for (int pstt = 1; pstt <= starr; pstt++) {
				System.out.print(parr + " ");
				parr++;
			}
			System.out.println("");
			starr--;
			spacee = spacee + 2;
			roww++;
		}
	}
}