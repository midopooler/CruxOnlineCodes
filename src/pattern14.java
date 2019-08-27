import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 19-Jun-2019
*/
public class pattern14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int space = n - 1;
		int star = 1;

		int row = 1;
		while (row <= 2*n -1) {

			int csp = 1;
			while (csp <= space) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= star) {
				System.out.print("*");
				cst = cst + 1;
			}
			System.out.println();

			if (row <= n-1) {
				star = star + 1;
				space = space - 1;
			}
			else {
				star = star - 1;
				space = space + 1;
			}
			row = row + 1;
		}

	}

}
