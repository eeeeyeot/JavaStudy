package day20201022;

import java.util.Scanner;

public class Method2_181
{
	static final double PI = 3.141592;
	static double r;
	
	
	public static void main(String[] args)
	{
		input();
		print();
	}
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("radius : ");
		
		r = sc.nextDouble();
		
		sc.close();
	}
	
	static void print() {
		System.out.printf("area = %.3f", getArea());
	}
	
	static final double getArea() {
		return r * r * PI;
	}
}
