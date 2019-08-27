import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 15-Jun-2019
*/
public class Pattern32 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int var = 1;
		int star = 1;
		while (row <= 2 * n - 1) {

			int cst = 1;
			while (cst <= star) {
				if (cst % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(var);
				}
				cst = cst + 1;
			}
			System.out.println();

			if (row <= n - 1) {
				star = star + 2;
			} else {
				star = star - 2;
			}
			if (row <= n - 1) {
				var++;
			} else {
				var--;
			}
			row = row + 1;
		}
	}

}
