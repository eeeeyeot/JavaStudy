package kr.co.green;

import java.util.Scanner;

public class PrintStar4
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		if(n >= 1 && n <= 100) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i > j)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
				
				System.out.println();
			}
		}
		
		input.close();
	}
}