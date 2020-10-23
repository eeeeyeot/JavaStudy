package day20201020;

import java.util.Scanner;

public class IF_528
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(n < 0 ? n + "\nminus" : n);
		
		sc.close();
	}
}
