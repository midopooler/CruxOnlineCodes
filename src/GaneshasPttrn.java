package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 16-Jul-2019
*/
public class GaneshasPttrn {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
//part1		
		System.out.print("*");
		for (int a = 0; a < (n / 2) - 1; a++) {
			System.out.print(" ");
		}
		for (int b = 0; b < (n / 2) + 1; b++) {
			System.out.print("*");
		}
		System.out.println("");
//part2
		int row1 = 1;
		while (row1 <= (n / 2) - 1) {
			System.out.print("*");
			for (int a = 0; a < (n / 2) - 1; a++) {
				System.out.print(" ");
			}
			System.out.println("*");
			row1++;
		}
//part3
		for (int c = 1; c <= n; c++) {
			System.out.print("*");
		}
		System.out.println("");
//part4
		int row2 = 1;
		while (row2 <= (n / 2) - 1) {
			for (int d = 0; d < n / 2; d++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int a = 0; a < (n / 2) - 1; a++) {
				System.out.print(" ");
			}

			System.out.println("*");
			row2++;
		}
//part5
		for (int c = 1; c <= (n / 2) + 1; c++) {
			System.out.print("*");
		}
		for (int a = 0; a < (n / 2) - 1; a++) {
			System.out.print(" ");
		}
		System.out.print("*");
	}

}
