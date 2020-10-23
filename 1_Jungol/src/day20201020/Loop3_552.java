package day20201020;

import java.util.Scanner;

public class Loop3_552
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n * 2 - i; j++) {
				if(j >= i ) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
