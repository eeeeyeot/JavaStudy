package day20201027;

import java.util.Scanner;

public class Array2_564
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		while(true) {
			char c = sc.next().charAt(0);
			
			if(c > 90 || c < 65)
				break;
			
			arr[c - 'A']++;
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] != 0)
				System.out.println((char)('A' + i) + " : " + arr[i]);
		}
		
		sc.close();
	}
}
