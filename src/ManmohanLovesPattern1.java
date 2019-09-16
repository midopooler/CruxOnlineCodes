package patterns;

import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 11-Jul-2019
*/
public class ManmohanLovesPattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row=1;
		int one=1;
		int var=1;
		while(row<=n) {
			
			int cso = 1;
			while(cso<=one) {
				if(row%2==0 && row>=4 && cso!=1 && cso!=row ) {
					System.out.print("0");
				}
				else {
				System.out.print(var);
				}
				cso++;
			}
			System.out.println("");
			one++;
			row++;
			
			
			
			
		}

	}

}
