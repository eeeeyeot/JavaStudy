package kr.co.green;

import java.util.Scanner;

public class CheckVPS
{

	public static void main(String[] args)
	{
		Scanner		sc		= new Scanner(System.in);

		int			T		= sc.nextInt();
		String[]	sArr	= null;
		
		for (int i = 0; i < T; i++)
		{
			int cnt = 0;
			sArr = sc.next().trim().split("");

			for (int j = 0; j < sArr.length; j++)
			{
				if (sArr[j].equals("(")) {
					cnt++;
				}
				else if (sArr[j].equals(")")) {
					cnt--;
					if(cnt < 0) {
						break;
					}
				}
			}
			
			if (cnt != 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

		sc.close();
	}
}