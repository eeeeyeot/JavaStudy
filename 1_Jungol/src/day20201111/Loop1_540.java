package day20201111;

import java.util.Scanner;

public class Loop1_540
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			n = sc.nextInt();
			
			if(n % 3 == 0)
				System.out.println(n / 3);
			
		}while(n != -1);
		
		sc.close();
	}
}
