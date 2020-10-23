package day20201020;

import java.util.Scanner;

public class IF_532
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		double scoreA = 4.0;
		double scoreB = 3.0;
		
		if(num1 >= scoreA && num2 >= scoreA)
			System.out.println("A");
		else if(num1 >= scoreB && num2 >= scoreB)
			System.out.println("B");
		else
			System.out.println("C");
		
		sc.close();
	}
}
