package day20201014;

import java.util.Scanner;

public class CharSquare2_1314
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);

		int		n	= sc.nextInt();
		int		ch	= 'A';
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (j % 2 == 0)
				{
					ch = ('A' + i) + (n * j);
				} else
				{
					ch += (n * 2) - ((i + 1) * 2 - 1);

				}
				while (ch > 'Z')
					ch = ch - 'Z' + 'A' - 1;
				System.out.print((char) ch + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
//4 - 7
//65 72 73 80 
//66 71 74 79
//67 70 75 78
//68 69 76 77

//    0  1  2  3
//
// 0  0  7  1  7
// 1  0  5  3  5
// 2  0  3  5  3
// 3  0  1  7  1

//5 - 9
//65 74 75 84 85
//66 73 76 83 86
//67 72 77 82 87
//68 71 78 81 88
//69 70 79 80 89

//6 - 11
//65 76 77 88 89 100
//66 75 78 87 90 99
//67 74 79 86 91 98
//68 73 80 85 92 97
//69 72 81 84 93 96
//70 71 82 83 94 95
