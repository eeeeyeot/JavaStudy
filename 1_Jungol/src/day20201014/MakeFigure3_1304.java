package day20201014;

import java.util.Scanner;

public class MakeFigure3_1304
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			for(int j = 1; j < n; j++) {
				System.out.print(i + (j * n) + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
