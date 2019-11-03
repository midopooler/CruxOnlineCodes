package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 16-Jul-2019
*/
public class PttrnNosStr1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int no = n;
		int star = -1;
		int var;
		int row = 1;
		while (row <= n) {
			var = 1;

			int cst = 1;
			while (cst <= no) {
				System.out.print(var + " ");
				var++;
				cst = cst + 1;
			}

			int cstt = 1;
			while (cstt <= star) {
				System.out.print("*" +" ");
				cstt++;
			}

			System.out.println();
			no--;
			star = star + 2;

			row = row + 1;
		}

	}

}