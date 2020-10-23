package day20201022;

import java.util.Scanner;

public class String2_609
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s;
		String[] str = new String[3];
		
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		
		s = str[0];
		
		for(int i = 1; i < str.length; i++) {
			for(int j = 0; j < str[i].length(); j++) {
				if(s.charAt(j) > str[i].charAt(j)) {
					s = str[i];
				}
				else if(s.charAt(j) < str[i].charAt(j))
					break;
				
				if(s.length() - 1 <= j || str[i].length() <= j) {
					break;
				}
			}
		}
		
		System.out.println(s);
		
		sc.close();
	}
}
