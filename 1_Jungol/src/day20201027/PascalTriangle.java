package day20201027;

import java.util.Scanner;

public class PascalTriangle
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);
		int		n	= sc.nextInt();
		int		m	= sc.nextInt();
		int[][]	arr	= new int[n][];

		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = new int[i + 1];
		}

		arr[0][0] = 1;
		for (int i = 1; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				if (j == 0)
				{
					arr[i][j] = arr[i - 1][j];
				} else if (j == arr[i].length - 1)
				{
					arr[i][j] = arr[i - 1][j - 1];
				} else
				{
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}

		switch(m) {
			case 1:
				for (int i = 0; i < arr.length; i++)
				{
					for (int j = 0; j < arr[i].length; j++)
					{
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}		
				break;
			case 2:
				String str = "";
				for(int i = arr.length - 1; i >= 0; i--) {
					System.out.print(str);
					for(int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
					str += " ";
				}
				break;
			case 3:
				int cnt = 0;
				for(int i = arr.length - 1; i >= 0; i--) {
					for(int j = arr.length - 1; j >= arr.length - 1 - cnt; j--) {
						System.out.print(arr[j][i] + " ");
					}
					System.out.println();
					cnt++;
				}
				break;
		}
		
		sc.close();
	}
}
