package day20201021;

import java.util.Scanner;

public class Method2_581
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[4];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		System.out.println((Math.abs(arr[0]) > Math.abs(arr[1])) ? (int)arr[0] : (int)arr[1] );
		System.out.printf("%.2f" ,(Math.abs(arr[2]) < Math.abs(arr[3])) ? arr[2] : arr[3] );
		
		sc.close();
	}
}
