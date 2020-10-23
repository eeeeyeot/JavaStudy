package day20201020;

import java.util.Scanner;

public class IF_120
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println((n - m) > 0 ? (n - m) : (n - m) * -1);
		
		sc.close();
	}
}
