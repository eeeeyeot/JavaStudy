package kr.co.green;

import java.util.Scanner;

public class OperatorEx8
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(checkFirstValue(arr))
			System.out.print("1");
		else
			System.out.print("0");
		
		if(checkSameValue(arr))
			System.out.print(" 1");
		else
			System.out.print(" 0");
		
		sc.close();
			
	}
	
	public static boolean checkFirstValue(int[] arr) {
		int tmp = 0;
		tmp = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(tmp < arr[i]) return false;
		}
		
		return true;
	}
	
	public static boolean checkSameValue(int[] arr) {
		int tmp = 0;
		tmp = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != tmp) return false;
		}
		
		
		return true;
	}

}
