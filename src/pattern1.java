import java.util.Scanner;

/*
*author Pulkit Midha
*email midhapulkit28@gmail.com
*date 15-Jun-2019
*/
public class pattern1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		
		int r=1;
		while(r<=n)
		{
			int c = 2;
			while(c<=n)
			{
				System.out.print("*");
				c=c+1;
			}
			
			System.out.println("*");
			r = r + 1;
			
//			int row = 1;
//			while(row<=n+1)
//			{
//				System.out.println("*");
//				row=row+1;
//			}
					
		}

	}

}
