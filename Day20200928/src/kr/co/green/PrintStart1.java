package kr.co.green;

import java.util.Scanner;

public class PrintStart1
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		if (n >= 1 && n <= 100)
		{

			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		input.close();
	}
}
