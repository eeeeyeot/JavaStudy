package day20201019;

import java.util.Scanner;

public class Loop2_132
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i % 5 == 0)
				sum += i;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
