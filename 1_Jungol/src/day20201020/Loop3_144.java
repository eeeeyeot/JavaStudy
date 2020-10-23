package day20201020;

import java.util.Scanner;

public class Loop3_144
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = n - 1; i >= 0; i--) {
			for(int j = 1; j < n * 2; j++) {
				if(i * 2 + 1 <= j) {
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
