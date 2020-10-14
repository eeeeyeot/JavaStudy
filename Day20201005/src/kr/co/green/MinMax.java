package kr.co.green;

import java.util.Scanner;

public class MinMax
{

	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);

		int[]	arr	= new int[sc.nextInt()];
		int		min	= 0;
		int		max	= 0;

		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
			
			if (i == 0)
			{
				min = arr[i];
				max = arr[i];
			} 
			else
			{
				if (min > arr[i]) min = arr[i];
				if (max < arr[i]) max = arr[i];
			}
		}
		System.out.println(min + " " + max);
		sc.close();
	}
}