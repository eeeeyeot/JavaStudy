package day20201014;

import java.util.Scanner;

public class MakeFigure4_2046
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);

		int		n	= sc.nextInt();
		int		m	= sc.nextInt();

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				switch (m)
				{
					case 1:
						System.out.print((i + 1) + " ");
						break;

					case 2:
						if (i % 2 == 0)
						{
							System.out.print((j + 1) + " ");
						} else
						{
							System.out.print((n - j) + " ");
						}
						break;
					case 3:
						System.out.print(((i + 1) * (j + 1)) + " ");
						break;
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
