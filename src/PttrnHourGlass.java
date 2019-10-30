package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 17-Jul-2019
*/
public class PttrnHourGlass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int space = 0;
		int star = 2 * n + 1;
		int var;
		int row = 1;
		while (row <= n) {
			
			var = n+1 - row;
			int csp = 1;
			while (csp <= space) {
				System.out.print(" "+" ");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= star) {
				System.out.print(var+" ");
				cst = cst + 1;
			if(cst<=n+2-row) {
				var--;
			}
			else {
				var++;
			}
			}
			System.out.println();
			star = star - 2;
			space = space + 1;
			row = row + 1;
		
		}
		int spacee = n ;
		int starr = 1;
		int p = 0;
		int roww = 0;
		while (roww <= n) {
			int varr = p;
			int cspp = 1;
			while (cspp <= spacee) {
				System.out.print(" "+" ");
				cspp = cspp + 1;
			}

			int cstt = 1;
			while (cstt <= starr) {
				System.out.print(varr+" ");
				if (cstt <= (starr / 2)) {
					varr--;
				} else {
					varr++;
				}
				cstt = cstt + 1;
			}
			System.out.println();
			starr = starr + 2;
			spacee = spacee - 1;
			p++;
			roww = roww + 1;
		}

	}

}
