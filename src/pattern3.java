import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 15-Jun-2019
*/
public class pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int k=n;
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=k-1)
			{
			System.out.print("*");
	
				j = j+1;
			}
	   System.out.println("*");
			k = k-1;
			i=i+1;
			}

	}

}
