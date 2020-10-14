package day20201013;

import java.util.Scanner;

public class MakeFigure2_1856
{

	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);

		int		n	= sc.nextInt();
		int		m	= sc.nextInt();
		int		cnt	= 1;
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if (i % 2 != 0)
					System.out.print(((m * 2 * i) + (m + 1) - cnt++) + " ");
				else
					System.out.print(cnt++ + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
