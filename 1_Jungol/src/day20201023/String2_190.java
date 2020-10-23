package day20201023;

import java.util.Scanner;

public class String2_190
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] arr = {"flower", "rose", "lily", "daffodil", "azalea"};
		
		char c = sc.next().charAt(0);
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].charAt(1) == c || arr[i].charAt(2) == c) {
				System.out.println(arr[i]);
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
