package kr.co.green;

public class For_Test6
{

	public static void main(String[] args)
	{
		int			cnt		= 0;
		int			num		= 0;
		final int	stdNum	= 4;
		boolean		reverse	= true;
		for (int i = 0; i < stdNum * 2; i++)
		{

			if (i < stdNum && reverse)
			{
				cnt++;
			} else if (i == stdNum && reverse)
			{
				reverse = !reverse;
			} else
			{
				cnt--;
			}

			for (int j = 0; j < cnt; j++)
			{
				System.out.print(++num + "\t");
			}

			System.out.println();
		}
	}
}