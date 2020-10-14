package kr.co.green;

import java.io.IOException;

public class WhileKeyControlExample
{

	public static void main(String[] args)
	{
		int	speed	= 0;
		int	keyCode	= 0;
		while (true)
		{
			if (keyCode != 13 && keyCode != 10)
			{
				System.out.println("----------");
				System.out.println("1.중속|2.감속|3.중지");
				System.out.println("----------");
				System.out.println("선택");
			}

			try
			{
				keyCode = System.in.read();
			} catch (IOException e)
			{
				e.printStackTrace();
			}

			if (keyCode == 49)
				System.out.println("현재속도 = " + (++speed));
			else if (keyCode == 50)
				System.out.println("현재속도 = " + (--speed));
			else if (keyCode == 51)
				break;

		}

		System.out.println("프로그램 종료");
	}

}
