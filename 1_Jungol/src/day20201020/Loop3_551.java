package day20201020;

import java.util.Scanner;

public class Loop3_551
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j - i >= 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
