package day20201022;

import java.util.Scanner;

public class Method2_179
{
	static double[] arr = new double[3];
	static double sum = 0;
	
	public static void main(String[] args)
	{
		input();
		
		func1();
		func2();
	}
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		sc.close();
	}
	
	static void func1() {
		sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(Math.round((sum / arr.length)));
	}
	
	static void func2() {
		sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += Math.round(arr[i]);
		}
		
		System.out.println(Math.round((sum / arr.length)));
	}
}
