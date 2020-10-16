package day20201016;

import java.util.Scanner;

public class Function3_588
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		print(sc.nextInt());
		
		sc.close();
	}
	
	static void print(int n) {
		if(n <= 0) return;
		
		print(n - 1);
		System.out.println(n);
		
	}
}
