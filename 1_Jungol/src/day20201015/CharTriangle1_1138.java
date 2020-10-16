package day20201015;

import java.util.Scanner;

public class CharTriangle1_1138
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);

		int		n	= sc.nextInt();
		int		ch	= 'A';
		int[][]	arr	= new int[n][n];
		sc.close();
		
		//Hint 참고
		for (int i = 0; i < n; i++)
		{
			for (int j = i, k = n - 1; j < n; j++, k--)
			{
				arr[j][k] = ch++;
				if (ch > 'Z')
					ch = 'A';
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] != 0)
					System.out.print((char) arr[i][j] + " ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}
	}
}