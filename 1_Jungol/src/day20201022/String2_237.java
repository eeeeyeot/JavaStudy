package day20201022;

import java.util.Scanner;

public class String2_237
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		double f = sc.nextDouble();
		String s = sc.next();
		
		s = String.format("%d", d) + String.format("%.3f", f) + s;
		
		if(s.length() % 2 != 0) {
			System.out.println(s.substring(0, s.length() / 2 + 1));
			System.out.println(s.substring(s.length() / 2 + 1, s.length()));
		}else {
			System.out.println(s.substring(0, s.length() / 2));
			System.out.println(s.substring(s.length() / 2, s.length()));
		}
		
		sc.close();
	}
}
