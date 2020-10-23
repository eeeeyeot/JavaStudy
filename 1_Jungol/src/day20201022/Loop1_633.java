package day20201022;

import java.util.Scanner;

public class Loop1_633
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);
		int		n	= 0;
		while (true)
		{
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			n = sc.nextInt();
			System.out.println();

			if (n == 1)
			{
				System.out.println("Seoul");
			} else if (n == 2)
			{
				System.out.println("Washington");
			} else if (n == 3)
			{
				System.out.println("Tokyo");
			} else if (n == 4)
			{
				System.out.println("Beijing");
			} else
			{
				System.out.println("none");
				break;
			}
			System.out.println();
		}
		sc.close();
	}
}
