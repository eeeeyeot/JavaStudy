package day20201013;

import java.util.Scanner;

public class Array_155
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[] {'J', 'U', 'N', 'G', 'O', 'L'};
		char c = sc.next().charAt(0);
		
		findChar(arr, c);
		
		sc.close();
	}
	
	static void findChar(char[] arr, char c)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == c)
			{
				System.out.println(i);
				return;
			}
		}
		System.out.println("none");
	}
}
