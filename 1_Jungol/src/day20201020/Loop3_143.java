package day20201020;

import java.util.Scanner;

public class Loop3_143
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i < n * 2; i++) {
			if(i <= n)
				for(int j = 1; j <= n * 2 - i; j++) {
					if(j >= i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			else
				for(int j = 1; j <= i; j++) {
					if(j >= n * 2 - i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
			System.out.println();
		}
		
		sc.close();
	}
}
