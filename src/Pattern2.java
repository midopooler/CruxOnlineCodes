import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 15-Jun-2019
*/
public class Pattern2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int star = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= star) {
				System.out.print("*");

				cst = cst + 1;
			}
			System.out.println();
			star = star + 1;
			row = row + 1;
		}
	}

}
