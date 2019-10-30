package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 18-Jul-2019
*/
public class PttrnDoubleArrow {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int space = n - 1;
		int no = 1;

		int var;
		int varr;
		int spacee = -1;
		// int row=1;
		while (row <= n) {
			for (int csp = 1; csp <= space; csp++) {
				System.out.print("  ");
			}
			int cn = 1;
			if (row <= (n / 2) + 1) {
				var = row;
			} else {
				var = n - row + 1;
			}
			while (cn <= no) {
				System.out.print(var+" ");
				var--;
				cn++;
			}
			for (int cspp = 1; cspp <= spacee; cspp++) {
				System.out.print("  ");
			}
			int cnn = 0;
			varr = 1;
			if (row == 1 || row == n) {

			} else {
				while (cnn < no) {
					System.out.print(varr+" ");
					varr++;
					cnn++;
				}
			}
			System.out.println("");
			row++;
			if (row <= (n / 2) + 1) {
				space = space - 2;
			} else {
				space = space + 2;
			}
			if (row <= (n / 2) + 1) {
				no = no + 1;
			} else {
				no = no - 1;
			}
			if (row <= (n / 2) + 1) {
				spacee = spacee + 2;
			} else {
				spacee = spacee - 2;
			}
		}
	}

}
