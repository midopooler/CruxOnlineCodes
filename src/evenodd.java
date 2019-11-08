//import java.util.Scanner;
//package evenodd;
//
//public class evenodd {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//
//		if (n % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
//	}
//
//}

import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}