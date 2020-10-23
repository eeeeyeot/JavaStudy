package day20201020;

import java.util.Scanner;

public class Loop3_550
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);

		int		n	= sc.nextInt();

		for (int i = 0; i < n * 2; i++)
		{
			if (i < n)
			{
				for (int j = n - i; j > 0; j--)
				{
					System.out.print("*");
				}
			} else
			{
				for (int j = 0; j < (i + 1) - n; j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
