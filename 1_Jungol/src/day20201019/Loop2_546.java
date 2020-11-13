package day20201019;

import java.util.Scanner;

public class Loop2_546
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += sc.nextInt();
		}
		
		System.out.printf("avg : %.1f\n", (double)sum / n);
		if(sum / n >= 80)
			System.out.println("pass");
		else
			System.out.println("fail");
		
		sc.close();
	}
}
