package day20201022;

import java.util.Scanner;

public class String2_194
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		StringBuffer s1 = new StringBuffer(sc.next());
		StringBuffer s2 = new StringBuffer(sc.next());
		int n = sc.nextInt();

		s1.append(s2);
		
		System.out.println(s1);
		System.out.println(s2.replace(0, n, s1.substring(0, n)));
		
		sc.close();
	}
}
