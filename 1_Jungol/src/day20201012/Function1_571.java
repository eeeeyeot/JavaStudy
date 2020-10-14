package day20201012;

import java.util.Scanner;

public class Function1_571
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		print(sc.nextInt());
		sc.close();
	}
	
	static void print(int cnt) {
		for(int i = 0; i < cnt; i++) {
			System.out.println("~!@#$^&*()_+|");
		}
	}
}
