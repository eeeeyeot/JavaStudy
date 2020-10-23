package kr.co.green;

import java.util.Scanner;

public class HoneyComb
{

	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);
		int		n	= sc.nextInt();
		int		i	= 2;
		int		k	= 1;

		if (n == 1)
			System.out.println(n);
		else
		{
			while (i <= n)
			{
				i += 6 * k++;
			}
			System.out.println(k);
		}
		
		sc.close();
	}

}
//Layer1
//2~7
//Layer2
//8~19
//Layer3
//20~37