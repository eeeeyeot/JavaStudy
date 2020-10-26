package day20201026;

import java.util.Scanner;

public class StarTriangle1_1523
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if((n < 1 || n > 100) || (m < 1 || m > 3))
		{
			System.out.println("INPUT ERROR!");
		}
		else {
			switch(m) {
				case 1:
					for(int i = 0; i < n; i++) {
						for(int j = 0; j < i + 1; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
				case 2:
					for(int i = 0; i < n; i++) {
						for(int j = 0; j < n - i; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
				case 3:
					for(int i = 0; i < n; i++) {
						for(int j = 0; j < n + i; j++) {
							if(j >= n - (i + 1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
						System.out.println();
					}
					break;
			}
		}
		
		sc.close();
	}
}
