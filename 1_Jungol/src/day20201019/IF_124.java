package day20201019;

import java.util.Scanner;

public class IF_124
{
	public static void main(String[] args)
	{
		Scanner	sc		= new Scanner(System.in);

		int[]	days	=
		{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int		n		= sc.nextInt();

		System.out.println(days[n - 1]);

		sc.close();

	}
}
