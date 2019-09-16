package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 20-Jun-2019
*/
public class pattern15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int star=n;
		int space=0;
		
		int row=1;
		while(row<=2*n -1) {
		
			int csp=1;
			while(csp<=space) {
				System.out.print("  ");
				csp = csp + 1;
			}
			
			
			int cst=1;
			while(cst<=star) {
				System.out.print("*");
			cst++;
			}	
			System.out.println();
			
			if(row<=n-1) {	
			star--;
			space++;
			}
			else {
				star++;
				space--;
			}
			row++;
		}
		
		

	}

}
