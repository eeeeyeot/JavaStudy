package day20201019;

import java.util.Scanner;

public class Loop_128
{
	public static void main(String[] args)
	{
		Scanner	sc		= new Scanner(System.in);
		int		n;
		int cnt = 0;
		
		do
		{
			n = sc.nextInt();
			
			if(n % 3 != 0 && n % 5 != 0 && n != 0)
				cnt++;
			
		} while (n != 0);

		System.out.println(cnt);
		
		sc.close();
	}
}
