package day20201008;

import java.util.Scanner;

public class PlusCycle1110
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);

		String	N	= sc.next();
		String	str	= new String("");
		int		cnt	= 0;

		while (!str.equals(N))
		{
			if (str.equals(""))
				str = N;

			if (str.length() < 2)
			{
				str = "0" + str;
			}
			
			String[] s = str.split("");

			str = String.format("%d", (Integer.parseInt(s[0]) + Integer.parseInt(s[1])));
			str = s[1] + String.format("%c", str.charAt(str.length() - 1));
			
			if(str.charAt(0) == '0') {
				str = String.format("%c", str.charAt(1));
			}
			
			cnt++;
		}

		System.out.println(cnt);
		sc.close();
	}
}

//55
//5+5 = 10
//50
//5+0 = 5
//05
//0+5 = 5
//55
//10
//1+0 = 1
//2
//4
//8
//