package tmp;

public class Usa
{
	public static void main(String[] args)
	{

		int		num			= 0;
		int		cnt			= 0;
		int		stdNum		= 4;

		boolean	lineReverse	= false;

		for (num = 0; num >= 0;)
		{

			if (num < stdNum && !lineReverse)
				num++;
			else if (num == stdNum && !lineReverse)
				lineReverse = true;
			else
				num--;

			for (int j = 0; j < num; j++)
			{
				System.out.print(String.format("%2d", ++cnt));
				System.out.print(" ");
			}

			System.out.println();
		}
	}
}