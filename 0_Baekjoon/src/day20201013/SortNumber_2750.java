package day20201013;

import java.util.Scanner;

public class SortNumber_2750
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean[] arr = new boolean[2001];
		
		for(int i = 0; i < n; i++) {
			arr[sc.nextInt() + 1000] = true;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				System.out.println(i - 1000);
			}
		}
		
		sc.close();
	}
}
