package sumusingloop;

public class SumLoop {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum = sum + num;
		num=  num++;
		}
System.out.println(sum);
	}

}
