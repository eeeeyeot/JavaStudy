package day20201007;

import java.util.Scanner;

public class CountOfNumber2577
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		int[] arr = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		String str = String.format("%d",(num[0] * num[1] * num[2]));
		
		for(int i = 0; i < str.length(); i++) {
			arr[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		sc.close();
		
	}
}
