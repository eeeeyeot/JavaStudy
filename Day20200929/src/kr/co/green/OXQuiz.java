package kr.co.green;

import java.util.Scanner;

public class OXQuiz
{

	public static void main(String[] args)
	{
		Scanner		sc		= new Scanner(System.in);

		int			num		= sc.nextInt();
		String[]	str		= new String[num];
		String[][]	answers	= new String[num][];
		for (int i = 0; i < num; i++)
		{
			str[i] = sc.next();
			answers[i] = new String[str[i].length()];

			answers[i] = str[i].split("");
		}

		int		stackNum	= 1;
		int[]	scores		= new int[num];

		for (int i = 0; i < answers.length; i++)
		{
			stackNum = 1;
			for (int j = 0; j < answers[i].length; j++)
			{
				if (answers[i][j].equals("O"))
				{
					scores[i] += stackNum;
					stackNum++;
				} else if (answers[i][j].equals("X"))
				{
					stackNum = 1;
				}
			}
		}

		for (int i = 0; i < scores.length; i++)
		{
			System.out.println(scores[i]);
		}

		sc.close();
	}

}
