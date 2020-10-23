package day20201020;

import java.util.Scanner;

public class IF_529
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int weight = sc.nextInt();
		
		int Obesity = weight + 100 - height;
		System.out.println(Obesity);
		
		if(Obesity > 0)
			System.out.println("Obesity");
		
		sc.close();
	}
}
