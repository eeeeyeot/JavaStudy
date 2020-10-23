package day20201019;

import java.util.Scanner;

public class Loop2_131
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
		
		for(int i = n; i <= m; i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
