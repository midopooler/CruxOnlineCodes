import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 13-Jun-2019
*/
public class ReverseNo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("enter a number");

		int n = scn.nextInt();
		int ans = 0;

		while (n != 0) {
			int rem = n % 10;
			//ans = ans * 10 + rem;
			n = n / 10;
			ans = ans * 10 + rem;
		}

		System.out.println(ans);
	}

}
