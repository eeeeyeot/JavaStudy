package day20201019;

import java.util.Scanner;

public class IF_122
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
			System.out.println("leap year");
		else
			System.out.println("common year");
		
		sc.close();
	}
}
