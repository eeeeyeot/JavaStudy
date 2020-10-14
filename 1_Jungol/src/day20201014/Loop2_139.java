package day20201014;

import java.util.Scanner;

public class Loop2_139
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int rev = 1;
		if(n > m)
		{
			rev *= -1;
		}
		
		for(int i = 1; i <= 9; i++) {
			for(int j = n; j != m + rev; j += rev) {
				System.out.print(j + " * " + i + " = ");
				System.out.printf("%2d   ", j * i);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
