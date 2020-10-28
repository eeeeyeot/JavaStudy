package day20201028;

import java.util.Scanner;

public class Array2_566
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = 100;
		int num2 = sc.nextInt();
		int value = num1;
		
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		
		while(value >= 0) {
			value = num1 - num2;
			num1 = num2;
			num2 = value;
			System.out.print(value + " ");
		}
		
		sc.close();
	}
}
