package day20201022;

import java.util.Scanner;

public class String2_189
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		
		for(int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);
		}
		
		sc.close();
	}
}
