package day20201014;

import java.util.Scanner;

public class Loop2_133
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += sc.nextInt();
		}
		
		System.out.printf("%.2f", (double)sum / n);
		
		sc.close();
	}
}
