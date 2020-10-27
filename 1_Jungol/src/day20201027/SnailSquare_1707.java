package day20201027;

import java.util.Scanner;

public class SnailSquare_1707
{
	public static void main(String[] args)
	{
		Scanner	sc		= new Scanner(System.in);
		int		n		= sc.nextInt();
		int[][]	arr		= new int[n][n];
		int		cnt		= 0, x = 0, y = 0;

		int		value	= 0;

		for (int i = 0; i < n * 2 - 1; i++)
		{
			for (int j = i - value; j < n * 2 - 1; j += 2)
			{
				if (i % 4 == 0 && y + 1 < n)
				{
					y++;
				} else if (i % 4 == 1 && x + 1 < n)
				{
					x++;
				} else if (i % 4 == 2 && y - 1 > 0)
				{
					y--;
				} else if (i % 4 == 3 && x - 1 > 0)
				{
					x--;
				} else
					break;

				arr[x][y] = ++cnt;
			}
			if (i % 2 == 0)
				value = 1;
			else
				value = 0;
		}

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
