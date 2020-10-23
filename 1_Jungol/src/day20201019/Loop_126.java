package day20201019;

import java.util.Scanner;

public class Loop_126
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int odd = 0;
		int even = 0;
		
		int n;
		
		do {
			n = sc.nextInt();
			if(n % 2 == 0 && n != 0)
				even++;
			else if (n % 2 != 0)
				odd++;
			
		}while(n != 0);
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		
		sc.close();
	}
}
