package day20201020;

import java.util.Scanner;

public class Loop3_142
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = 0;
		
		for(int i = 0; i < n * 2; i++) {
			if(i >= n)
				m--;
			else
				m++;
			
			for(int j = 0; j < m; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		sc.close();
	}
}
