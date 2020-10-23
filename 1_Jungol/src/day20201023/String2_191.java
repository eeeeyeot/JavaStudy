package day20201023;

import java.util.Scanner;

public class String2_191
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[51];
		int cnt = 0;
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = sc.next();
			
			if(arr[i].equals("0")) {
				break;
			}
			
			cnt++;
		}

		System.out.println(cnt);
		
		for(int i = 1; i <= cnt; i += 2) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
