package day20201012;

import java.util.Scanner;

public class Loop_127
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int sum = 0;
		int cnt = 0;
		
		while(true) {
			n = sc.nextInt();
			if(n > 100 || n < 0) {
				break;
			}
			sum += n;
			cnt++;
		}
		
		System.out.println("sum : " + (sum));
		System.out.printf("avg : %.1f\n", ((double)sum / cnt));
		
		sc.close();
	}

}
