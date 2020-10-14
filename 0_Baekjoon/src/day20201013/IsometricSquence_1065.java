package day20201013;

import java.util.Scanner;

public class IsometricSquence_1065
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);
		int		n	= sc.nextInt();
		int		cnt	= 0;
		
		for (int i = 1; i <= n; i++)
		{
			int[] arr = getSplitNum(i);
			if (arr.length < 3)
				cnt++;
			else
			{
				int		sub			= 0;
				boolean	isIsometric	= true;
				for (int j = arr.length - 1; j > 0; j--)
				{
					if (j == arr.length - 1)
						sub = arr[j] - arr[j - 1];
					else if (arr[j] - arr[j - 1] != sub)
					{
						isIsometric = false;
						break;
					}
				}
				if (isIsometric)
					cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();

	}

	static int[] getSplitNum(int n)
	{
		String[]	str	= String.format("%d", n).split("");
		int[]		arr	= new int[str.length];
		for (int i = 0; i < str.length; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}

		return arr;
	}
}
