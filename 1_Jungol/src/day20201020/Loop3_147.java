package day20201020;

import java.util.Scanner;

public class Loop3_147
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j >= i)
					System.out.print(++cnt + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
