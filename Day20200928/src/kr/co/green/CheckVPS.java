package kr.co.green;

import java.util.Scanner;

public class CheckVPS
{

	public static void main(String[] args)
	{
		Scanner		sc		= new Scanner(System.in);

		int			n		= sc.nextInt();
		int[]		cnt		= new int[n];
		String[]	s_vps	= new String[n];
		String[]	sarr	= null;
		for (int i = 0; i < n; i++)
		{
			s_vps[i] = sc.next();
			if (s_vps[i].length() < 2 || s_vps[i].length() > 50)
				System.exit(0);
			sarr = s_vps[i].split("");

			for (int j = 0; j < sarr.length; j++)
			{
				if (sarr[j].equals("(")) {
					cnt[i]++;
					if(cnt[i] < 0)
						cnt[i] = -999;
				}
				else if (sarr[j].equals(")")) {
					cnt[i]--;
					if(cnt[i] < 0)
						cnt[i] = -999;
				}
			}
		}

		for (int i = 0; i < cnt.length; i++)
		{
			if (cnt[i] != 0 || cnt[i] < 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

		sc.close();
	}
}