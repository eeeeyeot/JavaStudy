package day20201026;

import java.util.Scanner;

public class MultTable2_1341
{

	public static void main(String[] args)
	{
		Scanner	sc		= new Scanner(System.in);
		int		n		= sc.nextInt();
		int		m		= sc.nextInt();
		int		value	= 1;

		if (n > m)
			value = -1;
		
		for (int i = n; i != m + value; i += value)
		{
			for (int j = 1; j <= 9; j++)
			{
				System.out.printf("%d * %d = %2d   ", i, j, (i * j));
				if(j % 3 == 0)
					System.out.println();
			}
			System.out.println();
		}

		sc.close();
	}

}
