import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 15-Jul-2019
*/
public class FibboTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int a = 0;
		int b = 1;

		while (a <= n) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(a);
//			for (int i = 1; i < n; i++) {
//				System.out.println("");
//			}
		}
		for (int i = 1; i < n; i++) {
			System.out.println("");
	}
	}

}
