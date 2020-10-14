package day20201014;

import java.util.Scanner;

public class Loop2_135
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n > m)
		{
			int tmp = n;
			n = m;
			m = tmp;
		}
		
		int sum = 0;
		int cnt = 0;
		
		for(int i = n; i <= m; i++) 
		{
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
				cnt++;
			}
		}
		
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double)sum / cnt);
		
		sc.close();
	}
}
