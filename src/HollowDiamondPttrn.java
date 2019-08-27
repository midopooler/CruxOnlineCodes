import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 14-Jul-2019
*/
public class HollowDiamondPttrn {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = (n / 2)+1;
		int nsp = -1;
		while (row <= n) {
			if (row == 1 || row == n) {
				for (int a = 1; a <= n; a++) {
					System.out.print("*"+"\t");
				}
			} else {
				int star = 1;
				int star2 =1;
				int space = 1;
				while (star <= nst) {
					System.out.print("*"+"\t");
					star++;
				}
				while (space <= nsp) {
					System.out.print(" "+"\t");
					space++;
				}
				while (star2 <= nst) {
					System.out.print("*"+"\t");
					star2++;
				}
			}
			System.out.println("");
			row++;
			if(row>=2 && row<=(n/2)+1) {
				nst--;
				nsp=nsp+2;
			}
			else {
				nst++;
				nsp=nsp-2;
			}

		}

	}

}
