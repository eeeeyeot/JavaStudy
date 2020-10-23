package day20201022;

import java.util.Scanner;

public class String2_611
{
	public static void main(String[] args)
	{
		Scanner	sc	= new Scanner(System.in);
		String	s	= sc.next();
		String s1 	= "";
		boolean hasDot = false;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '.' && !hasDot) {
				s1 += s.charAt(i);
				hasDot = true;
			}
			else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				s1 += s.charAt(i);
			}
			else
			{
				break;
			}
		}
		
		System.out.printf("%d\n", (int) (Double.parseDouble(s1) * 2));
		System.out.printf("%.2f", Double.parseDouble(s1));
		sc.close();
	}
}