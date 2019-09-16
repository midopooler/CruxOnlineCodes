package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 06-Jul-2019
*/
public class MnmhnLovePttrn1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int star = 2;
		int var = 1;
		int row = 1;
		System.out.println("1");
		while (row <= n-1) {

			int cst = 1;
			while (cst <= star) {
				if (cst == 1 || cst == row + 1) {
					System.out.print(var);
				} else {
					System.out.print("0");
				}
				cst = cst + 1;
			}
			System.out.println();
			star = star + 1;
		
			var++;
			row = row + 1;
		}

	}

}
