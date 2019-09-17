package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 20-Jun-2019
*/
public class pattern17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int star= n/2;
		int space= 1;
		
		int row=1;
		while(row<=n) {
			
			int cst=1;
			while(cst<=star) {
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=space) {
				System.out.print(" ");
				csp = csp+1;
			}
			int cstt=1;
			while(cstt<=star) {
				System.out.print("*");
				cstt++;
			}
			
			System.out.println();
			
			if(row<= n/2) {
				star--;
				space = space+2;
			}
			else {
				star++;
				space = space-2;
			}
			
			row++;
			
			
		}

	}

}
