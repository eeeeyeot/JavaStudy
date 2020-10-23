package day20201022;

import java.util.Scanner;

public class String1_187
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		StringBuffer str = new StringBuffer(sc.next());
		
		while(str.length() > 1) {
			int n = sc.nextInt();
			if(n > str.length())
				n = str.length();
			
			str.deleteCharAt(n - 1);
			System.out.println(str);
		}
		
		sc.close();
	}
}
