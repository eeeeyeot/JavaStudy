package day20201016;

import java.util.Scanner;

public class Sangsu_2908
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String a = Swap(sc.next().split(""));
		String b = Swap(sc.next().split(""));
		
		if(Integer.parseInt(a) > Integer.parseInt(b))
			System.out.println(a);
		else
			System.out.println(b);
		
		sc.close();
	}
	
	static String Swap(String[] str) {
		String tmp;
		
		tmp = str[0];
		str[0] = str[2];
		str[2] = tmp;
		
		String result = "";
		for(int i = 0; i < str.length; i++) {
			result += str[i];
		}
		
		return result;
	}
	
}
