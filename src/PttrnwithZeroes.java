
import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 06-Jul-2019
*/
public class PttrnwithZeroes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		
		int var = 1;
		int row = 1;		
		int star=1;	
		while (row <= n) {

			int cst = 1;
			while (cst <= star) {
				if (cst == 1 || cst == row) {
					System.out.print(var + "\t");
				} else {
					System.out.print("0"+"\t");
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
