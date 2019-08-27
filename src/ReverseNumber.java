import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 12-Jul-2019
*/
public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int digit= 1;
		int answer = 0;
		
		while(n!=0) {
			digit= n%10;
			answer = answer*10 + digit;
			n = n/10;
		}
		System.out.println(answer);
	}

}
