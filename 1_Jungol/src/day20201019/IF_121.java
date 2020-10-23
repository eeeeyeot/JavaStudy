package day20201019;

import java.util.Scanner;

public class IF_121
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n > 0)
			System.out.println("plus");
		else if (n == 0)
			System.out.println("zero");
		else
			System.out.println("minus");
		
		sc.close();
	}
}
