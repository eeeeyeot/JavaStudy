package day20201016;

import java.util.Scanner;

public class SelectController_531
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		
		if(weight <= 50.80) 
		{
			System.out.print("Fly");
		}
		else if(weight <= 61.23)
		{
			System.out.print("Light");
		}
		else if(weight <= 72.57)
		{
			System.out.print("Middle");
		}
		else if(weight <= 88.45)
		{
			System.out.print("Cruiser");
		}
		else
			System.out.print("Heavy");
		
		System.out.println("weight");
		
		sc.close();
	}
}
