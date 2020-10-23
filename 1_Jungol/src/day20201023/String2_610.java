package day20201023;

import java.util.Scanner;

public class String2_610
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) < 0)
				{
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
	}
}
