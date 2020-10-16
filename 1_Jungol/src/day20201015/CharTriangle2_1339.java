package day20201015;

import java.util.Scanner;

public class CharTriangle2_1339
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);

		int		n	= sc.nextInt();
		if (n % 2 != 0 && n >= 1 && n <= 100)
		{
			int[][]	arr	= new int[n][n];
			char	ch	= 'A';
			for (int i = n / 2; i >= 0; i--)
			{
				for (int j = i; j <= (n / 2) * 2 - i; j++)
				{
					if (ch > 'Z')
						ch = 'A';
					arr[j][i] = ch++;
				}
			}

			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if(arr[i][j] != 0)
						System.out.printf("%c ",(char)arr[i][j]);
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
		else 
		{
			System.out.println("INPUT ERROR");
		}
		
		sc.close();
	}
}
