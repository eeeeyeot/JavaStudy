package day20201022;

import java.util.Scanner;

public class Method2_582
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double area = sc.nextDouble();
		
		area /= 3.14;
		
		System.out.printf("%.2f", Math.sqrt(area));
		
		
		sc.close();
	}
}
