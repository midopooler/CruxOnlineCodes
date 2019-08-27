import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 15-Jul-2019
*/
public class PrimeDetector {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=2;
		if(n%i!=0) {
			while(i<n-2) {
				i++;
			}
			System.out.println("Prime");
		}
		else {
			System.out.println("Non Prime");
		}

	}

}
