package day20201012;

import java.util.Scanner;

public class Function1_572
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%.2f", getCircleArea(sc.nextInt()));
		
		sc.close();
	}
	
	static double getCircleArea(int r) {
		return r * r * 3.14;
	}
}
