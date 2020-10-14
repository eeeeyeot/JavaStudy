package day20201008;

import java.util.Scanner;

public class Loop539
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		while(true)
		{
			int n = sc.nextInt();
			sum += n;
			cnt++;
			if(n >= 100)
				break;
		}
		
		System.out.println(sum + "\n" + String.format("%.1f", ((double)sum / cnt)));
		sc.close();
	}
}
