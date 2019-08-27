import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 12-Jun-2019
*/
public class GCD {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int divisor = scn.nextInt();
		int divident = scn.nextInt();

			while(divident % divisor != 0)
			{
			int rem = divident % divisor;
					divident = divisor;
					divisor = rem;
					//System.out.println(divisor);
					
		}
System.out.println(divisor);
	}

}
